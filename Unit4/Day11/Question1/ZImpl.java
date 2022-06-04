package Unit4.Day11.Question1;

public class ZImpl implements Z{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Static Methods
		Y.fun3Y();
		X.fun3X();
		
		ZImpl z = new ZImpl();
		
		//Abstract Overriden Methods
		z.fun1X();
		z.fun1Y();
		z.funZ();
		
		//default method of X Overriden in ZImpl
		z.fun2X();
		
		//Common method between X and Y Overrriden here
		z.fun1();
		
		//Non- Overriden default method of Y
		z.fun2Y();
		
		
	}

	@Override
	public void fun1X() {
		System.out.println("Overriden fun1x() in ZImpl class");
		
	}

	@Override
	public void fun1Y() {
		// TODO Auto-generated method stub
		System.out.println("Overriden fun1Y() in ZImpl class");
		
	}

	@Override
	public void funZ() {
		// TODO Auto-generated method stub
		System.out.println("Overriden funZ() in ZImpl class");
		
	}

	@Override
	public  void fun2X() {
		System.out.println("fun2X() of X interface is Overriden here");
	}

	@Override
	public void fun1() {
		// TODO Auto-generated method stub
		System.out.println("fun1() of both X and Y interface is Overriden here");
		
	}

}
