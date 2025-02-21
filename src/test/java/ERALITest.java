/**
 * @author Christophe Debruyne <c.debruyne@uliege.be> Université de Liège
 */

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.sql.SQLException;

import org.junit.Before;
import org.junit.Test;

import rali.era.ERALIController;
import rali.util.Either;
import rali.util.Left;

public class ERALITest {

	private ERALIController rc = null;

	@Before
	public void setUp() throws Exception {
		rc = ERALIController.getInstance();

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
                |           1 |           4 |
                +-------------+-------------+
                |           2 |           3 |
                +-------------+-------------+
                |           2 |           4 |
                +-------------+-------------+
                |           2 |           4 |
                +-------------+-------------+
                |           1 |           3 |
                +-------------+-------------+
                |           1 |           4 |
                +-------------+-------------+
                |           1 |           4 |
                +-------------+-------------+""";
		e = rc.execute("[A : INTEGER]{(1),(2),(1)} PRODUCT [B : INTEGER]{(3),(4),(4)};");
		assertEquals(expected, e.get().toString());
	}

	@Test
	public void testUnion() throws SQLException {
		String expected = null;
		Either e = null;

		expected = """
                +-------------+
                | A : INTEGER |
                +-------------+
                |           1 |
                +-------------+
                |           2 |
                +-------------+
                |           1 |
                +-------------+
                |           3 |
                +-------------+
                |           4 |
                +-------------+
                |           4 |
                +-------------+""";
		
		e = rc.execute("[A : INTEGER]{(1),(2),(1)} UNION [A : INTEGER]{(3),(4),(4)};");
		assertEquals(expected, e.get().toString());
		
		e = rc.execute("STUDENTS UNION ENROLLMENTS;");
		assertTrue(e instanceof Left);
	}
	
	@Test
	public void testIntersection() throws SQLException {
		String expected = null;
		Either e = null;

		expected = """
                +-------------+
                | A : INTEGER |
                +-------------+
                |           1 |
                +-------------+
                |           4 |
                +-------------+
                |           4 |
                +-------------+""";
		
		e = rc.execute("[A : INTEGER]{(1),(2),(4),(1),(4)} INTERSECTION [A : INTEGER]{(3),(4),(1),(4),(4)};");
		assertEquals(expected, e.get().toString());
		
		expected = """
                +-------------+-------------+
                | A : INTEGER | B : INTEGER |
                +-------------+-------------+
                |           1 |           1 |
                +-------------+-------------+
                |           4 |           4 |
                +-------------+-------------+
                |           4 |           4 |
                +-------------+-------------+""";
		
		e = rc.execute("[A : INTEGER, B : INTEGER]{(1,1),(2,2),(4,4),(1,1),(4,4)} INTERSECTION [A : INTEGER, B : INTEGER]{(3,3),(4,4),(1,1),(4,4),(4,4)};");
		assertEquals(expected, e.get().toString());
		
		e = rc.execute("STUDENTS UNION ENROLLMENTS");
		assertTrue(e instanceof Left);
	}
	
	
	@Test
	public void testDifference() throws SQLException {
		String expected = null;
		Either e = null;

		expected = """
                +-------------+
                | A : INTEGER |
                +-------------+
                |           2 |
                +-------------+
                |           1 |
                +-------------+""";
		
		e = rc.execute("[A : INTEGER]{(1),(2),(4),(1),(4)} MINUS [A : INTEGER]{(3),(4),(1),(4),(4)};");
		assertEquals(expected, e.get().toString());
		
		expected = """
                +-------------+-------------+
                | A : INTEGER | B : INTEGER |
                +-------------+-------------+
                |           2 |           2 |
                +-------------+-------------+
                |           1 |           1 |
                +-------------+-------------+""";
		
		e = rc.execute("[A : INTEGER, B : INTEGER]{(1,1),(2,2),(4,4),(1,1),(4,4)} MINUS [A : INTEGER, B : INTEGER]{(3,3),(4,4),(1,1),(4,4),(4,4)};");
		assertEquals(expected, e.get().toString());
	}
	
	@Test
	public void testDivision() throws SQLException {
		String expected = null;
		Either e = null;

		expected = """
                +-------------+---+
                | A : INTEGER | X |
                +-------------+---+
                |           1 | 1 |
                +-------------+---+
                |           2 | 1 |
                +-------------+---+""";
		
		e = rc.execute("[A : INTEGER, X, B, Y]{(1,1,1,0),(1,1,1,0),(1,1,2,0),(1,1,2,0),(2,1,1,0),(2,1,1,0),(2,1,2,0),(3,1,1,0),(3,1,2,0),(4,1,2,0),(4,1,2,0),(5,1,5,0)} DIVISION [B,Y]{(1,0),(2,0),(1,0)};");
		assertEquals(expected, e.get().toString());
		
		expected = """
                +----------------------+------------+
                | A : DOUBLE PRECISION | X : DATE   |
                +----------------------+------------+
                |                  1.0 | 2023-12-25 |
                +----------------------+------------+
                |                  1.0 | 2023-12-25 |
                +----------------------+------------+
                |                  2.0 | 2023-12-25 |
                +----------------------+------------+
                |                  3.0 | 2023-12-25 |
                +----------------------+------------+""";
		
		e = rc.execute("[A : DECIMAL, X : DATE, B, Y]{(1,2023-12-25,1,0),(1,2023-12-25,1,0),(1,2023-12-25,2,0),(1,2023-12-25,2,0),(2,2023-12-25,1,0),(2,2023-12-25,1,0),(2,2023-12-25,2,0),(3,2023-12-25,1,0),(3,2023-12-25,2,0),(4,2023-12-25,2,0),(4,2023-12-25,2,0),(5,2023-12-25,5,0)} DIVISION [B,Y]{(2,0),(1,0)};");
		assertEquals(expected, e.get().toString());

		expected = """
                +----------------------+----------+
                | A : DOUBLE PRECISION | X : DATE |
                +----------------------+----------+
                |                  1.0 |     NULL |
                +----------------------+----------+
                |                  1.0 |     NULL |
                +----------------------+----------+
                |                  2.0 |     NULL |
                +----------------------+----------+
                |                  3.0 |     NULL |
                +----------------------+----------+""";
		
		e = rc.execute("[A : DECIMAL, X : DATE, B, Y]{(1,NULL,1,0),(1,NULL,1,0),(1,NULL,2,0),(1,NULL,2,0),(2,NULL,1,0),(2,NULL,1,0),(2,NULL,2,0),(3,NULL,1,0),(3,NULL,2,0),(4,NULL,2,0),(4,NULL,2,0),(5,NULL,5,0)} DIVISION [B,Y]{(2,0),(1,0)};");
		assertEquals(expected, e.get().toString());
	}
	
	@Test
	public void testNULL() throws SQLException {
		String expected = null;
		Either e = null;

		expected = """
                +-------------+-------------+
                | A : INTEGER | B : INTEGER |
                +-------------+-------------+
                |           1 |           3 |
                +-------------+-------------+
                |           1 |        NULL |
                +-------------+-------------+
                |           1 |           4 |
                +-------------+-------------+
                |           2 |           3 |
                +-------------+-------------+
                |           2 |        NULL |
                +-------------+-------------+
                |           2 |           4 |
                +-------------+-------------+
                |        NULL |           3 |
                +-------------+-------------+
                |        NULL |        NULL |
                +-------------+-------------+
                |        NULL |           4 |
                +-------------+-------------+""";
		e = rc.execute("[A : INTEGER]{(1),(2),(NULL)} PRODUCT [B : INTEGER]{(3),(NULL),(4)};");
		assertEquals(expected, e.get().toString());
		
		expected = """
                +-------------+
                | A : INTEGER |
                +-------------+
                |        NULL |
                +-------------+
                |        NULL |
                +-------------+
                |        NULL |
                +-------------+
                |        NULL |
                +-------------+""";
		e = rc.execute("[A : INTEGER]{(NULL),(NULL)} UNION [A : INTEGER]{(NULL),(NULL)};");
		assertEquals(expected, e.get().toString());
	}
	
	@Test
	public void testSort() throws SQLException {
		String expected = null;
		Either e = null;

		expected = """
                +-------------+
                | A : INTEGER |
                +-------------+
                |           1 |
                +-------------+
                |           1 |
                +-------------+
                |           2 |
                +-------------+""";
		
		e = rc.execute("SORT {A} ([A : INTEGER]{(1),(2),(1)});");
		assertEquals(expected, e.get().toString());
		
		expected = """
                +-------------+-------------+
                | A : INTEGER | B : INTEGER |
                +-------------+-------------+
                |           2 |        NULL |
                +-------------+-------------+
                |           1 |        NULL |
                +-------------+-------------+
                |        NULL |        NULL |
                +-------------+-------------+
                |           2 |           3 |
                +-------------+-------------+
                |           1 |           3 |
                +-------------+-------------+
                |        NULL |           3 |
                +-------------+-------------+
                |           2 |           4 |
                +-------------+-------------+
                |           1 |           4 |
                +-------------+-------------+
                |        NULL |           4 |
                +-------------+-------------+""";
		
		e = rc.execute("SORT {B} ([A : INTEGER]{(2),(1),(NULL)} PRODUCT [B : INTEGER]{(3),(NULL),(4)});");
		assertEquals(expected, e.get().toString());
		
		expected = """
                +-------------+-------------+
                | A : INTEGER | B : INTEGER |
                +-------------+-------------+
                |        NULL |        NULL |
                +-------------+-------------+
                |           1 |        NULL |
                +-------------+-------------+
                |           2 |        NULL |
                +-------------+-------------+
                |        NULL |           3 |
                +-------------+-------------+
                |           1 |           3 |
                +-------------+-------------+
                |           2 |           3 |
                +-------------+-------------+
                |        NULL |           4 |
                +-------------+-------------+
                |           1 |           4 |
                +-------------+-------------+
                |           2 |           4 |
                +-------------+-------------+""";
		
		e = rc.execute("SORT {B,A} ([A : INTEGER]{(2),(1),(NULL)} PRODUCT [B : INTEGER]{(3),(NULL),(4)});");
		assertEquals(expected, e.get().toString());
	}
	
	@Test
	public void testSetUnion() throws SQLException {
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
		
		e = rc.execute("STUDENTS SET UNION STUDENTS2;");
		assertEquals(expected, e.get().toString());
		
		e = rc.execute("STUDENTS SET UNION ENROLLMENTS;");
		assertTrue(e instanceof Left);
	}
	
	@Test
	public void testSetIntersection() throws SQLException {
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
		
		e = rc.execute("STUDENTS SET INTERSECTION STUDENTS2;");
		assertEquals(expected, e.get().toString());
		
		e = rc.execute("STUDENTS SET INTERSECTION ENROLLMENTS;");
		assertTrue(e instanceof Left);
	}
	
	@Test
	public void testSetDifference() throws SQLException {
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
		
		e = rc.execute("STUDENTS SET MINUS STUDENTS2;");
		assertEquals(expected, e.get().toString());
		
		e = rc.execute("STUDENTS SET MINUS ENROLLMENTS;");
		assertTrue(e instanceof Left);
	}
	
	@Test
	public void testSetDivision() throws SQLException {
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
		
		e = rc.execute("ENROLLMENTS SET DIVISION DIVTEST;");
		assertEquals(expected, e.get().toString());
		
		e = rc.execute("STUDENTS SET DIVISION DIVTEST;");
		assertTrue(e instanceof Left);
		
		expected = """
                +---+---+
                | A | B |
                +---+---+
                | a | b |
                +---+---+""";
		
		e = rc.execute("X SET DIVISION Y;");
		assertEquals(expected, e.get().toString());
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
                | d | a | f |
                +---+---+---+
                | c | b | d |
                +---+---+---+""";
		
		e = rc.execute("RENAME A<-D,B<-E(R);");
		assertEquals(expected, e.get().toString());
				
		e = rc.execute("RENAME A<-D,X<-E(R);");
		assertTrue(e instanceof Left);
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
                |                    1 |
                +----------------------+
                |                    5 |
                +----------------------+
                |                    5 |
                +----------------------+""";
		
		e = rc.execute("PROJECT{STUDENT_ID}(ENROLLMENTS JOIN (ENROLLMENTS DIVISION DIVTEST));");
		assertEquals(expected, e.get().toString());
		
		e = rc.execute("PROJECT{B,B}([A : INTEGER]{(1),(2)} JOIN [B : INTEGER]{(3),(4)});");
		assertTrue(e instanceof Left);
	}
	
	@Test
	public void testGeneralizedProjection1() throws SQLException {
		String expected = "";
		Either e = null;
		
		expected = """
                +---+---+---+
                | D | A | C |
                +---+---+---+
                | a | b | c |
                +---+---+---+
                | d | a | f |
                +---+---+---+
                | c | b | d |
                +---+---+---+""";
		
		e = rc.execute("PROJECT{A->D,B->A,C}(R);");
		assertEquals(expected, e.get().toString());
		
		expected = """
                +---+---+
                | D | A |
                +---+---+
                | a | b |
                +---+---+
                | d | a |
                +---+---+
                | c | b |
                +---+---+""";
		
		e = rc.execute("PROJECT{A->D,B->A}(R);");
		assertEquals(expected, e.get().toString());
				
		e = rc.execute("PROJECT{D->A,E->X}(R);");
		assertTrue(e instanceof Left);
	}
	
	@Test
	public void testGeneralizedProjection2() throws SQLException {
		String expected = "";
		Either e = null;
		
		expected = """
                +-------------+-------------+-------------+
                | D : INTEGER | E : INTEGER | F : INTEGER |
                +-------------+-------------+-------------+
                |           2 |           6 |           5 |
                +-------------+-------------+-------------+
                |           5 |           6 |          10 |
                +-------------+-------------+-------------+
                |           4 |           8 |          10 |
                +-------------+-------------+-------------+""";
		
		e = rc.execute("PROJECT{A+1->D,B*C->E,C+B*A->F}([A : INTEGER, B : INTEGER, C: INTEGER]{(1,2,3),(4,1,6),(3,2,4)});");
		assertEquals(expected, e.get().toString());
		
		e = rc.execute("PROJECT{A+1->D,B*C->E,C+B*A->D}([A : INTEGER, B : INTEGER, C: INTEGER]{(1,2,3),(4,1,6),(3,2,4)});");
		assertTrue(e instanceof Left);
		
		e = rc.execute("PROJECT{A+1/(5 - 5)->D}([A : INTEGER, B : INTEGER, C: INTEGER]{(1,2,3),(4,1,6),(3,2,4)});");
		assertTrue(e instanceof Left);
		
		expected = """
                +-------------+-------------+
                | D : INTEGER | E : INTEGER |
                +-------------+-------------+
                |        NULL |           3 |
                +-------------+-------------+
                |           5 |           1 |
                +-------------+-------------+
                |           5 |        NULL |
                +-------------+-------------+""";
		
		e = rc.execute("PROJECT{A+B->D,C/A->E}([A : INTEGER, B : INTEGER, C: INTEGER]{(1,NULL,3),(4,1,6),(3,2,NULL)});");
		assertEquals(expected, e.get().toString());
		
		e = rc.execute("PROJECT{A+B->D,C/A->E}([A, B, C]{(1,NULL,3),(4,1,6),(3,2,NULL)});");
		assertTrue(e instanceof Left);
	}
	
	@Test
	public void testAggregation() throws SQLException {
		String expected = "";
		Either e = null;
		
		expected = """
                +-------------+------------+
                | A : INTEGER | D : BIGINT |
                +-------------+------------+
                |           1 |         12 |
                +-------------+------------+
                |           2 |          8 |
                +-------------+------------+""";
		
		e = rc.execute("GROUP A, SUM(B*C)->D ([A : INTEGER, B : INTEGER, C: INTEGER]{(1,2,3),(1,1,6),(2,2,4)});");
		assertEquals(expected, e.get().toString());
		
		expected = """
                +------------+
                | D : BIGINT |
                +------------+
                |         20 |
                +------------+""";
		
		e = rc.execute("GROUP SUM(B*C)->D ([A : INTEGER, B : INTEGER, C: INTEGER]{(1,2,3),(1,1,6),(2,2,4)});");
		assertEquals(expected, e.get().toString());
		
		expected = """
                +-------------+------------+
                | A : INTEGER | D : BIGINT |
                +-------------+------------+
                |           1 |         12 |
                +-------------+------------+
                |           2 |          8 |
                +-------------+------------+""";
		
		e = rc.execute("GROUP A, SUM(B*C)->D ([A : INTEGER, B : INTEGER, C: INTEGER]{(1,2,3),(1,1,6),(2,2,4),(2,NULL,1)});");
		assertEquals(expected, e.get().toString());
		
		expected = """
                +-------------+------------+
                | A : INTEGER | D : BIGINT |
                +-------------+------------+
                |           1 |          2 |
                +-------------+------------+
                |           2 |          1 |
                +-------------+------------+""";
		
		e = rc.execute("GROUP A, COUNT(B*C)->D ([A : INTEGER, B : INTEGER, C: INTEGER]{(1,2,3),(1,1,6),(2,2,4)});");
		assertEquals(expected, e.get().toString());
		
		expected = """
                +-------------+------------+
                | A : INTEGER | D : BIGINT |
                +-------------+------------+
                |           1 |          2 |
                +-------------+------------+
                |           2 |          1 |
                +-------------+------------+""";
		
		e = rc.execute("GROUP A, COUNT(B*C)->D ([A : INTEGER, B : INTEGER, C: INTEGER]{(1,2,3),(1,1,6),(2,2,4),(2,NULL,1)});");
		assertEquals(expected, e.get().toString());
		
		expected = """
                +------------+
                | C : BIGINT |
                +------------+
                |         25 |
                +------------+""";
		
		e = rc.execute("GROUP COUNT(STUDENT_ID) -> C (STUDENTS PRODUCT COURSES);");
		assertEquals(expected, e.get().toString());
		
		expected = """
                +------------+
                | C : BIGINT |
                +------------+
                |          5 |
                +------------+""";
		
		e = rc.execute("GROUP COUNT(STUDENT_ID) -> C (DISTINCT(PROJECT {STUDENT_ID}(STUDENTS PRODUCT COURSES)));");
		assertEquals(expected, e.get().toString());
	}
	
	@Test
	public void testJoin1() throws SQLException {
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
                |           1 |           3 |
                +-------------+-------------+
                |           1 |           4 |
                +-------------+-------------+
                |           2 |           3 |
                +-------------+-------------+
                |           2 |           4 |
                +-------------+-------------+""";
		e = rc.execute("[A : INTEGER]{(1),(1),(2)} JOIN [B : INTEGER]{(3),(4)};");
		assertEquals(expected, e.get().toString());
		
		expected = """
                +-------------+-------------+-------------+
                | A : INTEGER | B : INTEGER | C : INTEGER |
                +-------------+-------------+-------------+
                |           1 |           3 |           8 |
                +-------------+-------------+-------------+
                |           1 |           2 |        NULL |
                +-------------+-------------+-------------+
                |           5 |           5 |        NULL |
                +-------------+-------------+-------------+""";
		
		e = rc.execute("[A : INTEGER, B : INTEGER]{(1,3),(1,2),(5,5)} LEFT OUTER JOIN [B : INTEGER, C : INTEGER]{(3,8),(4,9)};");
		assertEquals(expected, e.get().toString());
		
		expected = """
                +-------------+-------------+-------------+
                | A : INTEGER | B : INTEGER | C : INTEGER |
                +-------------+-------------+-------------+
                |           1 |           3 |           8 |
                +-------------+-------------+-------------+
                |        NULL |           4 |           9 |
                +-------------+-------------+-------------+""";
		
		e = rc.execute("[A : INTEGER, B : INTEGER]{(1,3),(1,2),(5,5)} RIGHT OUTER JOIN [B : INTEGER, C : INTEGER]{(3,8),(4,9)};");
		assertEquals(expected, e.get().toString());
		
		expected = """
                +-------------+-------------+-------------+
                | A : INTEGER | B : INTEGER | C : INTEGER |
                +-------------+-------------+-------------+
                |           1 |           3 |           8 |
                +-------------+-------------+-------------+
                |           1 |           2 |        NULL |
                +-------------+-------------+-------------+
                |           5 |           5 |        NULL |
                +-------------+-------------+-------------+
                |        NULL |           4 |           9 |
                +-------------+-------------+-------------+""";
		
		e = rc.execute("[A : INTEGER, B : INTEGER]{(1,3),(1,2),(5,5)} OUTER JOIN [B : INTEGER, C : INTEGER]{(3,8),(4,9)};");
		assertEquals(expected, e.get().toString());
	}
	
