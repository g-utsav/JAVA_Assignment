package Unit4.Day6.Question4;

public class Factorial {

	static int fact(int n, int prod) {
		if(n == 1) {
			return prod;
		}
		return fact(n-1, (prod * n));
	}
	
	public static void main(String[] args) {
		int[] a = new int[args.length];
		
		for(int i = 0; i < args.length; i++) {
			a[i] = Integer.parseInt(args[i]);
		}
		
		if(args.length == 1) {
			System.out.println(fact(a[0],1));
		}else if(args.length == 2) {
			int diff = (a[0]>a[1])?(a[0]-a[1]):(a[1]-a[0]);
			System.out.println(fact(diff,1));
		}else {
			System.out.println("Error");
		}
		
	}
	
}
