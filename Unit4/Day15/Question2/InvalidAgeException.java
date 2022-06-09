package Unit4.Day15.Question2;

public class InvalidAgeException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public InvalidAgeException(String message) {
		super(message);
	}
	
	public InvalidAgeException() {
		super();
	}

}
