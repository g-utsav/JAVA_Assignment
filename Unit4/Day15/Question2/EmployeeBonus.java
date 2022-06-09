package Unit4.Day15.Question2;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class EmployeeBonus {
	
	static int getAge(String joining) throws InvalidAgeException{
		
		try {
			DateTimeFormatter formatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy");
			LocalDate doj = LocalDate.parse(joining, formatObj);
			
			LocalDate now = LocalDate.now();
			
			Period period = Period.between(doj, now);
			
			int p = period.getYears();
			int m = period.getMonths();
			int d = period.getDays();
			
			if(p != 0 && p > 0) {
				return p;
			}else if(m > 0) {
				return m/10;
			}else if(d > 0) {
				return d/10;
			}else {
				throw new InvalidAgeException("Age should not be in the future .");
			}
		}catch(DateTimeParseException e) {
			throw new InvalidAgeException("Please pass the date in the correct format");
		}
	}
	
	static void getBonus(int year) {
		int salary;
		if(year <= 1) {
			salary = 5000;
		}else if(year >1 && year <=2) {
			salary = 8000;
		}else {
			salary = 10000;
		}
		System.out.println("The Bonus for the Employee is : "+salary);
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Date of joining in dd-MM-yyyy format : ");
		String date = sc.next();
		
		try {
			int workingTime = getAge(date);
			getBonus(workingTime);
		}catch(InvalidAgeException e) {
			System.out.println(e.getMessage());
		}
		finally {
			sc.close();
		}
	}

}
