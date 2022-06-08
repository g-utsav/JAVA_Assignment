package Unit4.Day10.Question3.abstractClassExample;

public class Main extends AbstractClass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Main m = new Main();
		
		//This is the variable declared in abstract class we can modify it here
		System.out.println(m.i);
		
		//This is the method which was itself implemented in AbstractClass
		m.fun1();
		
		//This is the abstract method declared in AbstractClass and implemented in Main class
		m.fun2();
	}

	
	//Here we implement the unimplemented method of AbstractClass
	@Override
	void fun2() {
		System.out.println("This is fun2 of Abstract class implemented in Main class");
		
	}

}
