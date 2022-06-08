package Unit4.Day10.Question3.interfaceExample;

//This is an interface declared with interface kwyword
public interface Interface {
	
	//The signature of this variable is public static final
	int i = 10;
	
	
	//This is an abstract method the abstract keyword is optional here as compiler will insert it 
	 void fun1();
	
	 
	 //This is a static method inside interface the body of this method can be declared here 
	 static void fun2() {
		 System.out.println("This is a static method inside interface");
	 }
	 
	 //This is a method with default access modifier and the it can be implemented here 
	 default void fun3() {
		 System.out.println("This is a method with default acess modifier");
	 }

	 
//We cannot add an private or protected function here as it will remain unacessible as we cannot reach it from its implemented calss
}
