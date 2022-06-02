package Unit4.Day10.Question1;

public class TajHotel implements Hotel {
	
	@Override 
	public void masalaDosa() {
		System.out.println("Masala Dosa from Taj Hotel");
	}

	@Override
	public void chickenBiryani() {
		System.out.println("Chicken Biriyani from Taj Hotel");
	}
	
	public void welcomeDrink(){
		System.out.println("Welcome Drink from the TajHotel");
	}
}
