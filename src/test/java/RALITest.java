/**
 * @author Christophe Debruyne <c.debruyne@uliege.be> Université de Liège
 */

import static org.junit.Assert.assertTrue;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.sql.SQLException;

import org.junit.Before;
import org.junit.Test;

import rali.ra.RALIController;
import rali.util.Either;
import rali.util.Left;

public class RALITest {

	private RALIController rc = null;

	@Before
	public void setUp() throws Exception {
		rc = RALIController.getInstance();

		// Creating the in-memory tables
		rc.createDatabaseAndLoadData();
		rc.execute("STUDENTS = [STUDENT_ID : INTEGER,  NAME, AGE : INTEGER, MAJOR]{(1,\"Alice\",20,\"CS\"),(2,\"Bob\",21,\"Math\"),(3,\"Claire\",19,\"Bio\"),(4,\"David\",22,\"Econ\"),(5,\"Emily\",20,\"CS\")};");
		rc.execute("STUDENTS2 = [STUDENT_ID : INTEGER,  NAME, AGE : INTEGER, MAJOR]{(4,\"David\",22,\"Econ\"),(5,\"Emily\",20,\"CS\"),(6,\"Chris\",25,\"CS\")};");
		rc.execute("COURSES = [COURSE_ID : INTEGER,  COURSE_NAME, INSTRUCTOR]{(101,\"Calculus\",\"Smith\"),(102,\"Biology\",\"Johnson\"),(103,\"Computer Science\",\"Lee\"),(104,\"Microeconomics\",\"Chen\"),(105,\"English\",\"Davis\")};");
		rc.execute("ENROLLMENTS = [STUDENT_ID : INTEGER, COURSE_ID : INTEGER]{(1,101),(1,103),(2,101),(2,102),(3,102),(4,104),(5,101),(5,103)};");
		rc.execute("DIVTEST = [COURSE_ID : INTEGER]{(101),(103)};");
		
		rc.execute("R = [A,B,C]{(\"a\",\"b\",\"c\"),(\"d\",\"a\",\"f\"),(\"c\",\"b\",\"d\")};");
		rc.execute("S = [A,B,C]{(\"b\",\"g\",\"a\"),(\"d\",\"a\",\"f\")};");
		rc.execute("T = [D,E]{(\"a\",\"b\"),(\"c\",\"d\")};");
		rc.execute("V = [D,E,F:INTEGER]{(\"b\",\"g\",1),(\"d\",\"a\",2)};");
		rc.execute("U = [B,G:INTEGER]{(\"a\",1),(\"c\",2)};");
		rc.execute("X = [A,B,C,D]{(\"a\",\"b\",\"c\",\"d\"),(\"a\",\"b\",\"e\",\"f\"),(\"g\",\"h\",\"c\",\"d\"),(\"i\",\"j\",\"k\",\"l\")};");
		rc.execute("Y = [C,D]{(\"c\",\"d\"),(\"e\",\"f\")};");
	}

	@Test
	public void testRelations() throws SQLException {
		String expected = null;
		Either e = null;

		expected = """
                +----------------------+--------+---------------+-------+
                | STUDENT_ID : INTEGER | NAME   | AGE : INTEGER | MAJOR |
                +----------------------+--------+---------------+-------+
                |                    1 |  Alice |            20 |    CS |
                +----------------------+--------+---------------+-------+
                |                    2 |    Bob |            21 |  Math |
                +----------------------+--------+---------------+-------+
                |                    3 | Claire |            19 |   Bio |
                +----------------------+--------+---------------+-------+
                |                    4 |  David |            22 |  Econ |
                +----------------------+--------+---------------+-------+
                |                    5 |  Emily |            20 |    CS |
                +----------------------+--------+---------------+-------+""";
		e = rc.execute("STUDENTS;");
		assertEquals(expected, e.get().toString());
		e = rc.execute("(STUDENTS);");
		assertEquals(expected, e.get().toString());

		expected = """
                +---------------------+------------------+------------+
                | COURSE_ID : INTEGER | COURSE_NAME      | INSTRUCTOR |
                +---------------------+------------------+------------+
                |                 101 |         Calculus |      Smith |
                +---------------------+------------------+------------+
                |                 102 |          Biology |    Johnson |
                +---------------------+------------------+------------+
                |                 103 | Computer Science |        Lee |
                +---------------------+------------------+------------+
                |                 104 |   Microeconomics |       Chen |
                +---------------------+------------------+------------+
                |                 105 |          English |      Davis |
                +---------------------+------------------+------------+""";

		e = rc.execute("COURSES;");
		assertEquals(expected, e.get().toString());
		e = rc.execute("(COURSES);");
		assertEquals(expected, e.get().toString());

		expected = """
                +----------------------+---------------------+
                | STUDENT_ID : INTEGER | COURSE_ID : INTEGER |
                +----------------------+---------------------+
                |                    1 |                 101 |
                +----------------------+---------------------+
                |                    1 |                 103 |
                +----------------------+---------------------+
                |                    2 |                 101 |
                +----------------------+---------------------+
                |                    2 |                 102 |
                +----------------------+---------------------+
                |                    3 |                 102 |
                +----------------------+---------------------+
                |                    4 |                 104 |
                +----------------------+---------------------+
                |                    5 |                 101 |
                +----------------------+---------------------+
                |                    5 |                 103 |
                +----------------------+---------------------+""";

		e = rc.execute("ENROLLMENTS;");
		assertEquals(expected, e.get().toString());
		e = rc.execute("(ENROLLMENTS);");
		assertEquals(expected, e.get().toString());
	}

