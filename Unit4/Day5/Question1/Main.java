package Unit4.Day5.Question1;

import java.util.Scanner;

public class Main {
	
	public static Employee getEmployeeDetails() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Employee ID : ");
		int id = sc.nextInt();
		
		System.out.println("Enter Employee Name : ");
		sc.nextLine();
		String name = sc.nextLine();
		
		System.out.println("Enter Employee Salary : ");
		double salary = sc.nextDouble();
		
		
		return new Employee(id, name, salary);
	}
	
	public static int getPFPercentage() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter PF percentage : ");
		int pf = sc.nextInt();
		
		sc.close();
		return pf;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp = Main.getEmployeeDetails();
		
		emp.calculateNetSalary(Main.getPFPercentage());
		
		System.out.println("ID : "+emp.getEmployeeId());
		System.out.println("Name : "+emp.getEmployeeName());
		System.out.println("Salary : "+emp.getSalary());
		System.out.println("Net Salary : "+emp.getNetSalary());
		

	}

}
