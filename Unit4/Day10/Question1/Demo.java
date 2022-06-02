package Unit4.Day10.Question1;

import java.util.Scanner;

public class Demo {
	
	public Hotel provideFood(int amount) {
		Hotel hotel = null;
		if(amount >= 1000) {
			hotel = new TajHotel();
		}
		else if(amount >= 200 && amount < 1000) {
			hotel = new RoadSideHotel();
		}
		else {
			System.out.println("Enter a valid amount");
		}
		
		return hotel;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the amount : ");
		int amount = sc.nextInt();
		
		Demo demo = new Demo();
		Hotel hotel = demo.provideFood(amount);
		
		if(hotel != null) {
			hotel.chickenBiryani();
			hotel.masalaDosa();
		}
		
		if(hotel instanceof TajHotel) {
			TajHotel tjh = (TajHotel)hotel;
			
			tjh.welcomeDrink();
		}
		
		sc.close();

	}

}
