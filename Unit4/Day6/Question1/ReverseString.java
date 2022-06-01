package Unit4.Day6.Question1;

import java.util.Scanner;

public class ReverseString {

	static String revStr(String str) {
		char[] strArr = str.toCharArray();
		String temp = "";
		for(int i = strArr.length-1; i>=0; i-- ) {
			temp += strArr[i];
		}
		return temp;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter the String to Reverse : ");
		String str = sc.nextLine();
		
		System.out.println(revStr(str));
		
		sc.close();
	}

}