	@Test
	public void testSelectionNestedConditions() throws SQLException {
		String expected = null;
		Either e = null;

		expected = """
                +-------------+-------------+-------------+
                | A : INTEGER | B : INTEGER | C : INTEGER |
                +-------------+-------------+-------------+
                |           1 |           2 |        NULL |
                +-------------+-------------+-------------+
                |           5 |           5 |        NULL |
                +-------------+-------------+-------------+""";
		
		e = rc.execute("SELECT C = NULL([A : INTEGER, B : INTEGER]{(1,3),(1,2),(5,5)} OUTER JOIN [B : INTEGER, C : INTEGER]{(3,8),(4,9)});");
		assertEquals(expected, e.get().toString());
		
		expected = """
                +-------------+-------------+-------------+
                | A : INTEGER | B : INTEGER | C : INTEGER |
                +-------------+-------------+-------------+
                |           1 |           2 |        NULL |
                +-------------+-------------+-------------+
                |           5 |           5 |        NULL |
                +-------------+-------------+-------------+""";
		
		e = rc.execute("SELECT NOT(C <> NULL)([A : INTEGER, B : INTEGER]{(1,3),(1,2),(5,5)} OUTER JOIN [B : INTEGER, C : INTEGER]{(3,8),(4,9)});");
		assertEquals(expected, e.get().toString());
		
		expected = """
                +-------------+-------------+-------------+
                | A : INTEGER | B : INTEGER | C : INTEGER |
                +-------------+-------------+-------------+
                |           1 |           3 |           8 |
                +-------------+-------------+-------------+
                |        NULL |           4 |           9 |
                +-------------+-------------+-------------+""";
		
		e = rc.execute("SELECT C <> NULL([A : INTEGER, B : INTEGER]{(1,3),(1,2),(5,5)} OUTER JOIN [B : INTEGER, C : INTEGER]{(3,8),(4,9)});");
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
                |           1 |           3 |
                +-------------+-------------+
                |           1 |           4 |
                +-------------+-------------+
                |           1 |           4 |
                +-------------+-------------+""";
		
		e = rc.execute("[A : INTEGER]{(1),(1),(5)} JOIN A < B [B : INTEGER]{(3),(4)};");
		assertEquals(expected, e.get().toString());
		
		e = rc.execute("STUDENTS JOIN NAME = AGE STUDENTS");
		assertTrue(e instanceof Left);
		
		expected = """
                +-------------+-------------+-------------+
                | A : INTEGER | B : INTEGER | C : INTEGER |
                +-------------+-------------+-------------+
                |           1 |           3 |           3 |
                +-------------+-------------+-------------+
                |           1 |           2 |        NULL |
                +-------------+-------------+-------------+
                |           5 |           5 |        NULL |
                +-------------+-------------+-------------+""";
		
		e = rc.execute("[A : INTEGER, B : INTEGER]{(1,3),(1,2),(5,5)} LEFT OUTER JOIN B=C [C : INTEGER]{(3),(4)};");
		assertEquals(expected, e.get().toString());
		
		expected = """
                +-------------+-------------+-------------+
                | A : INTEGER | B : INTEGER | C : INTEGER |
                +-------------+-------------+-------------+
                |           1 |           3 |           3 |
                +-------------+-------------+-------------+
                |        NULL |        NULL |           4 |
                +-------------+-------------+-------------+""";
		
		e = rc.execute("[A : INTEGER, B : INTEGER]{(1,3),(1,2),(5,5)} RIGHT OUTER JOIN B=C [C : INTEGER]{(3),(4)};");
		assertEquals(expected, e.get().toString());
		
		expected = """
                +-------------+-------------+-------------+
                | A : INTEGER | B : INTEGER | C : INTEGER |
                +-------------+-------------+-------------+
                |           1 |           3 |           3 |
                +-------------+-------------+-------------+
                |           1 |           2 |        NULL |
                +-------------+-------------+-------------+
                |           5 |           5 |        NULL |
                +-------------+-------------+-------------+
                |        NULL |        NULL |           4 |
                +-------------+-------------+-------------+""";
		
		e = rc.execute("[A : INTEGER, B : INTEGER]{(1,3),(1,2),(5,5)} OUTER JOIN B=C [C : INTEGER]{(3),(4)};");
		assertEquals(expected, e.get().toString());

		expected = """
				+----------------------+--------+---------------+-------+---------------------+
				| STUDENT_ID : INTEGER | NAME   | AGE : INTEGER | MAJOR | COURSE_ID : INTEGER |
				+----------------------+--------+---------------+-------+---------------------+
				|                    1 |  Alice |            20 |    CS |                 101 |
				+----------------------+--------+---------------+-------+---------------------+
				|                    1 |  Alice |            20 |    CS |                 103 |
				+----------------------+--------+---------------+-------+---------------------+
				|                    2 |    Bob |            21 |  Math |                 101 |
				+----------------------+--------+---------------+-------+---------------------+
				|                    2 |    Bob |            21 |  Math |                 102 |
				+----------------------+--------+---------------+-------+---------------------+
				|                    3 | Claire |            19 |   Bio |                 102 |
				+----------------------+--------+---------------+-------+---------------------+
				|                    4 |  David |            22 |  Econ |                 104 |
				+----------------------+--------+---------------+-------+---------------------+
				|                    5 |  Emily |            20 |    CS |                 101 |
				+----------------------+--------+---------------+-------+---------------------+
				|                    5 |  Emily |            20 |    CS |                 103 |
				+----------------------+--------+---------------+-------+---------------------+""";

		e = rc.execute("STUDENTS JOIN ENROLLMENTS;");
		assertEquals(expected, e.get().toString());

		e = rc.execute("STUDENTS OUTER JOIN ENROLLMENTS;");
		assertEquals(expected, e.get().toString());
	}
	

	
}
