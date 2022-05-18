package Unit4Day2;

public class SumOfNaturalNumber {

	public static void main(String[] args) {
		int num = 15;
		System.out.println(sum(num));
	}
	
	static int sum(int n) {
		int sum = (n*(n+1))/2;
		
		return sum;
	}

}
