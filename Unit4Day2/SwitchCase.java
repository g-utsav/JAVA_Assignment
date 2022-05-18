package Unit4Day2;

public class SwitchCase {

	public static void main(String[] args) {
		String city = "Delhi";
		findCity(city);
		
		city = "Mumbai";
		findCity(city);
		
		city = "Rachi";
		findCity(city);
	}
	
	static void findCity(String city) {
		switch (city) {
			case ("Mumbai"):
				System.out.println("Financial city");
				break;
			
			case ("Kolkata"):
				System.out.println("City of Joy");
				break;
				
			case ("Delhi"):
				System.out.println("Capital of the country");
				break;
				
			case ("Bangalore"):
				System.out.println("Capital of the country");
				break;
				
			default :
				System.out.println("May be Other Indian City");
				break;
		}
	}

}
