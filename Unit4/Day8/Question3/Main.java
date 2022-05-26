package Unit4.Day8.Question3;

/*Q3) Explain dynamic polymorphism ?
 *  It is a process in which the method Overriding is achieved at the RunTime rather than the Compile Time
 *  
 *  That is if say in the Parent Class we have a method say funA() and we have the same method with the same
 *  signature in its child class with say different implementation the the dispute on which method to call
 *  is resolved at RunTime and preference is given to the Overidden method that is the funA() mathod of Main
 *  which overrides the funA() method of Test and hence the Overriden method is resolved 
 * 
 * */

public class Main extends Test{
	
	public Main() {
		super();
	}
	
	@Override
	public void funA() {
		System.out.println("This is Main");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Example :-
		Main m = new Main();
		m.funA();
	}

}
