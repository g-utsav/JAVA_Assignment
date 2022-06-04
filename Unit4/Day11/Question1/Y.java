package Unit4.Day11.Question1;

public interface Y {

	void fun1Y();
	default void fun2Y() {
		System.out.println("inside fun2Y() of Y of impl");
	}
	static void fun3Y() {
		System.out.println("inside fun3Y() of Y of impl");
	}
	
	void fun1();
	
}
