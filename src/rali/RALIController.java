package rali;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.h2.jdbc.JdbcSQLSyntaxErrorException;

import com.github.freva.asciitable.AsciiTable;

import antlr4.RALILexer;
import antlr4.RALIParser;
import rali.util.Either;
import rali.util.Left;
import rali.util.Right;

public class RALIController {
	
	private static RALIController instance = null;
	
	private static String CONNECTIONURL = "jdbc:h2:mem:rali";
	private static Connection connection = null;
	
	private static Map<String, String> types = new HashMap<String, String>();
	
	private RALIController() {
		types.put("INTEGER", "INTEGER");
		types.put("DECIMAL", "DOUBLE PRECISION");
		types.put("STRING", "VARCHAR(255)");
		types.put("DATE", "DATE");
	}
	
	public static RALIController getInstance() {
		if(instance == null)
			instance = new RALIController();
		return instance;
	}
	
	public void createDatabaseAndLoadData() throws Exception {
		DriverManager.getConnection(CONNECTIONURL).close();

		connection = DriverManager.getConnection(CONNECTIONURL);

		Statement statement = connection.createStatement();
		// Delete all objects
		statement.execute("DROP ALL OBJECTS;");

		for (final File f : new File("./").listFiles()) {
			if (f.getName().toUpperCase().endsWith(".CSV")) {
				String name = f.getName().toUpperCase().replace(".CSV", "").replaceAll("[^a-zA-Z0-9]", "");

				try {
					// first get the names and datatypes of tables
					String[] headers = Files.lines(Paths.get(f.getCanonicalPath()))
						    .map(s -> s.split(","))
						    .findFirst()
						    .get();
					
					List<String> attributes = new ArrayList<String>();
					String[] split;
					for (String header : headers) {
						if(header.contains(":")) {
							split = header.split(":");
							String attname = split[0].toUpperCase().trim();
							String atttype = split[1].toUpperCase().trim();
							if(!types.keySet().contains(atttype)) {
								System.err.printf("%s is not a valid data type.", atttype);
								throw new Exception();
							} else {
								attributes.add(attname + " " + types.get(atttype));
							}
						} else {
							attributes.add(header.toUpperCase().trim() + " " + types.get("STRING"));
						}
					}
					
					String sql = "CREATE TABLE " + name + "(" 
							+ String.join(", ", attributes) + ") AS SELECT DISTINCT * FROM "
							+ "CSVREAD('" + f.getCanonicalPath()
							+ "', NULL, NULL);";
					
					statement.execute(sql);
										
					System.out.printf("Relation %s created.", name);
					System.out.println();
				} catch (Exception e) {
					e.printStackTrace();
					System.err.printf("Something went wrong reading: %s Skipping file.", f.getName());
					System.err.println();
				}
			}
		}
		statement.close();
	}
	
	public Either execute(String command) throws SQLException {
		CharStream is = CharStreams.fromString(command);
		RALILexer lexer = new RALILexer(is);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		RALIParser parser = new RALIParser(tokens);
		ParseTree tree = parser.statement();
		RALIVisitorImp visitor = new RALIVisitorImp(connection);
		String instruction = visitor.visit(tree);
		
		if(instruction == null)
			return new Right("");
		
		try {
			//System.err.println(instruction);
			checkConstainsError(instruction);
			ResultSet rs = connection.createStatement().executeQuery(instruction);
			return new Right(toASCIITable(rs));
		} catch (JdbcSQLSyntaxErrorException e) {
			String msg = null;
			switch (e.getErrorCode()) {
				case 21002:
					msg = "Schemas do not match.";
					break;
				case 42102:
					String rel = e.getOriginalMessage().replace("Table \"", "").replace("\" not found", "");
					msg = "Referring to relation that does not exist: " + rel;
					break;
				case 42121:
					msg = "Duplicate attribute names (in Cartesian Product)";
					break;
				case 42122:
					String att = e.getOriginalMessage().replace("Column \"", "").replace("\" not found", "");
					msg = "Attribute not found: " + att;
					break;
				default:
					msg = "Something went wrong.";
			}
			
			return new Left(msg);
		} catch(Exception e) {
			String msg = e.getMessage();
			msg = msg.replace("Syntax error in SQL statement \"[*][[ERROR: ", "");
			return new Left(msg);
		}
		
	}

	private void checkConstainsError(String instruction) throws Exception {
		Pattern pattern = Pattern.compile("\\[\\[ERROR: (.*)\\]\\]", Pattern.CASE_INSENSITIVE);
	    Matcher matcher = pattern.matcher(instruction);
	    if(matcher.find())
	    	throw new Exception(matcher.group(1));
	}

	public String toASCIITable(ResultSet rs) throws SQLException {
		int columnCount = rs.getMetaData().getColumnCount();

		String[] headers = new String[columnCount];
		for(int i = 0; i < columnCount; i++) {
			String type = "";
			if(rs.getMetaData().getColumnType(i + 1) != Types.VARCHAR) {
				type = " : " + rs.getMetaData().getColumnTypeName(i + 1);
			}
			
			headers[i] = rs.getMetaData().getColumnName(i + 1) + type;
		}
		
		List<Object[]> records = new ArrayList<Object[]>();
		Object[] record = null;
		while(rs.next()) {
			record = new String[columnCount];
			for(int i = 0; i < columnCount; i++) {
				record[i] = rs.getObject(i + 1).toString();
			}
			records.add(record);
		}
		
		// If the result set is empty, then only show the headers
		if(records.size() == 0) {
			Object[][] tmp = { headers };
			return AsciiTable.getTable(tmp);
		}

		return AsciiTable.getTable(headers, records.toArray(new Object[1][1]));
	}

}
