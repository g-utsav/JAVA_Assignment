package Unit4.Day8.Question2;


/*
 * Q2) Explain ClassCastException with the help of the example.
 * 
 * ClassCastException :- When we try Down caste the object of Parent class defined in Same Class Reference
 * Same Class Object into its child class thats when we get ClassCasteException but the reverse is possible
 * i.e. if we UpCaste Child Class Object defined ins Same Class Reference Same Class Object and we try to UpCaste
 * it to its Parent Class its possible.  
 * 
 * */

public class Main extends Test{
	
	public Main() {
		super();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Example : -
		
		Test t = new Test();//Super(Parent) Class
		
		Main m = (Main)t;//Down Casting Parent Object to Child (Illegal)
		
		
	}

}