	@Test
	public void testProduct() throws SQLException {
		String expected = null;
		Either e = null;

		expected = """
                +-------------+-------------+
                | A : INTEGER | B : INTEGER |
                +-------------+-------------+
                |           1 |           3 |
                +-------------+-------------+
                |           1 |           4 |
                +-------------+-------------+
                |           2 |           3 |
                +-------------+-------------+
                |           2 |           4 |
                +-------------+-------------+""";
		e = rc.execute("[A : INTEGER]{(1),(2)} PRODUCT [B : INTEGER]{(3),(4)};");
		assertEquals(expected, e.get().toString());

		expected = """
                +-------------+---------------------+
                | A : INTEGER | COURSE_ID : INTEGER |
                +-------------+---------------------+
                |           1 |                 101 |
                +-------------+---------------------+
                |           1 |                 103 |
                +-------------+---------------------+
                |           2 |                 101 |
                +-------------+---------------------+
                |           2 |                 103 |
                +-------------+---------------------+""";

		e = rc.execute("[A : INTEGER]{(1),(2)} PRODUCT DIVTEST;");
		assertEquals(expected, e.get().toString());
		
		e = rc.execute("STUDENTS PRODUCT ENROLLMENTS;");
		assertTrue(e instanceof Left);
	}

	@Test
	public void testUnion() throws SQLException {
		String expected = null;
		Either e = null;

		expected = """
                +----------------------+--------+---------------+-------+
                | STUDENT_ID : INTEGER | NAME   | AGE : INTEGER | MAJOR |
                +----------------------+--------+---------------+-------+
                |                    1 |  Alice |            20 |    CS |
                +----------------------+--------+---------------+-------+
                |                    2 |    Bob |            21 |  Math |
                +----------------------+--------+---------------+-------+
                |                    3 | Claire |            19 |   Bio |
                +----------------------+--------+---------------+-------+
                |                    4 |  David |            22 |  Econ |
                +----------------------+--------+---------------+-------+
                |                    5 |  Emily |            20 |    CS |
                +----------------------+--------+---------------+-------+
                |                    6 |  Chris |            25 |    CS |
                +----------------------+--------+---------------+-------+""";
		
		e = rc.execute("STUDENTS UNION STUDENTS2;");
		assertEquals(expected, e.get().toString());
		
		e = rc.execute("STUDENTS UNION ENROLLMENTS;");
		assertTrue(e instanceof Left);
	}
	
	@Test
	public void testIntersection() throws SQLException {
		String expected = null;
		Either e = null;

		expected = """
                +----------------------+-------+---------------+-------+
                | STUDENT_ID : INTEGER | NAME  | AGE : INTEGER | MAJOR |
                +----------------------+-------+---------------+-------+
                |                    4 | David |            22 |  Econ |
                +----------------------+-------+---------------+-------+
                |                    5 | Emily |            20 |    CS |
                +----------------------+-------+---------------+-------+""";
		
		e = rc.execute("STUDENTS INTERSECTION STUDENTS2;");
		assertEquals(expected, e.get().toString());
		
		e = rc.execute("STUDENTS INTERSECTION ENROLLMENTS;");
		assertTrue(e instanceof Left);
	}
	
