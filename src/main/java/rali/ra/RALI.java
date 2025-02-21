package rali.ra;

import java.util.Scanner;

import rali.util.Either;
import rali.util.Right;

public class RALI {

	public static void main(String[] args) {

		System.out.println("""
                .-------.       ____      .---.    .-./`)  \r
                |  _ _   \\    .'  __ `.   | ,_|    \\ .-.') \r
                | ( ' )  |   /   '  \\  \\,-./  )    / `-' \\ \r
                |(_ o _) /   |___|  /  |\\  '_ '`)   `-'`"` \r
                | (_,_).' __    _.-`   | > (_)  )   .---.  \r
                |  |\\ \\  |  |.'   _    |(  .  .-'   |   |  \r
                |  | \\ `'   /|  _( )_  | `-'`-'|___ |   |  \r
                |  |  \\    / \\ (_ o _) /  |        \\|   |  \r
                ''-'   `'-'   '.(_,_).'   `--------`'---'""");

		System.out.println("Welcome to RALI, the Relational Algebra Learning Instrument!");
		System.out.println();
		System.out.println("Type :quit to exit.");
		System.out.println("Type :examples to load the default relations STUDENTS, ENROLLMENTS, and COURSES.");
		System.out.println("Type :letters to load the default relations R, S, T, U, V, X and Y.");
		System.out.println();
		
		try {
			RALIController rc = RALIController.getInstance();
			rc.createDatabaseAndLoadData();

			Scanner commands = new Scanner(System.in);
			while (true) {
				String command = commands.nextLine();
				if (":quit".equalsIgnoreCase(command))
					break;
				else if (":examples".equalsIgnoreCase(command)) {
					System.out.println("STUDENTS:");
					System.out.println(rc.execute("STUDENTS = [STUDENT_ID : INTEGER,  NAME, AGE : INTEGER, MAJOR]{(1,\"Alice\",20,\"CS\"),(2,\"Bob\",21,\"Math\"),(3,\"Claire\",19,\"Bio\"),(4,\"David\",22,\"Econ\"),(5,\"Emily\",20,\"CS\")}").get());
					System.out.println("COURSES:");
					System.out.println(rc.execute("COURSES = [COURSE_ID : INTEGER,  COURSE_NAME, INSTRUCTOR]{(101,\"Calculus\",\"Smith\"),(102,\"Biology\",\"Johnson\"),(103,\"Computer Science\",\"Lee\"),(104,\"Microeconomics\",\"Chen\"),(105,\"English\",\"Davis\")}").get());
					System.out.println("ENROLLMENTS:");
					System.out.println(rc.execute("ENROLLMENTS = [STUDENT_ID : INTEGER, COURSE_ID : INTEGER]{(1,101),(1,103),(2,101),(2,102),(3,102),(4,104),(5,101),(5,103)}").get());
					System.out.println("Relations loaded.");
					
					
				} else if (":letters".equalsIgnoreCase(command)) {
					System.out.println("R:");
					System.out.println(rc.execute("R = [A,B,C]{(\"a\",\"b\",\"c\"),(\"d\",\"a\",\"f\"),(\"c\",\"b\",\"d\")}").get());
					System.out.println("S:");
					System.out.println(rc.execute("S = [A,B,C]{(\"b\",\"g\",\"a\"),(\"d\",\"a\",\"f\")}").get());
					System.out.println("T:");
					System.out.println(rc.execute("T = [D,E]{(\"a\",\"b\"),(\"c\",\"d\")}").get());
					System.out.println("U:");
					System.out.println(rc.execute("U = [B,G:INTEGER]{(\"a\",1),(\"c\",2)}").get());
					System.out.println("V:");
					System.out.println(rc.execute("V = [D,E,F:INTEGER]{(\"b\",\"g\",1),(\"d\",\"a\",2)}").get());
					System.out.println("X:");
					System.out.println(rc.execute("X = [A,B,C,D]{(\"a\",\"b\",\"c\",\"d\"),(\"a\",\"b\",\"e\",\"f\"),(\"g\",\"h\",\"c\",\"d\"),(\"i\",\"j\",\"k\",\"l\")}").get());
					System.out.println("Y:");
					System.out.println(rc.execute("Y = [C,D]{(\"c\",\"d\"),(\"e\",\"f\")}").get());
					System.out.println("Relations loaded.");
				} else {
					Either result = rc.execute(command);
					if(result instanceof Right)
						System.out.println(result.get());
					else
						System.err.println(result.get());
				}
			}
			commands.close();
		} catch (Exception e) {
			System.err.printf("Encountered error: %s", e.getMessage());
			// System.err.println(e);
			// e.printStackTrace();
			System.err.println("Termninating program.");
		}

	}

}
