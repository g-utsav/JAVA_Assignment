package Unit4.Day4.Question4;

import java.lang.Math;
import java.util.Scanner;

public class Main {

	void q4(int n) {
		System.out.print("Output : ");
		if(n%2 == 1) {
			System.out.println(n);
		}else if(n < 0) {
			System.out.println("Error");
		}else if(n%2 == 0) {
			System.out.println((int)(Math.ceil((float)n/10))*10);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int n = sc.nextInt();
		
		Main m = new Main();
		m.q4(n);
		sc.close();
	}

}
