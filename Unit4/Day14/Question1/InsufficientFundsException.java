package Unit4.Day14.Question1;

public class InsufficientFundsException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InsufficientFundsException(String message){
		super(message);
	}
	
	public InsufficientFundsException() {
		super();
	}
}
