package Unit4.Day10.Question3.interfaceExample;

public class Main implements Interface{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//this is the variable declared interface and it is public static final
		System.out.println(Interface.i);
		
		//This is the static method of Interface
		Interface.fun2();
		
		Main m = new Main();
		
		//This is the method with default access modifier 
		m.fun3();
		
		//This is the abstract method of Interface Implemented in Main class 
		m.fun1();
		
	}

	
	//This is the abstract method of Interface which is Implemented in its implemented class which is Main class
	@Override
	public void fun1() {
		System.out.println("This is the abstract method Of Interface Implemented in Main calss");
	}

}
