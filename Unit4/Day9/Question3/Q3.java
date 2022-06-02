package Unit4.Day9.Question3;

/*Q3) Why is multiple inheritance not supported in Java at class level ?
 * 		=> Multiple Inheritance inheritance is not supported in JAVA because there can be a conflict while extending the child
 * class( i.e. if we have two parent class than there can also be members in that class with the same name which can lead to 
 * confusion of the compiler on which to call that is why Multiple Inheritance is not supported in java)
 * 
 *  say we have two parent class P1 and P2  and both of them have a method with same name say method1();
 *  
 *  Now if we have a child class C1 extends P1, P1 i.e. it extends both P1 and P2 then the compiler will be confused on 
 *  that mwthod1(); refers to which object member i.e. if there is a call to method1(); then the JVM wont be able to distinguish
 *  if the method1() belongs to P1 or P2 so to avoid this type of confusion Multiple Inheritance is not supported in JAVA.
 * 
 * 
 * */

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