	@Test
	public void testDifference() throws SQLException {
		String expected = null;
		Either e = null;

		expected = """
                +----------------------+--------+---------------+-------+
                | STUDENT_ID : INTEGER | NAME   | AGE : INTEGER | MAJOR |
                +----------------------+--------+---------------+-------+
                |                    1 |  Alice |            20 |    CS |
                +----------------------+--------+---------------+-------+
                |                    2 |    Bob |            21 |  Math |
                +----------------------+--------+---------------+-------+
                |                    3 | Claire |            19 |   Bio |
                +----------------------+--------+---------------+-------+""";
		
		e = rc.execute("STUDENTS MINUS STUDENTS2;");
		assertEquals(expected, e.get().toString());
		
		e = rc.execute("STUDENTS MINUS ENROLLMENTS;");
		assertTrue(e instanceof Left);
	}
	
	@Test
	public void testDivision() throws SQLException {
		String expected = null;
		Either e = null;

		expected = """
                +----------------------+
                | STUDENT_ID : INTEGER |
                +----------------------+
                |                    1 |
                +----------------------+
                |                    5 |
                +----------------------+""";
		
		e = rc.execute("ENROLLMENTS DIVISION DIVTEST;");
		assertEquals(expected, e.get().toString());
		
		e = rc.execute("STUDENTS DIVISION DIVTEST;");
		assertTrue(e instanceof Left);
		
		expected = """
                +---+---+
                | A | B |
                +---+---+
                | a | b |
                +---+---+""";
		
		e = rc.execute("X DIVISION Y;");
		assertEquals(expected, e.get().toString());
	}
	
	@Test
	public void testJoin() throws SQLException {
		String expected = null;
		Either e = null;

		expected = """
                +----------------------+---------------------+
                | STUDENT_ID : INTEGER | COURSE_ID : INTEGER |
                +----------------------+---------------------+
                |                    1 |                 101 |
                +----------------------+---------------------+
                |                    1 |                 103 |
                +----------------------+---------------------+
                |                    5 |                 101 |
                +----------------------+---------------------+
                |                    5 |                 103 |
                +----------------------+---------------------+""";
		
		e = rc.execute("ENROLLMENTS JOIN (ENROLLMENTS DIVISION DIVTEST);");
		assertEquals(expected, e.get().toString());

		// Join behaves as a cartesian product when no attributes are shared
		
		expected = """
                +-------------+-------------+
                | A : INTEGER | B : INTEGER |
                +-------------+-------------+
                |           1 |           3 |
                +-------------+-------------+
                |           1 |           4 |
                +-------------+-------------+
                |           2 |           3 |
                +-------------+-------------+
                |           2 |           4 |
                +-------------+-------------+""";
		e = rc.execute("[A : INTEGER]{(1),(2)} JOIN [B : INTEGER]{(3),(4)};");
		assertEquals(expected, e.get().toString());
	}
	
	@Test
	public void testInlineRelation() throws SQLException {
		String expected = null;
		Either e = null;

		expected = """
                +---------------------+
                | COURSE_ID : INTEGER |
                +---------------------+
                |                 101 |
                +---------------------+
                |                 103 |
                +---------------------+""";
		
		e = rc.execute("[COURSE_ID : INTEGER]{(101),(103)};");
		assertEquals(expected, e.get().toString());
	}
	
	@Test
	public void testProjection() throws SQLException {
		String expected = null;
		Either e = null;

		expected = """
                +----------------------+
                | STUDENT_ID : INTEGER |
                +----------------------+
                |                    1 |
                +----------------------+
                |                    5 |
                +----------------------+""";
		
		e = rc.execute("PROJECT{STUDENT_ID}(ENROLLMENTS JOIN (ENROLLMENTS DIVISION DIVTEST));");
		assertEquals(expected, e.get().toString());
		
		e = rc.execute("PROJECT{B,B}([A : INTEGER]{(1),(2)} JOIN [B : INTEGER]{(3),(4)});");
		assertTrue(e instanceof Left);
	}
	
