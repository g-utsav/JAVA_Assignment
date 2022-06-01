package Unit4.Day5.Question3;

public class Account {

	private int accountId;
	private String accountType;
	private int balance;
	
	public Account(int accountId, String accountType, int balance) {
		super();
		this.accountId = accountId;
		this.accountType = accountType;
		this.balance = balance;
	}
	public Account() {
		super();
	}
	
	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	 public boolean withdraw(int amt) {
		 if(this.balance > amt) {
			 int temp = this.balance - amt;
			 this.balance = temp;
			 System.out.println("Balance amount after withdraw: "+temp);
			 return true;
		 }
		 System.out.println("Sorry!!! No enough balance");
		 return false;
	 }
	
}
