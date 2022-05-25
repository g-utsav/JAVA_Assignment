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
		
		sc.close();
	}
	
	static void setStudentDetails(Student student){
		student.setAge(age);
		student.setMarks(marks);
		student.setName(name);
		student.setRoll(roll);
		
	}
	
	static void showStudentDetails(Student student) {
		System.out.println("Name of the Student : "+student.getName());
		System.out.println("Roll Number of the Student : "+student.getRoll());
		System.out.println("Age of the Student : "+student.getAge());
		System.out.println("Marks Scored by the Student : "+student.getMarks());
	}
	
	public static void main(String[] args) {
		
		Main.getStudentDetails();
		Student student1 = new Student(Main.roll, Main.name, Main.age, Main.marks);
		Main.showStudentDetails(student1);
		
		Main.getStudentDetails();
		Student student2 = new Student();
		Main.setStudentDetails(student2);
		Main.showStudentDetails(student2);
		
	}

}
