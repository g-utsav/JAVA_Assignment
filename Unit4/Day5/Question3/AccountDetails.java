package Unit4.Day5.Question3;

import java.util.Scanner;

public class AccountDetails {
	
	
	
	public Account getAccountDetails() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Account ID (int) : ");
		int id = sc.nextInt();
		
		System.out.println("Enter Account Type : ");
		sc.nextLine();
		String type = sc.nextLine();
		
		System.out.println("Enter Account Balance : ");
		int bal;
		while(true) {
			bal = sc.nextInt();
			if(bal > 0) {
				break;
			}
			System.out.println("Balance must be Greater than 0 : (Try Again) :");
		}
		
		
		return new Account(id, type, bal);
	}
	
	public int getWithdrawAmount(Account a) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Amount to Withdraw : ");
		int amt = sc.nextInt();
		while(amt <= 0) {
			System.out.println("Amount should be positive : Try Again : ");
		amt = sc.nextInt();
		}
		a.withdraw(amt);
		
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AccountDetails ad = new AccountDetails();
		
		Account acount = ad.getAccountDetails();
		
		ad.getWithdrawAmount(acount);

	}

}
