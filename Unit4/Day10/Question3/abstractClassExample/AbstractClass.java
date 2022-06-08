package Unit4.Day10.Question3.abstractClassExample;

//This keyword abstract is used to declare abstract class.
public abstract class AbstractClass {

	int i = 10;
	
	void fun1() {
		System.out.println("This is fun1 inside AbstractClass");
	}
	
	//This is an unimplemented abstract class and we need to declare it before use
	abstract void fun2() ;
}
