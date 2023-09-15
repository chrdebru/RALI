package rali;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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

import antlr4.RALILexer;
import antlr4.RALIParser;

public class Main {

	private static String CONNECTIONURL = "jdbc:h2:mem:rali";
	private static Connection connection = null;
	private static Map<String, String> types = new HashMap<String, String>();
	

	public static void main(String[] args) {

		types.put("INTEGER", "INTEGER");
		types.put("DECIMAL", "DOUBLE PRECISION");
		types.put("STRING", "VARCHAR(255)");
		types.put("DATE", "DATE");

		try {
			createDatabaseAndLoadData();
			
			
//			execute("ENROLLMENTS JOIN (ENROLLMENTS DIVISION DIVTEST)");
//			execute("ENROLLMENTS JOIN [STUDENT_ID : INTEGER, TEST]{(001,\"foo\"), (002, \"bar\")}");
			execute("[STUDENT_ID : INTEGER, TEST]{(001,\"foo\")}");
			execute("FOO = [STUDENT_ID : INTEGER, TEST]{(001,\"foo\")}");
			execute("BAR = ENROLLMENTS");
			

//			Scanner commands = new Scanner(System.in);
//			while (true) {
//				String command = commands.next();
//				if (":quit".equals(command.toLowerCase()))
//					break;
//				
//				execute(command);
//				
//			}
//			commands.close();
		} catch (Exception e) {
			System.err.printf("Encountered error: %s", e.getMessage());
			System.err.println(e);
			e.printStackTrace();
			System.err.println("Termninating program.");
		}

	}

	private static void execute(String command) throws SQLException {
		CharStream is = CharStreams.fromString(command);
		RALILexer lexer = new RALILexer(is);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		RALIParser parser = new RALIParser(tokens);
		ParseTree tree = parser.statement();
		RALIVisitorImp visitor = new RALIVisitorImp(connection);
		String instruction = visitor.visit(tree);
		
		if(instruction == null)
			return;
		
		try {
			// System.err.println(instruction);
			checkConstainsError(instruction);
			System.out.println(instruction);
			ResultSet rs = connection.createStatement().executeQuery(instruction);
			System.out.println(Util.toASCIITable(rs));
		} catch (JdbcSQLSyntaxErrorException e) {
			switch (e.getErrorCode()) {
				case 21002:
					System.out.println("Schemas do not match.");
					break;
				case 42102:
					String rel = e.getOriginalMessage().replace("Table \"", "").replace("\" not found", "");
					System.out.println("Referring to relation that does not exist: " + rel);
					break;
				case 42121:
					System.out.println("Duplicate attribute names (in Cartesian Product)");
					break;
				default:
					System.out.println("Something went wrong.");
			}
		} catch(Exception e) {
			String msg = e.getMessage();
			msg = msg.replace("Syntax error in SQL statement \"[*][[ERROR: ", "");
			System.out.println(msg);
		}
		
	}

	private static void checkConstainsError(String instruction) throws Exception {
		Pattern pattern = Pattern.compile("\\[\\[ERROR: (.*)\\]\\]", Pattern.CASE_INSENSITIVE);
	    Matcher matcher = pattern.matcher(instruction);
	    if(matcher.find())
	    	throw new Exception(matcher.group(1));
	}

	private static void createDatabaseAndLoadData() throws Exception {
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
}
