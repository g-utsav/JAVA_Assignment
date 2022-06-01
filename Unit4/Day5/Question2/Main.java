package Unit4.Day5.Question2;

import java.util.Scanner;

public class Main {
	
	public Main() {
		super();
	}
	
	static void setDetails(Scanner sc, Ticket tkt) {
		System.out.println("Enter the Available Tickets : ");
		int tktno = sc.nextInt();
		tkt.setAvailabeTickets(tktno);
		
		System.out.println("Enter the Ticket ID : ");
		tkt.setTicketId(sc.nextInt());
		
		System.out.println("Enter the price : ");
		tkt.setPrice(sc.nextInt());
		
		System.out.println("Enter the Number Of Tickets : ");
		int numberTkt = sc.nextInt();
		int cost = tkt.calculateTicketCost(numberTkt);
//		tkt.setAvailabeTickets(tkt.getAvailableTickets() - numberTkt);
		
	
		Main.getDetails(cost, tkt, tktno);
	}
	
	static void getDetails(int cost, Ticket tkt, int tktno) {
		System.out.println("Available Tickets : "+tktno);
		
		System.out.println("Total Amount : "+ cost);
		
		System.out.println("Available Tickets after Booking : "+tkt.getAvailableTickets());
		System.out.println("***************************************************\n");
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Ticket tkt = new Ticket();
		
		System.out.println("Enter Number of Bookings : ");
		int N = sc.nextInt();
		
		for(int i=0; i<N; i++) {
			Main.setDetails(sc,tkt);			
		}
		
		
		
		sc.close();
	}

}
