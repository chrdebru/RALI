package rali;

public class Main {

	public static void main(String[] args) {


		try {
			RALIController.getInstance().createDatabaseAndLoadData();
			
			
			//System.out.println(RALIController.getInstance().execute("ENROLLMENTS JOIN (ENROLLMENTS DIVISION DIVTEST)").get());
			
			System.out.println(RALIController.getInstance().execute("STUDENTS").get());
			System.out.println(RALIController.getInstance().execute("COURSES").get());
			System.out.println(RALIController.getInstance().execute("ENROLLMENTS").get());

//			Scanner commands = new Scanner(System.in);
//			while (true) {
//				String command = commands.next();
//				if (":quit".equals(command.toLowerCase()))
//					break;
//				
//				Either result = RALIController.getInstance().execute(command);
//				if(result instanceof Right)
//					System.out.println(result.get());
//				else
//					System.err.println(result.get());
//			}
//			commands.close();
		} catch (Exception e) {
			System.err.printf("Encountered error: %s", e.getMessage());
			System.err.println(e);
			e.printStackTrace();
			System.err.println("Termninating program.");
		}

	}




}
