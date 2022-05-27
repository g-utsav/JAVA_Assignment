package Unit4.Day7.Question4;

import java.util.Scanner;

public class Demo {
	
	
	public static Bank getBank(String bank) {
		Scanner sc = new Scanner(System.in);
		
		if(bank.equals("axis")) {
			return new AxisBank(sc);
		}else if(bank.equals("icici")) {
			return new ICICIBank(sc);
		}else {
			return null;
		}
	}
	
	static void findBank(Bank b) {
		if(b instanceof AxisBank) {
			b.displayDetails();
			((AxisBank)b).getCreditCard();
		}else if(b instanceof ICICIBank) {
			b.displayDetails();
		}else {
			System.out.println("Invalid Bank Name");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter Bank Name (axis / icici) : ");
		Bank b = Demo.getBank(sc.next());
		Demo.findBank(b);
		
		System.out.println("****************************************");
		
		System.out.println("Enter Bank Name (axis / icici) : ");
		b = Demo.getBank(sc.next());
		Demo.findBank(b);

		System.out.println("****************************************");
		
		System.out.println("Enter Bank Name (axis / icici) : ");
		b = Demo.getBank(sc.next());
		Demo.findBank(b);
		
		sc.close();

		
		
	}

}
