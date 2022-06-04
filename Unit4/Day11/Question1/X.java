package Unit4.Day11.Question1;

public interface X {

	void fun1X();
	default void fun2X() {
		System.out.println("inside fun2X() of X of impl");
	}
	static void fun3X() {
		System.out.println("inside fun3X() of X of impl");
	}
	void fun1();
}
