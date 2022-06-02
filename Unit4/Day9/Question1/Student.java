package Unit4.Day9.Question1;

import java.util.Scanner;

public class Student {

	private int roll;
	private String name;
	private int marks;
	private char grade;
	
	public Student(int roll, String name, int marks, char grade) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
		this.grade = grade;
	}
	public Student() {
		super();
	}
	
	public void displayDetails() {
	
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Roll Number (int) : ");
		this.roll = sc.nextInt();
		
		System.out.println("Enter the Name (String) : ");
		sc.nextLine();
		this.name = sc.nextLine();
		
		System.out.println("Enter the Marks (int) : ");
		this.marks = sc.nextInt();
		
		char grade = this.calculateGrade();
		this.grade = grade;
		
		System.out.println(this);
		sc.close();
	}
	
	private char calculateGrade() {
		char out = ' ';
		
		if(marks >= 500) out ='A';
		if(marks < 500 && marks >= 400) out ='B';
		if(marks < 400 ) out = 'C';
		
		return out;
	}
	
	@Override
	public String toString() {
		return "Student=[ Roll = "+this.roll+", Name = "+this.name+", Marks = "+this.marks+", Grade = "+this.grade+" ]";
	}
}
