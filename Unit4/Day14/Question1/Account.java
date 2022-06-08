package Unit4.Day14.Question1;

public class Account {

	String accountNumber; 
	double Balance;
	
	public Account(String accountNumber) {
		super();
		this.accountNumber = accountNumber;
	}
	
	public Account() {
		super();
	}
	
    protected void deposit(double amount) throws Exception{
    	if(amount < 0) {
    		throw new Unit4.Day14.Question1.InvalidFundInputException("Amount should be greater than 0");
    	}else {
    		this.Balance += amount;
    	}
    	
    }
	protected double withdraw(double amount) throws InsufficientFundsException{
		if(amount > this.Balance) {
			throw new InsufficientFundsException("Funds insufficiedt.");
		}else {
			this.Balance -= amount;
			return this.Balance;
		}
    }
	
}
