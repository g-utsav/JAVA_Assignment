package Unit4.Day14.Question2;

import java.util.Scanner;

public class UserRegistration {

	void registerUser(String userName, String userCountry) throws InvalidCountryException{
		if(!(userCountry.equals("India"))) {
			throw new InvalidCountryException("User Outside India cannot be registered.");
		}else {
			System.out.println("User registration done successfully");
		}
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter user Name : ");
		String name = sc.nextLine();
		
		System.out.println("Enter User country : ");
		String country = sc.nextLine();
		
		UserRegistration ur = new UserRegistration();
		
		try {
			ur.registerUser(name, country);
		} catch (InvalidCountryException e) {
			System.out.println(e.getMessage());
		}
		
		sc.close();
	}

}
