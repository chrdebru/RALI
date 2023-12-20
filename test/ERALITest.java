import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.sql.SQLException;

import org.junit.Before;
import org.junit.Test;

import erali.ERALIController;
import rali.util.Either;
import rali.util.Left;

public class ERALITest {

	private ERALIController rc = null;

	@Before
	public void setUp() throws Exception {
		rc = ERALIController.getInstance();

		// Creating the in-memory tables
		rc.createDatabaseAndLoadData();
		rc.execute("STUDENTS = [STUDENT_ID : INTEGER,  NAME, AGE : INTEGER, MAJOR]{(1,\"Alice\",20,\"CS\"),(2,\"Bob\",21,\"Math\"),(3,\"Claire\",19,\"Bio\"),(4,\"David\",22,\"Econ\"),(5,\"Emily\",20,\"CS\")}");
		rc.execute("STUDENTS2 = [STUDENT_ID : INTEGER,  NAME, AGE : INTEGER, MAJOR]{(4,\"David\",22,\"Econ\"),(5,\"Emily\",20,\"CS\"),(6,\"Chris\",25,\"CS\")}");
		rc.execute("COURSES = [COURSE_ID : INTEGER,  COURSE_NAME, INSTRUCTOR]{(101,\"Calculus\",\"Smith\"),(102,\"Biology\",\"Johnson\"),(103,\"Computer Science\",\"Lee\"),(104,\"Microeconomics\",\"Chen\"),(105,\"English\",\"Davis\")}");
		rc.execute("ENROLLMENTS = [STUDENT_ID : INTEGER, COURSE_ID : INTEGER]{(1,101),(1,103),(2,101),(2,102),(3,102),(4,104),(5,101),(5,103)}");
		rc.execute("DIVTEST = [COURSE_ID : INTEGER]{(101),(103)}");
		
		rc.execute("R = [A,B,C]{(\"a\",\"b\",\"c\"),(\"d\",\"a\",\"f\"),(\"c\",\"b\",\"d\")}");
		rc.execute("S = [A,B,C]{(\"b\",\"g\",\"a\"),(\"d\",\"a\",\"f\")}");
		rc.execute("T = [D,E]{(\"a\",\"b\"),(\"c\",\"d\")}");
		rc.execute("V = [D,E,F:INTEGER]{(\"b\",\"g\",1),(\"d\",\"a\",2)}");
		rc.execute("U = [B,G:INTEGER]{(\"a\",1),(\"c\",2)}");
		rc.execute("X = [A,B,C,D]{(\"a\",\"b\",\"c\",\"d\"),(\"a\",\"b\",\"e\",\"f\"),(\"g\",\"h\",\"c\",\"d\"),(\"i\",\"j\",\"k\",\"l\")}");
		rc.execute("Y = [C,D]{(\"c\",\"d\"),(\"e\",\"f\")}");
	}

	@Test
	public void testProduct() throws SQLException {
		String expected = null;
		Either e = null;

		expected = "+-------------+-------------+\r\n"
				+ "| A : INTEGER | B : INTEGER |\r\n"
				+ "+-------------+-------------+\r\n"
				+ "|           1 |           3 |\r\n"
				+ "+-------------+-------------+\r\n"
				+ "|           1 |           4 |\r\n"
				+ "+-------------+-------------+\r\n"
				+ "|           1 |           4 |\r\n"
				+ "+-------------+-------------+\r\n"
				+ "|           2 |           3 |\r\n"
				+ "+-------------+-------------+\r\n"
				+ "|           2 |           4 |\r\n"
				+ "+-------------+-------------+\r\n"
				+ "|           2 |           4 |\r\n"
				+ "+-------------+-------------+\r\n"
				+ "|           1 |           3 |\r\n"
				+ "+-------------+-------------+\r\n"
				+ "|           1 |           4 |\r\n"
				+ "+-------------+-------------+\r\n"
				+ "|           1 |           4 |\r\n"
				+ "+-------------+-------------+";
		e = rc.execute("[A : INTEGER]{(1),(2),(1)} PRODUCT [B : INTEGER]{(3),(4),(4)}");	
		assertEquals(expected, e.get().toString());
	}

	@Test
	public void testUnion() throws SQLException {
		String expected = null;
		Either e = null;

		expected = "+-------------+\r\n"
				+ "| A : INTEGER |\r\n"
				+ "+-------------+\r\n"
				+ "|           1 |\r\n"
				+ "+-------------+\r\n"
				+ "|           2 |\r\n"
				+ "+-------------+\r\n"
				+ "|           1 |\r\n"
				+ "+-------------+\r\n"
				+ "|           3 |\r\n"
				+ "+-------------+\r\n"
				+ "|           4 |\r\n"
				+ "+-------------+\r\n"
				+ "|           4 |\r\n"
				+ "+-------------+";
		
		e = rc.execute("[A : INTEGER]{(1),(2),(1)} UNION [A : INTEGER]{(3),(4),(4)}");	
		assertEquals(expected, e.get().toString());
		
		e = rc.execute("STUDENTS UNION ENROLLMENTS");
		assertTrue(e instanceof Left);
	}
	
