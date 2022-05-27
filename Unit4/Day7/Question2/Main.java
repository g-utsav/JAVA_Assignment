package Unit4.Day7.Question2;

import java.util.Scanner;

public class Main {
	
	public Main() {
		super();
	}

	static void setDetails(DayScholar[] d, Scanner sc) {
		
		for(int i=0; i<2; i++) {
			d[i] = new DayScholar();
			setDetails((Student)d[i], sc);
			System.out.println("Enter Transport Fees (double): ");
			d[i].transportFee = sc.nextDouble();
			System.out.println("*************************************************************");
		}
		
	}
	
	static void setDetails(Hosteller[] d, Scanner sc) {
		
		for(int i=0; i<2; i++) {
			d[i] = new Hosteller();
			setDetails((Student)d[i], sc);
			System.out.println("Enter Hostel Fees (double): ");
			d[i].hostelFee = sc.nextDouble();
			System.out.println("*************************************************************");
		}
		
	}
	
	static void setDetails(Student s, Scanner sc) {
		
		System.out.println("Enter Student Id (int): ");
		s.studId = sc.nextInt();
		
		System.out.println("Enter Student Name (String): ");
		sc.nextLine();
		s.studName = sc.nextLine();
		
		System.out.println("Enter Exam Fee (double): ");
		s.examFee = sc.nextDouble();
		
		
	}
	static void payFee(Student[] std, Scanner sc) {
		for(Student s : std) {
			System.out.println("Student "+s.studName+" Having Student"
		+" ID as "+s.studId +" Enter the Amount You would like to Pay : ");
			System.out.print("Amount Left to Pay is "+s.payFee(sc.nextDouble())+"\n\n");
			
			System.out.println("-------------------------------------------------------------------");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		DayScholar[] ds = new DayScholar[2];
		Hosteller[] hs = new Hosteller[2];
		
		setDetails(ds, sc);
		payFee(ds, sc);
		
		setDetails(hs, sc);
		payFee(hs, sc);
		
		sc.close();
		
	}

}
