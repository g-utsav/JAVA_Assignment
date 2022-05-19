package Unit4Day3;

public class VowelAndConsonant {

	public static void main(String[] args) {
		
		char a = 'a';
		
		vowelConsonant('a');
		
		vowelConsonant('b');
		
		vowelConsonant('%');
		
	}
	
	static void vowelConsonant(int a) {
		
		String out = Character.toString((char)a)+" is : ";
		if(a == 97 || a == 101 || a == 105 || a == 111 || a == 117 || a == 65 || a ==69 || a == 73 || a == 79 || a == 85) {
			out += "Vowel";
		}else if((a >= 97 && a <= 122) || (a >= 65 && a <= 90)) {
			out += "Consonant";
		}else {
			out = "ERROR INVALID INPUT";
		}
		System.out.println(out);
	}

}