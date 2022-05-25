package Unit4.Day4.Question2;

public class Demo {
	
	String s;
	int i;
	
	public Demo(int i) {
		this.i = i;
	}

	public Demo(String s) {
		this(10);
		this.s = s;
	}

	public Demo() {
		this("abc");
	}


	public static void main(String[] args) {
		
		Demo d = new Demo();
		
		System.out.println(d.s);
		System.out.println(d.i);
	}

}
