package Unit4.Day10.Question2;

import java.util.Scanner;

public class AllStudents {
	
	static void sdent(Student s, Scanner sc) {
		System.out.println("Enter Name : ");
		sc.nextLine();
		s.name = sc.nextLine();
		System.out.println("Enter Address : ");
		s.address = sc.nextLine();
	}
	
	static ScienceStudent createScienceStudent(Scanner sc) {
		ScienceStudent student = new ScienceStudent();
		AllStudents.sdent(student, sc);
		
		System.out.println("Enter Physics Marks");
		student.phisicsMarks = sc.nextInt();
		System.out.println("Enter Maths Marks");
		student.mathsMarks = sc.nextInt();
		System.out.println("Enter Chemistry Marks");
		student.chemistryMarks = sc.nextInt();
		
		return student;
		
	}
	
	static HistoryStudent createHistoryStudent(Scanner sc) {
		HistoryStudent student = new HistoryStudent();
		AllStudents.sdent(student, sc);
		
		System.out.println("Enter History Marks");
		student.historyMarks = sc.nextInt();
		System.out.println("Enter Civics Marks");
		student.civicsMarks = sc.nextInt();

		return student;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		ScienceStudent science = createScienceStudent(sc);
		
		System.out.println("The Percentage of Science Student is : "+science.getPercentage());
		
		System.out.println("***********************************************************************************");
		HistoryStudent history = createHistoryStudent(sc);
		System.out.println("The Percentage of History Student is : "+history.getPercentage());
		
		sc.close();
	}

}
