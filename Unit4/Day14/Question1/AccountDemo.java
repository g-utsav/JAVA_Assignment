package Unit4.Day14.Question1;

import java.util.Scanner;

public class AccountDemo {
	
	static void withdraw(Account account, Scanner sc) {
	
		System.out.println("Enter the amount to Withdraw : ");
		
		try {
			
			double amount = sc.nextDouble();
			System.out.println("The Balance left in account " +account.withdraw(amount));
			
		}catch(InsufficientFundsException ife) {
			System.out.println(ife.getMessage());
			
		}catch(Exception e) {
			System.out.println(e);
			
		}
		finally {
			System.out.println("ThankYou");
		}
	}
	
	static void deposit(Account account, Scanner sc) {
		System.out.println("Enter the amount to Deposit : ");
		
		
		try {
			
			double amount = sc.nextDouble();
			account.deposit(amount);
			
		}catch(InvalidFundInputException ifie) {
			System.out.println(ifie.getMessage());
			
		} catch (Exception e) {
			System.out.println(e);
			
		}finally {
			System.out.println("ThankYou");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		Account account = new Account("123456");
		
		AccountDemo.deposit(account,sc);
		
		AccountDemo.withdraw(account, sc);
		

		
	}

}
