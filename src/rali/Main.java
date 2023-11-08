package rali;

import java.util.Scanner;

import rali.util.Either;
import rali.util.Right;

public class Main {

	public static void main(String[] args) {

		System.out.println(".-------.       ____      .---.    .-./`)  \r\n"
				+ "|  _ _   \\    .'  __ `.   | ,_|    \\ .-.') \r\n"
				+ "| ( ' )  |   /   '  \\  \\,-./  )    / `-' \\ \r\n"
				+ "|(_ o _) /   |___|  /  |\\  '_ '`)   `-'`\"` \r\n"
				+ "| (_,_).' __    _.-`   | > (_)  )   .---.  \r\n"
				+ "|  |\\ \\  |  |.'   _    |(  .  .-'   |   |  \r\n"
				+ "|  | \\ `'   /|  _( )_  | `-'`-'|___ |   |  \r\n"
				+ "|  |  \\    / \\ (_ o _) /  |        \\|   |  \r\n"
				+ "''-'   `'-'   '.(_,_).'   `--------`'---'");

		System.out.println("Welcome to RALI, the Relational Algebra Learning Instrument!");
		System.out.println();
		System.out.println("Type :quit to exit.");
		System.out.println("Type :examples to load the default relations STUDENTS, ENROLLMENTS, and COURSES.");
		System.out.println();
		
		try {
			RALIController.getInstance().createDatabaseAndLoadData();
			
			Scanner commands = new Scanner(System.in);
			while (true) {
				String command = commands.nextLine();
				if (":quit".equals(command.toLowerCase()))
					break;
				else if (":examples".equals(command.toLowerCase())) {
					System.out.println("STUDENTS:");
					System.out.println(RALIController.getInstance().execute("STUDENTS = [STUDENT_ID : INTEGER,  NAME, AGE : INTEGER, MAJOR]{(1,\"Alice\",20,\"CS\"),(2,\"Bob\",21,\"Math\"),(3,\"Claire\",19,\"Bio\"),(4,\"David\",22,\"Econ\"),(5,\"Emily\",20,\"CS\")}").get());
					System.out.println("COURSES:");
					System.out.println(RALIController.getInstance().execute("COURSES = [COURSE_ID : INTEGER,  COURSE_NAME, INSTRUCTOR]{(101,\"Calculus\",\"Smith\"),(102,\"Biology\",\"Johnson\"),(103,\"Computer Science\",\"Lee\"),(104,\"Microeconomics\",\"Chen\"),(105,\"English\",\"Davis\")}").get());
					System.out.println("ENROLLMENTS:");
					System.out.println(RALIController.getInstance().execute("ENROLLMENTS = [STUDENT_ID : INTEGER, COURSE_ID : INTEGER]{(1,101),(1,103),(2,101),(2,102),(3,102),(4,104),(5,101),(5,103)}").get());
					System.out.println("Relations loaded.");
				} else {
					Either result = RALIController.getInstance().execute(command);
					if(result instanceof Right)
						System.out.println(result.get());
					else
						System.err.println(result.get());
				}
			}
			commands.close();
		} catch (Exception e) {
			System.err.printf("Encountered error: %s", e.getMessage());
			System.err.println(e);
			e.printStackTrace();
			System.err.println("Termninating program.");
		}

	}

//    .-''-.  .-------.       ____      .---.    .-./`)  
//  .'_ _   \ |  _ _   \    .'  __ `.   | ,_|    \ .-.') 
// / ( ` )   '| ( ' )  |   /   '  \  \,-./  )    / `-' \ 
//. (_ o _)  ||(_ o _) /   |___|  /  |\  '_ '`)   `-'`"` 
//|  (_,_)___|| (_,_).' __    _.-`   | > (_)  )   .---.  
//'  \   .---.|  |\ \  |  |.'   _    |(  .  .-'   |   |  
// \  `-'    /|  | \ `'   /|  _( )_  | `-'`-'|___ |   |  
//  \       / |  |  \    / \ (_ o _) /  |        \|   |  
//   `'-..-'  ''-'   `'-'   '.(_,_).'   `--------`'---'  

}
