package Unit4.Day14.Question3;

/*Q3) Explain Finally and Final Keyword with an Example?
 * 
 * 	finally => This keyword is used with with try-catch block to execute default code which needs to be executed irrespective of sucessful Terminatation
 * of in-sucessful termination (Exception) of application
 * 
 * syntax : try{
 * 				//Code here
 * 			}catch(<exceptionType> variable){
 * 				//If Exception Occurs then that code here
 * 			}finally{
 * 				//Default code here which will fun irrespective of sucessful/in-sucessfull(Exception) Termination of try Block
 * 			}
 * 
 * 	final => This keyword is used in the signature of member to set the respective member as immutable ie if a variable is declared using a final
 * keyword then the value of the variable cannot be reassigned/changed at he later stages of the program it acts as a constant  if a method is declared
 * with a final keyword then the method cannot be overriden when that class is extended
 * 
 * 
 * */


public class Q3 {

	static final int i = 10;
	
	public static void main(String[] args) {
		//The variable i cannot be modified because it is declared with final keyword 
//		i =20;
		

		// Here there wont be any exception . finally block will be executed
		try {
			int num1 = 100/10;
			System.out.println(num1);
		}catch(Exception e) {
			System.out.println(e);
		}finally {
			System.out.println("This will be executed");
		}

		
		// Here there will be any exception . finally block will be executed
		try {
			int num1 = 100/0;
			System.out.println(num1);
		}catch(Exception e) {
			System.out.println(e);
		}finally {
			System.out.println("This will be executed");
		}
		
	}
	
	
}