	@Test
	public void testIntersection() throws SQLException {
		String expected = null;
		Either e = null;

		expected = "+-------------+\r\n"
				+ "| A : INTEGER |\r\n"
				+ "+-------------+\r\n"
				+ "|           1 |\r\n"
				+ "+-------------+\r\n"
				+ "|           4 |\r\n"
				+ "+-------------+\r\n"
				+ "|           4 |\r\n"
				+ "+-------------+";
		
		e = rc.execute("[A : INTEGER]{(1),(2),(4),(1),(4)} INTERSECTION [A : INTEGER]{(3),(4),(1),(4),(4)}");	
		assertEquals(expected, e.get().toString());
		
		expected = "+-------------+-------------+\r\n"
				+ "| A : INTEGER | B : INTEGER |\r\n"
				+ "+-------------+-------------+\r\n"
				+ "|           1 |           1 |\r\n"
				+ "+-------------+-------------+\r\n"
				+ "|           4 |           4 |\r\n"
				+ "+-------------+-------------+\r\n"
				+ "|           4 |           4 |\r\n"
				+ "+-------------+-------------+";
		
		e = rc.execute("[A : INTEGER, B : INTEGER]{(1,1),(2,2),(4,4),(1,1),(4,4)} INTERSECTION [A : INTEGER, B : INTEGER]{(3,3),(4,4),(1,1),(4,4),(4,4)}");	
		assertEquals(expected, e.get().toString());
		
		e = rc.execute("STUDENTS UNION ENROLLMENTS");
		assertTrue(e instanceof Left);
	}
	
	
	@Test
	public void testDifference() throws SQLException {
		String expected = null;
		Either e = null;

		expected = "+-------------+\r\n"
				+ "| A : INTEGER |\r\n"
				+ "+-------------+\r\n"
				+ "|           2 |\r\n"
				+ "+-------------+\r\n"
				+ "|           1 |\r\n"
				+ "+-------------+";
		
		e = rc.execute("[A : INTEGER]{(1),(2),(4),(1),(4)} MINUS [A : INTEGER]{(3),(4),(1),(4),(4)}");	
		assertEquals(expected, e.get().toString());
		
		expected = "+-------------+-------------+\r\n"
				+ "| A : INTEGER | B : INTEGER |\r\n"
				+ "+-------------+-------------+\r\n"
				+ "|           2 |           2 |\r\n"
				+ "+-------------+-------------+\r\n"
				+ "|           1 |           1 |\r\n"
				+ "+-------------+-------------+";
		
		e = rc.execute("[A : INTEGER, B : INTEGER]{(1,1),(2,2),(4,4),(1,1),(4,4)} MINUS [A : INTEGER, B : INTEGER]{(3,3),(4,4),(1,1),(4,4),(4,4)}");	
		assertEquals(expected, e.get().toString());
	}
	
	@Test
	public void testNULL() throws SQLException {
		String expected = null;
		Either e = null;

		expected = "+-------------+-------------+\r\n"
				+ "| A : INTEGER | B : INTEGER |\r\n"
				+ "+-------------+-------------+\r\n"
				+ "|           1 |           3 |\r\n"
				+ "+-------------+-------------+\r\n"
				+ "|           1 |        NULL |\r\n"
				+ "+-------------+-------------+\r\n"
				+ "|           1 |           4 |\r\n"
				+ "+-------------+-------------+\r\n"
				+ "|           2 |           3 |\r\n"
				+ "+-------------+-------------+\r\n"
				+ "|           2 |        NULL |\r\n"
				+ "+-------------+-------------+\r\n"
				+ "|           2 |           4 |\r\n"
				+ "+-------------+-------------+\r\n"
				+ "|        NULL |           3 |\r\n"
				+ "+-------------+-------------+\r\n"
				+ "|        NULL |        NULL |\r\n"
				+ "+-------------+-------------+\r\n"
				+ "|        NULL |           4 |\r\n"
				+ "+-------------+-------------+";
		e = rc.execute("[A : INTEGER]{(1),(2),(NULL)} PRODUCT [B : INTEGER]{(3),(NULL),(4)}");	
		assertEquals(expected, e.get().toString());
		
		expected = "+-------------+\r\n"
				+ "| A : INTEGER |\r\n"
				+ "+-------------+\r\n"
				+ "|        NULL |\r\n"
				+ "+-------------+\r\n"
				+ "|        NULL |\r\n"
				+ "+-------------+\r\n"
				+ "|        NULL |\r\n"
				+ "+-------------+\r\n"
				+ "|        NULL |\r\n"
				+ "+-------------+";
		e = rc.execute("[A : INTEGER]{(NULL),(NULL)} UNION [A : INTEGER]{(NULL),(NULL)}");	
		assertEquals(expected, e.get().toString());
	}
	
}