	@Test
	public void testSelection() throws SQLException {
		String expected = null;
		Either e = null;

		expected = """
                +----------------------+--------+---------------+-------+
                | STUDENT_ID : INTEGER | NAME   | AGE : INTEGER | MAJOR |
                +----------------------+--------+---------------+-------+
                |                    3 | Claire |            19 |   Bio |
                +----------------------+--------+---------------+-------+""";
		
		e = rc.execute("SELECT AGE < 20 (STUDENTS);");
		assertEquals(expected, e.get().toString());
		
		e = rc.execute("SELECT (AGE < 20) (STUDENTS);");
		assertEquals(expected, e.get().toString());
		
		expected = """
                +----------------------+-------+---------------+-------+
                | STUDENT_ID : INTEGER | NAME  | AGE : INTEGER | MAJOR |
                +----------------------+-------+---------------+-------+
                |                    1 | Alice |            20 |    CS |
                +----------------------+-------+---------------+-------+
                |                    2 |   Bob |            21 |  Math |
                +----------------------+-------+---------------+-------+
                |                    4 | David |            22 |  Econ |
                +----------------------+-------+---------------+-------+
                |                    5 | Emily |            20 |    CS |
                +----------------------+-------+---------------+-------+""";
		
		e = rc.execute("SELECT NOT AGE < 20 (STUDENTS);");
		assertEquals(expected, e.get().toString());
		
		e = rc.execute("SELECT NOT (AGE < 20) (STUDENTS);");
		assertEquals(expected, e.get().toString());
		
		expected = """
                +----------------------+-------+---------------+-------+
                | STUDENT_ID : INTEGER | NAME  | AGE : INTEGER | MAJOR |
                +----------------------+-------+---------------+-------+
                |                    1 | Alice |            20 |    CS |
                +----------------------+-------+---------------+-------+
                |                    2 |   Bob |            21 |  Math |
                +----------------------+-------+---------------+-------+
                |                    5 | Emily |            20 |    CS |
                +----------------------+-------+---------------+-------+""";
		
		e = rc.execute("SELECT NOT AGE < 20 AND MAJOR = \"CS\" OR \"Bob\" = NAME (STUDENTS);");
		assertEquals(expected, e.get().toString());
		
		e = rc.execute("SELECT ((NOT (AGE < 20) AND MAJOR = \"CS\") OR \"Bob\" = NAME) (STUDENTS);");
		assertEquals(expected, e.get().toString());
	}
	
	@Test
	public void testSelectionNestedConditions() throws SQLException {
		String expected = null;
		Either e = null;

		expected = """
                +----------------------+-------+---------------+-------+
                | STUDENT_ID : INTEGER | NAME  | AGE : INTEGER | MAJOR |
                +----------------------+-------+---------------+-------+
                |                    2 |   Bob |            21 |  Math |
                +----------------------+-------+---------------+-------+
                |                    4 | David |            22 |  Econ |
                +----------------------+-------+---------------+-------+""";
		
		e = rc.execute("SELECT NOT (AGE < 20 OR MAJOR = \"CS\") (STUDENTS);");
		assertEquals(expected, e.get().toString());
	}
	
	@Test
	public void testSelectionAndProjection() throws SQLException {
		String expected = null;
		Either e = null;

		expected = """
                +----------------------+-------+---------------+
                | STUDENT_ID : INTEGER | NAME  | AGE : INTEGER |
                +----------------------+-------+---------------+
                |                    2 |   Bob |            21 |
                +----------------------+-------+---------------+
                |                    4 | David |            22 |
                +----------------------+-------+---------------+""";
		
		e = rc.execute("PROJECT {STUDENT_ID, NAME, AGE} (SELECT NOT (AGE < 20 OR MAJOR = \"CS\") (STUDENTS));");
		assertEquals(expected, e.get().toString());
	}
	
	@Test
	public void testThetaJoin() throws SQLException {
		String expected = null;
		Either e = null;

		expected = """
                +-------------+-------------+
                | A : INTEGER | B : INTEGER |
                +-------------+-------------+
                |           1 |           3 |
                +-------------+-------------+
                |           1 |           4 |
                +-------------+-------------+""";
		
		e = rc.execute("[A : INTEGER]{(1),(5)} JOIN A < B [B : INTEGER]{(3),(4)};");
		assertEquals(expected, e.get().toString());
		
		e = rc.execute("STUDENTS JOIN NAME = AGE STUDENTS;");
		assertTrue(e instanceof Left);
	}

	@Test
	public void testRename() throws SQLException {
		String expected = "";
		Either e = null;
		
		expected = """
                +---+---+---+
                | D | E | C |
                +---+---+---+
                | a | b | c |
                +---+---+---+
                | c | b | d |
                +---+---+---+
                | d | a | f |
                +---+---+---+""";
		
		e = rc.execute("RENAME A<-D,B<-E(R);");
		assertEquals(expected, e.get().toString());
				
		e = rc.execute("RENAME A<-D,X<-E(R);");
		assertTrue(e instanceof Left);
	}
}
