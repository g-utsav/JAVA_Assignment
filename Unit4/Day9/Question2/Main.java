package Unit4.Day9.Question2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Value between 1 to 10 : ");
		int i = sc.nextInt();
		
		if(i>=1 && i <11) {
			Parent par = new Child(i);
			par.method1();
			par.method2();
			par.method3();
			
			((Child)par).method4();
			
		}else {
			System.out.println("Invalid Number");
		}
		
		sc.close();
	}

}
