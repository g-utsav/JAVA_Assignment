package Unit4.Day9.Question2;

final public class Child extends Parent{

	@Override
	void method1() {
		System.out.println("This is Overriden method And value of int number is : "+this.number);
	}
	
	public Child(int i) {
		super(i);
	}
	
	void method4(){
		System.out.println("this is a method inside Child Class");
	}
	
}
