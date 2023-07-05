package rali;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashSet;

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

	public static void main(String[] args) {

		try {
			createDatabaseAndLoadData();
			
//			execute("STUDENTS");
//			execute("(COURSES)");
//			execute("STUDENTS UNION STUDENTS2");
//			execute("(STUDENTS UNION STUDENTS2)");
//			execute("STUDENTS INTERSECT STUDENTS2");
//			execute("STUDENTS JOIN STUDENTS2");
//			execute("STUDENTS JOIN ENROLLMENTS");
//			execute("STUDENTS JOIN ENROLLMENTS JOIN COURSES");
//			execute("STUDENTS JOIN COURSES");			
//			execute("STUDENTS TIMES STUDENTS2");
//			execute("(STUDENTS TIMES ENROLLMENTS)");
//			execute("STUDENTS TIMES ENROLLMENTS TIMES COURSES");
//			execute("STUDENTS TIMES COURSES");

			//execute("STUDENTS MINUS STUDENTS2");
			//execute("STUDENTS2 MINUS STUDENTS");
			execute("STUDENTS MINUS STUDENTS TIMES STUDENTS");
			
			

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
			System.err.println("Termninating program.");
		}

	}

	private static void execute(String command) throws SQLException {
		CharStream is = CharStreams.fromString(command);
		RALILexer lexer = new RALILexer(is);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		RALIParser parser = new RALIParser(tokens);
		ParseTree tree = parser.expression();
		RALIVisitorImp visitor = new RALIVisitorImp();
		String instruction = visitor.visit(tree);
		
		if(instruction == null)
			return;
		
		try {
			System.err.println(instruction);
			ResultSet rs = connection.createStatement().executeQuery(instruction);
			
			// We do not allow attributes with the same name in the final relation
			ArrayList<String> names = new ArrayList<String>();
			for(int i = 1; i <= rs.getMetaData().getColumnCount(); i++)
				names.add(rs.getMetaData().getColumnName(i));
			
			if(names.size() > new HashSet<String>(names).size())
				throw new JdbcSQLSyntaxErrorException("", "", "", 42121, null, "");
			
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
			System.out.println(e.getErrorCode());
		}
		
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
					String sql = "CREATE TABLE " + name + " AS SELECT DISTINCT * FROM CSVREAD('" + f.getCanonicalPath()
							+ "', NULL, NULL);";
					statement.execute(sql);
					System.out.printf("Relation %s created.", name);
					System.out.println();
				} catch (Exception e) {
					System.err.printf("Something went wrong reading: %s Skipping file.", f.getName());
					System.err.println();
				}
			}
		}
		statement.close();
	}
}
