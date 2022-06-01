package Unit4.Day5.Question4;

import java.util.Scanner;

public class Demo {

	static void setDetails(Student student, Scanner sc) {
		System.out.println("Enter the Rol (int) : ");
		int roll = sc.nextInt();
		student.setRoll(roll);
		
		System.out.println("Enter the Name : ");
		sc.nextLine();
		String name = sc.nextLine();
		student.setName(name);
		
		System.out.println("Enter the address : ");
		String address = sc.nextLine();
		student.setAddress(address);
		
		System.out.println("Enter the marks : ");
		int marks = sc.nextInt();
		student.setMarks(marks);
		
		System.out.println("******************************************************");
		
	}
	
	static void getDetails(Student student) {
		System.out.println("The name of the Student is : "+student.getName());
		System.out.println("Roll Number of the student is : "+student.getRoll());
		System.out.println("Address of the Student is : "+student.getAddress());
		System.out.println("Marks scored by the Student is : "+student.getMarks());
		System.out.println("-------------------------------------------------------------------------------");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of Stubent Objects that needs to be created : ");
		int num = sc.nextInt();
		
		Student[] studentArray = new Student[num];
		
		for(int i=0; i<studentArray.length; i++) {
			studentArray[i] = new Student();
			Demo.setDetails(studentArray[i], sc);
		}
		
		for(Student s : studentArray) {
			Demo.getDetails(s);
		}
		
		int sum = 0;
		for(Student s : studentArray) {
			sum += s.getMarks();
		}
		
		System.out.println("Average Marks of All the Students is : "+sum);
	}

}
