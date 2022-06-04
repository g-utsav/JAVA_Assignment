package Unit4.Day11.Question3;

import java.util.Scanner;

public class IPL {
	
	void homeTeamStadium(Stadium stadium){
		String str = stadium.toString();
		
		if(str.equals("EDEN_GARDENS_STADIUM")) {
			System.out.println("This is the home ground of KKR");
		}
		if(str.equals("WANKHEDE_STADIUM")) {
			System.out.println("This is the home ground of Mumbai Indians");
		}
		if(str.equals("CHIDAMBARAM_STADIUM")) {
			System.out.println("This is the home ground of CSK");
		}
		if(str.equals("M_CHINNASWAMY_STADIUM")) {
			System.out.println("This is the home ground of RCB");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Stadium Name : ");
		Stadium s = null;
		
		try {
			 s = Stadium.valueOf(sc.nextLine());
		}
		catch(Exception e) {
			System.out.println("Invalid Name Entered"+e);
		}
		IPL ipl = new IPL();
		ipl.homeTeamStadium(s);
		
		sc.close();
	}

}
