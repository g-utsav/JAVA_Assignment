package Unit4.Day4.Question3;

import java.util.Scanner;

public class Demo {
	
	static int roll;
	static String name;
	static String address;
	static String collageName;
	
	public static Student getStudent(boolean isFromNIT) {
		Demo.fillDetails(isFromNIT);
		if(isFromNIT) {
			return new Student(Demo.roll, Demo.name, Demo.address, "NIT");
		}else {
			return new Student(Demo.roll, Demo.name, Demo.address, Demo.collageName);
		}
	}
	
	public static void fillDetails(boolean flag) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Roll Number of the Studen(int)  : ");
		Demo.roll = sc.nextInt();
		
		System.out.println("Enter the Name of the Student(String) : ");
		sc.nextLine();
		Demo.name = sc.nextLine();
		
		System.out.println("Enter the Address(String) : ");
//		sc.nextLine();
		Demo.address = sc.nextLine();
		
		if(!flag) {
			System.out.println("Enter College Name(String) : ");
//			sc.nextLine();
			Demo.collageName = sc.nextLine();;
		}
		
		sc.close();
		
	}
	
	static void getDetails(Student std) {
		System.out.println("Name of the Student is : "+std.getName());
		System.out.println("Roll Number of the Student is "+std.getRoll());
		System.out.println("Address of the Student is "+std.getAddress());
		System.out.println("College of the Student is "+std.getCollageName());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Is the Student from NIT : (true/false) ");
		boolean isFromNIT = sc.nextBoolean();
		
		Student std1 = Demo.getStudent(isFromNIT);
		Demo.getDetails(std1);
		
		
		System.out.println("==================================================");
		
		System.out.println("Is the Student from NIT : (true/false) ");

		isFromNIT = sc.nextBoolean();
		Student std2 = Demo.getStudent(isFromNIT);
		Demo.getDetails(std2);
		
		sc.close();
	}

}
