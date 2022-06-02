package Unit4.Day10.Question4;

import java.util.Scanner;

public class Main {
	
	static Area area = new Area();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the length of Rectangle : ");
		int length = sc.nextInt();
		System.out.println("Enter the breadth of the Ractangle : ");
		int breadth = sc.nextInt();
		
		System.out.println("The Area of the Ractangle is : " +area.rectangleArea(length, breadth));
		
		
		System.out.println("Enter the side of the square : ");
		System.out.println("The Area of the Square is : "+area.squareArea(sc.nextInt()));
		
		System.out.println("Enter the Radius of the Circle : ");
		System.out.println("The Area of the Circle is : "+area.circleArea(sc.nextInt()));
		
		
		sc.close();
	}

}
