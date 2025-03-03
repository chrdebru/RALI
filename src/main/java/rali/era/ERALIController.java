/**
 * @author Christophe Debruyne <c.debruyne@uliege.be> Université de Liège
 */

package rali.era;

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

import org.antlr.v4.runtime.BailErrorStrategy;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.antlr.v4.runtime.tree.ParseTree;
import org.h2.jdbc.JdbcSQLSyntaxErrorException;

import com.github.freva.asciitable.AsciiTable;

import rali.antlr4.ERALILexer;
import rali.antlr4.ERALIParser;
import rali.util.Either;
import rali.util.Left;
import rali.util.Right;

public class ERALIController {
	
	private static ERALIController instance = null;

	private static String CONNECTIONURL = "jdbc:h2:mem:rali;MODE=PostgreSQL";
	private static Connection connection = null;
	
	private static Map<String, String> types = new HashMap<String, String>();
	
	private ERALIController() {
		types.put("INTEGER", "INTEGER");
		types.put("DECIMAL", "DOUBLE PRECISION");
		types.put("STRING", "VARCHAR(255)");
		types.put("DATE", "DATE");
	}
	
	public static ERALIController getInstance() {
		if(instance == null)
			instance = new ERALIController();
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
							if(!types.containsKey(atttype)) {
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
							+ String.join(", ", attributes) + ") AS SELECT * FROM "
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
		try {
			if (command != null && !command.endsWith(";"))
				command += ";";

			CharStream is = CharStreams.fromString(command);
			ERALILexer lexer = new ERALILexer(is);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			ERALIParser parser = new ERALIParser(tokens);
			parser.setErrorHandler(new BailErrorStrategy());
			ParseTree tree = parser.statement();
			ERALIVisitorImp visitor = new ERALIVisitorImp(connection);
			String instruction = visitor.visit(tree);
			
			if(instruction == null)
				return new Right("");
			
			checkConstainsError(instruction);
			ResultSet rs = connection.createStatement().executeQuery(instruction);
			return new Right(toASCIITable(rs));
		} catch(ParseCancellationException e) {
			return new Left("Error in ERALI expression.");
		} catch (JdbcSQLSyntaxErrorException e) {
			String msg = switch (e.getErrorCode()) {
                case 21002 -> "Schemas do not match.";
                case 42102 -> {
                    String rel = e.getOriginalMessage().replace("Table \"", "").replace("\" not found", "");
                    yield "Referring to relation that does not exist: " + rel;
                }
                case 42121 -> "Duplicate attribute names (in Cartesian Product)";
                case 42122 -> {
                    String att = e.getOriginalMessage().replace("Column \"", "").replace("\" not found", "");
                    yield "Attribute not found: " + att;
                }
                default -> {
                    e.printStackTrace();
                    yield "Something went wrong.";
                }
            };
            return new Left(msg);
		} catch(Exception e) {
			String msg = e.getMessage();
			msg = msg.replace("Syntax error in SQL statement \"[*][[ERROR: ", "");
			
			if(msg.contains("already exists")) {
				msg = msg.replace("Problem creating constant relation: View \"", "");
				int i = msg.indexOf("\"");
				msg = "Relation already exists: " + msg.substring(0, i);
			}
			else if(msg.contains("Division by zero")) {
				msg = "Division by zero in one of the expressions.";
			}
			else if(msg.contains("Feature not supported")) {
				msg = "Arithmetic expressions on strings and dates are not supported.";
			}
			
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
				record[i] = rs.getObject(i + 1) == null ? "NULL" : rs.getObject(i + 1).toString();
			}
			records.add(record);
		}
		
		// If the result set is empty, then only show the headers
		if(records.isEmpty()) {
			Object[][] tmp = { headers };
			return AsciiTable.getTable(tmp);
		}

		return AsciiTable.getTable(headers, records.toArray(new Object[1][1]));
	}

}
