package Unit4.Day8.Question4;

public class Main {
	
	public Main() {
		super();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal[] animal = new Animal[3];
		
		animal[0] = new Dog();
		animal[1] = new Cat();
		animal[2] = new Tiger();
		
		for(Animal a : animal) {
			a.makeNoise();
			a.eat();
			a.walk();
			System.out.println("-----------------------------");
		}
		

	}

}
