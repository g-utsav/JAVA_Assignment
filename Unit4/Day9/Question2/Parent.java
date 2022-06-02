package Unit4.Day9.Question2;

public abstract class Parent {

	abstract void method1();
	final void method2() {
		System.out.println("This method2() cant be modified (inside Parent Class)");
	};
	void method3() {
		System.out.println("This method may or may not be modified (inside Parent Class)");
	};
	
	final int number;
	
	public Parent(int number) {
		this.number = number;
	}
	

}
