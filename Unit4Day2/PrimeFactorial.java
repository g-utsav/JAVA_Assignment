package Unit4Day2;

public class PrimeFactorial {

	public static void main(String[] args) {
		int num = 12;
		findPrimeFact(num);
	}
	
	static void findPrimeFact(int num) {
		System.out.println("The Prime Factors are : ");
		for(int i=1; i<=num; i++) {
			if(num%i == 0) {
				System.out.println(i);
			}
		}
	}

}
