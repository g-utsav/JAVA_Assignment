package Unit4.Day5.Question2;

public class Ticket {

	private int ticketid;
	private int price;
	private static int availableTickets;
	
	public Ticket() {
		super();
	}
	
	public void setTicketId(int val) {
		this.ticketid = val;
	}
	public int getTicketId() {
		return this.ticketid;
	}
	
	public void setPrice(int val) {
		this.price = val;
	}
	public int getPrive() {
		return this.price;
	}	
	
	public void setAvailabeTickets(int val) {
		if(val > 0)
		Ticket.availableTickets = val;
		else
			System.out.println("Invalid Input");
	}
	public int getAvailableTickets() {
		return Ticket.availableTickets;
	}
	
	public int calculateTicketCost(int nooftickets) {
		int temp = Ticket.availableTickets - nooftickets;
		if(temp >=0 ) {
			Ticket.availableTickets = temp;
			return nooftickets * this.price;
		}else {
			return -1;
		}
	}
	
}
