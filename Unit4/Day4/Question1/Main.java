package Unit4.Day4.Question1;

import java.util.Scanner;

public class Main {
	
	static int roll;
	static String name;
	static int age;
	static int marks;
	
	static void getStudentDetails() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Roll Number(int) : ");
		Main.roll = sc.nextInt();
		
		sc.nextLine();
		System.out.println("Enter the name : ");
		Main.name = sc.nextLine();
		
		System.out.println("Enter Age : ");
		Main.age = sc.nextInt();
		
		System.out.println("Enter marks : ");
		Main.marks = sc.nextInt();
	}
	
	public static void main(String[] args) {
		
		Main.getStudentDetails();
		Student student1 = new Student(Main.roll, Main.name, Main.age, Main.marks);
		
		Student student2 = new Student();
	}

}
