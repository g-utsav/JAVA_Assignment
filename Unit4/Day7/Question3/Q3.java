package Unit4.Day7.Question3;

/*Q3) What is the use of ‘this’ and ‘super’ keyword in java explain with example.
 * 
 * 		=> 'this' keyword is used to refer to the self - object. By using 'this' keyword we can acess
 * the members of the same class object . 'this' keyword can only be acessed in non-static members or functions
 * also any change in the static members will be reflected all throughout the program as the value
 * of the static member is stored in Context-Area so a change in the value of static members will be 
 * reflected in other seperate same class objects where as the change in non-static members will only
 * be acessible in that object itself other same class object will not be affected as they are in 
 * Heap-Memory.  Also we can use this keyword to call the same class constructor inside another constructor
 *  
 * 
 *  	   'super' keyword is used to refer to the Parent object. super keyword is used to access the members
 *  of the parent object. In the first line of every constructor function there is a default call to 
 *  its parent class if no parent class present then the call is to the Parent class Object.  Using super.<variable> we
 *  we can access the variables and functions of the Parent class and also we can modify the values of the varible using 
 *  super and the modification is only done in the object with which it was called the values of the parent class wont change in other object  
 * 
 * */

public class Q3 extends Test{
	
	public Q3() {
		this(10);// calling another constructor with paramete;	
	}
	public Q3(int i) {//super keyword not explicitly mentioned here but there is a default call to super();
;		System.out.println("Inside Constructor");
	}
	
	static int i = 10;
	int j =20;
	
	void a() {
		this.i = 30;// Not a recommended way to call static members but for show we use this
		this.j =50;//the value of j is changed in only the calling object other object value wont be changed
	}
	
	void forSuper() {//Changes the value of c in its parent class
		super.c =100;
	}
	void getForSuper() {
		System.out.println("the value of c in parent class "+super.c);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//this - keyword
		Q3 q = new Q3();
		Q3 q1 = new Q3();
		q.a();//Changing the value of i and j via the object q
		
		System.out.println(q.j);// we see that the value  of j is changed for q
		System.out.println(q1.j);// but the value of j is not changed for q1 
		
		//Not a recommended way to call static values
		System.out.println(q.i);// the value of static variable i is changed
		System.out.println(q1.i);// Here also the value of static variable i is changed
		
		
		//super - keyword
		q.forSuper();// we change the value of the c in the Parent class using q object
		q.getForSuper();// we print the value of c using q object - we get the changed value 
		q1.getForSuper();// we print the value of c using q1 object - we get the original unchanged value 
	}

}
