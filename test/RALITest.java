import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.sql.SQLException;

import org.junit.Before;
import org.junit.Test;

import rali.RALIController;
import rali.util.Either;
import rali.util.Left;

public class RALITest {

	private RALIController rc = null;

	@Before
	public void setUp() throws Exception {
		rc = RALIController.getInstance();

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
	public void testRelations() throws SQLException {
		String expected = null;
		Either e = null;

		expected = "+----------------------+--------+---------------+-------+\r\n"
				+ "| STUDENT_ID : INTEGER | NAME   | AGE : INTEGER | MAJOR |\r\n"
				+ "+----------------------+--------+---------------+-------+\r\n"
				+ "|                    1 |  Alice |            20 |    CS |\r\n"
				+ "+----------------------+--------+---------------+-------+\r\n"
				+ "|                    2 |    Bob |            21 |  Math |\r\n"
				+ "+----------------------+--------+---------------+-------+\r\n"
				+ "|                    3 | Claire |            19 |   Bio |\r\n"
				+ "+----------------------+--------+---------------+-------+\r\n"
				+ "|                    4 |  David |            22 |  Econ |\r\n"
				+ "+----------------------+--------+---------------+-------+\r\n"
				+ "|                    5 |  Emily |            20 |    CS |\r\n"
				+ "+----------------------+--------+---------------+-------+";
		e = rc.execute("STUDENTS");		
		assertEquals(e.get().toString(), expected);
		e = rc.execute("(STUDENTS)");		
		assertEquals(e.get().toString(), expected);

		expected = "+---------------------+------------------+------------+\r\n"
				+ "| COURSE_ID : INTEGER | COURSE_NAME      | INSTRUCTOR |\r\n"
				+ "+---------------------+------------------+------------+\r\n"
				+ "|                 101 |         Calculus |      Smith |\r\n"
				+ "+---------------------+------------------+------------+\r\n"
				+ "|                 102 |          Biology |    Johnson |\r\n"
				+ "+---------------------+------------------+------------+\r\n"
				+ "|                 103 | Computer Science |        Lee |\r\n"
				+ "+---------------------+------------------+------------+\r\n"
				+ "|                 104 |   Microeconomics |       Chen |\r\n"
				+ "+---------------------+------------------+------------+\r\n"
				+ "|                 105 |          English |      Davis |\r\n"
				+ "+---------------------+------------------+------------+";

		e = rc.execute("COURSES");		
		assertEquals(e.get().toString(), expected);
		e = rc.execute("(COURSES)");		
		assertEquals(e.get().toString(), expected);

		expected =  "+----------------------+---------------------+\r\n"
				+ "| STUDENT_ID : INTEGER | COURSE_ID : INTEGER |\r\n"
				+ "+----------------------+---------------------+\r\n"
				+ "|                    1 |                 101 |\r\n"
				+ "+----------------------+---------------------+\r\n"
				+ "|                    1 |                 103 |\r\n"
				+ "+----------------------+---------------------+\r\n"
				+ "|                    2 |                 101 |\r\n"
				+ "+----------------------+---------------------+\r\n"
				+ "|                    2 |                 102 |\r\n"
				+ "+----------------------+---------------------+\r\n"
				+ "|                    3 |                 102 |\r\n"
				+ "+----------------------+---------------------+\r\n"
				+ "|                    4 |                 104 |\r\n"
				+ "+----------------------+---------------------+\r\n"
				+ "|                    5 |                 101 |\r\n"
				+ "+----------------------+---------------------+\r\n"
				+ "|                    5 |                 103 |\r\n"
				+ "+----------------------+---------------------+";

		e = rc.execute("ENROLLMENTS");		
		assertEquals(e.get().toString(), expected);
		e = rc.execute("(ENROLLMENTS)");		
		assertEquals(e.get().toString(), expected);
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
				+ "|           2 |           3 |\r\n"
				+ "+-------------+-------------+\r\n"
				+ "|           2 |           4 |\r\n"
				+ "+-------------+-------------+";
		e = rc.execute("[A : INTEGER]{(1),(2)} PRODUCT [B : INTEGER]{(3),(4)}");		
		assertEquals(e.get().toString(), expected);

		expected = "+-------------+---------------------+\r\n"
				+ "| A : INTEGER | COURSE_ID : INTEGER |\r\n"
				+ "+-------------+---------------------+\r\n"
				+ "|           1 |                 101 |\r\n"
				+ "+-------------+---------------------+\r\n"
				+ "|           1 |                 103 |\r\n"
				+ "+-------------+---------------------+\r\n"
				+ "|           2 |                 101 |\r\n"
				+ "+-------------+---------------------+\r\n"
				+ "|           2 |                 103 |\r\n"
				+ "+-------------+---------------------+";

		e = rc.execute("[A : INTEGER]{(1),(2)} PRODUCT DIVTEST");		
		assertEquals(e.get().toString(), expected);
		
		e = rc.execute("STUDENTS PRODUCT ENROLLMENTS");
		assertTrue(e instanceof Left);
	}

	@Test
	public void testUnion() throws SQLException {
		String expected = null;
		Either e = null;

		expected = "+----------------------+--------+---------------+-------+\r\n"
				+ "| STUDENT_ID : INTEGER | NAME   | AGE : INTEGER | MAJOR |\r\n"
				+ "+----------------------+--------+---------------+-------+\r\n"
				+ "|                    1 |  Alice |            20 |    CS |\r\n"
				+ "+----------------------+--------+---------------+-------+\r\n"
				+ "|                    2 |    Bob |            21 |  Math |\r\n"
				+ "+----------------------+--------+---------------+-------+\r\n"
				+ "|                    3 | Claire |            19 |   Bio |\r\n"
				+ "+----------------------+--------+---------------+-------+\r\n"
				+ "|                    4 |  David |            22 |  Econ |\r\n"
				+ "+----------------------+--------+---------------+-------+\r\n"
				+ "|                    5 |  Emily |            20 |    CS |\r\n"
				+ "+----------------------+--------+---------------+-------+\r\n"
				+ "|                    6 |  Chris |            25 |    CS |\r\n"
				+ "+----------------------+--------+---------------+-------+";
		
		e = rc.execute("STUDENTS UNION STUDENTS2");		
		assertEquals(e.get().toString(), expected);
		
		e = rc.execute("STUDENTS UNION ENROLLMENTS");
		assertTrue(e instanceof Left);
	}
	
	@Test
	public void testIntersection() throws SQLException {
		String expected = null;
		Either e = null;

		expected = "+----------------------+-------+---------------+-------+\r\n"
				+ "| STUDENT_ID : INTEGER | NAME  | AGE : INTEGER | MAJOR |\r\n"
				+ "+----------------------+-------+---------------+-------+\r\n"
				+ "|                    4 | David |            22 |  Econ |\r\n"
				+ "+----------------------+-------+---------------+-------+\r\n"
				+ "|                    5 | Emily |            20 |    CS |\r\n"
				+ "+----------------------+-------+---------------+-------+";
		
		e = rc.execute("STUDENTS INTERSECTION STUDENTS2");		
		assertEquals(e.get().toString(), expected);
		
		e = rc.execute("STUDENTS INTERSECTION ENROLLMENTS");
		assertTrue(e instanceof Left);
	}
	
	@Test
	public void testDifference() throws SQLException {
		String expected = null;
		Either e = null;

		expected = "+----------------------+--------+---------------+-------+\r\n"
				+ "| STUDENT_ID : INTEGER | NAME   | AGE : INTEGER | MAJOR |\r\n"
				+ "+----------------------+--------+---------------+-------+\r\n"
				+ "|                    1 |  Alice |            20 |    CS |\r\n"
				+ "+----------------------+--------+---------------+-------+\r\n"
				+ "|                    2 |    Bob |            21 |  Math |\r\n"
				+ "+----------------------+--------+---------------+-------+\r\n"
				+ "|                    3 | Claire |            19 |   Bio |\r\n"
				+ "+----------------------+--------+---------------+-------+";
		
		e = rc.execute("STUDENTS MINUS STUDENTS2");		
		assertEquals(e.get().toString(), expected);
		
		e = rc.execute("STUDENTS MINUS ENROLLMENTS");
		assertTrue(e instanceof Left);
	}
	
	@Test
	public void testDivision() throws SQLException {
		String expected = null;
		Either e = null;

		expected = "+----------------------+\r\n"
				+ "| STUDENT_ID : INTEGER |\r\n"
				+ "+----------------------+\r\n"
				+ "|                    1 |\r\n"
				+ "+----------------------+\r\n"
				+ "|                    5 |\r\n"
				+ "+----------------------+";
		
		e = rc.execute("ENROLLMENTS DIVISION DIVTEST");		
		assertEquals(e.get().toString(), expected);
		
		e = rc.execute("STUDENTS DIVISION DIVTEST");
		assertTrue(e instanceof Left);
		
		expected = "+---+---+\r\n"
				+ "| A | B |\r\n"
				+ "+---+---+\r\n"
				+ "| a | b |\r\n"
				+ "+---+---+";
		
		e = rc.execute("X DIVISION Y");		
		assertEquals(e.get().toString(), expected);
	}
	
	@Test
	public void testJoin() throws SQLException {
		String expected = null;
		Either e = null;

		expected = "+----------------------+---------------------+\r\n"
				+ "| STUDENT_ID : INTEGER | COURSE_ID : INTEGER |\r\n"
				+ "+----------------------+---------------------+\r\n"
				+ "|                    1 |                 101 |\r\n"
				+ "+----------------------+---------------------+\r\n"
				+ "|                    1 |                 103 |\r\n"
				+ "+----------------------+---------------------+\r\n"
				+ "|                    5 |                 101 |\r\n"
				+ "+----------------------+---------------------+\r\n"
				+ "|                    5 |                 103 |\r\n"
				+ "+----------------------+---------------------+";
		
		e = rc.execute("ENROLLMENTS JOIN (ENROLLMENTS DIVISION DIVTEST)");		
		assertEquals(e.get().toString(), expected);

		// Join behaves as a cartesian product when no attributes are shared
		
		expected = "+-------------+-------------+\r\n"
				+ "| A : INTEGER | B : INTEGER |\r\n"
				+ "+-------------+-------------+\r\n"
				+ "|           1 |           3 |\r\n"
				+ "+-------------+-------------+\r\n"
				+ "|           1 |           4 |\r\n"
				+ "+-------------+-------------+\r\n"
				+ "|           2 |           3 |\r\n"
				+ "+-------------+-------------+\r\n"
				+ "|           2 |           4 |\r\n"
				+ "+-------------+-------------+";
		e = rc.execute("[A : INTEGER]{(1),(2)} JOIN [B : INTEGER]{(3),(4)}");		
		assertEquals(e.get().toString(), expected);
	}
	
	@Test
	public void testInlineRelation() throws SQLException {
		String expected = null;
		Either e = null;

		expected = "+---------------------+\r\n"
				+ "| COURSE_ID : INTEGER |\r\n"
				+ "+---------------------+\r\n"
				+ "|                 101 |\r\n"
				+ "+---------------------+\r\n"
				+ "|                 103 |\r\n"
				+ "+---------------------+";
		
		e = rc.execute("[COURSE_ID : INTEGER]{(101),(103)}");		
		assertEquals(e.get().toString(), expected);
	}
	
	@Test
	public void testProjection() throws SQLException {
		String expected = null;
		Either e = null;

		expected = "+----------------------+\r\n"
				+ "| STUDENT_ID : INTEGER |\r\n"
				+ "+----------------------+\r\n"
				+ "|                    1 |\r\n"
				+ "+----------------------+\r\n"
				+ "|                    5 |\r\n"
				+ "+----------------------+";
		
		e = rc.execute("PROJECT{STUDENT_ID}(ENROLLMENTS JOIN (ENROLLMENTS DIVISION DIVTEST))");		
		assertEquals(e.get().toString(), expected);
		
		e = rc.execute("PROJECT{B,B}([A : INTEGER]{(1),(2)} JOIN [B : INTEGER]{(3),(4)})");		
		assertTrue(e instanceof Left);
	}
	
	@Test
	public void testSelection() throws SQLException {
		String expected = null;
		Either e = null;

		expected = "+----------------------+--------+---------------+-------+\r\n"
				+ "| STUDENT_ID : INTEGER | NAME   | AGE : INTEGER | MAJOR |\r\n"
				+ "+----------------------+--------+---------------+-------+\r\n"
				+ "|                    3 | Claire |            19 |   Bio |\r\n"
				+ "+----------------------+--------+---------------+-------+";
		
		e = rc.execute("SELECT AGE < 20 (STUDENTS)");		
		assertEquals(e.get().toString(), expected);
		
		e = rc.execute("SELECT (AGE < 20) (STUDENTS)");		
		assertEquals(e.get().toString(), expected);
		
		expected = "+----------------------+-------+---------------+-------+\r\n"
				+ "| STUDENT_ID : INTEGER | NAME  | AGE : INTEGER | MAJOR |\r\n"
				+ "+----------------------+-------+---------------+-------+\r\n"
				+ "|                    1 | Alice |            20 |    CS |\r\n"
				+ "+----------------------+-------+---------------+-------+\r\n"
				+ "|                    2 |   Bob |            21 |  Math |\r\n"
				+ "+----------------------+-------+---------------+-------+\r\n"
				+ "|                    4 | David |            22 |  Econ |\r\n"
				+ "+----------------------+-------+---------------+-------+\r\n"
				+ "|                    5 | Emily |            20 |    CS |\r\n"
				+ "+----------------------+-------+---------------+-------+";
		
		e = rc.execute("SELECT NOT AGE < 20 (STUDENTS)");		
		assertEquals(e.get().toString(), expected);
		
		e = rc.execute("SELECT NOT (AGE < 20) (STUDENTS)");		
		assertEquals(e.get().toString(), expected);
		
		expected = "+----------------------+-------+---------------+-------+\r\n"
				+ "| STUDENT_ID : INTEGER | NAME  | AGE : INTEGER | MAJOR |\r\n"
				+ "+----------------------+-------+---------------+-------+\r\n"
				+ "|                    1 | Alice |            20 |    CS |\r\n"
				+ "+----------------------+-------+---------------+-------+\r\n"
				+ "|                    2 |   Bob |            21 |  Math |\r\n"
				+ "+----------------------+-------+---------------+-------+\r\n"
				+ "|                    5 | Emily |            20 |    CS |\r\n"
				+ "+----------------------+-------+---------------+-------+";
		
		e = rc.execute("SELECT NOT AGE < 20 AND MAJOR = \"CS\" OR \"Bob\" = NAME (STUDENTS)");		
		assertEquals(e.get().toString(), expected);
		
		e = rc.execute("SELECT ((NOT (AGE < 20) AND MAJOR = \"CS\") OR \"Bob\" = NAME) (STUDENTS)");		
		assertEquals(e.get().toString(), expected);
	}
	
	@Test
	public void testSelectionNestedConditions() throws SQLException {
		String expected = null;
		Either e = null;

		expected = "+----------------------+-------+---------------+-------+\r\n"
				+ "| STUDENT_ID : INTEGER | NAME  | AGE : INTEGER | MAJOR |\r\n"
				+ "+----------------------+-------+---------------+-------+\r\n"
				+ "|                    2 |   Bob |            21 |  Math |\r\n"
				+ "+----------------------+-------+---------------+-------+\r\n"
				+ "|                    4 | David |            22 |  Econ |\r\n"
				+ "+----------------------+-------+---------------+-------+";
		
		e = rc.execute("SELECT NOT (AGE < 20 OR MAJOR = \"CS\") (STUDENTS)");		
		assertEquals(e.get().toString(), expected);
	}
	
	@Test
	public void testSelectionAndProjection() throws SQLException {
		String expected = null;
		Either e = null;

		expected = "+----------------------+-------+---------------+\r\n"
				+ "| STUDENT_ID : INTEGER | NAME  | AGE : INTEGER |\r\n"
				+ "+----------------------+-------+---------------+\r\n"
				+ "|                    2 |   Bob |            21 |\r\n"
				+ "+----------------------+-------+---------------+\r\n"
				+ "|                    4 | David |            22 |\r\n"
				+ "+----------------------+-------+---------------+";
		
		e = rc.execute("PROJECT {STUDENT_ID, NAME, AGE} (SELECT NOT (AGE < 20 OR MAJOR = \"CS\") (STUDENTS))");		
		assertEquals(e.get().toString(), expected);
	}
	
	@Test
	public void testThetaJoin() throws SQLException {
		String expected = null;
		Either e = null;

		expected = "+-------------+-------------+\r\n"
				+ "| A : INTEGER | B : INTEGER |\r\n"
				+ "+-------------+-------------+\r\n"
				+ "|           1 |           3 |\r\n"
				+ "+-------------+-------------+\r\n"
				+ "|           1 |           4 |\r\n"
				+ "+-------------+-------------+";
		
		e = rc.execute("[A : INTEGER]{(1),(5)} JOIN A < B [B : INTEGER]{(3),(4)}");		
		assertEquals(e.get().toString(), expected);
		
		e = rc.execute("STUDENTS JOIN NAME = AGE STUDENTS");
		assertTrue(e instanceof Left);
	}

	@Test
	public void testRename() throws SQLException {
		String expected = "";
		Either e = null;
		
		expected = "+---+---+---+\r\n"
				+ "| D | E | C |\r\n"
				+ "+---+---+---+\r\n"
				+ "| a | b | c |\r\n"
				+ "+---+---+---+\r\n"
				+ "| c | b | d |\r\n"
				+ "+---+---+---+\r\n"
				+ "| d | a | f |\r\n"
				+ "+---+---+---+";
		
		e = rc.execute("RENAME A<-D,B<-E(R)");		
		assertEquals(e.get().toString(), expected);
				
		e = rc.execute("RENAME A<-D,X<-E(R)");
		assertTrue(e instanceof Left);
	}
}
