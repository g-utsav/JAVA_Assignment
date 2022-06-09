package Unit4.Day15.Question1;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
//import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Main {

	int getAge()throws InvalidDateFormat {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Date of Birth : ");
		
		try {
			String dt = sc.next();
			
			DateTimeFormatter formatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy");
			
			LocalDate date = LocalDate.parse(dt, formatObj);
			LocalDate now = LocalDate.now();
			
//			long age = ChronoUnit.YEARS.between(date, now);
			
			Period period  = Period.between(date, now);
			
			int p = period.getYears();
			
			if(p <= 0) {
				throw new InvalidDateFormat("Date Should Not be in Future");
			}
			
			return p;
			
		}catch(DateTimeParseException dtpe) {
			throw new InvalidDateFormat("Error Enter the date in dd-MM-yyyy format");
		}
		finally {
			sc.close();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main m = new Main();
		
		try {
			System.out.println(m.getAge());
		}catch(InvalidDateFormat idf) {
			System.out.println(idf.getMessage());
		}
	}

}
