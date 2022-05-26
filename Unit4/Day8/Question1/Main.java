package Unit4.Day8.Question1;

public class Main {

	public Main() {
		super();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bird b1 = new Parrot();
		b1.fly();
		
		Parrot p1 = (Parrot)b1;
		
		p1.sing();
		

	}

}
