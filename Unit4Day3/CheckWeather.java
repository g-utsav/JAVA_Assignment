package Unit4Day3;

public class CheckWeather {

	public static void main(String[] args) {
		
		boolean isSonwing = false, isRaining = true;
		double temperature = 60.0;
		
		String out = "Let's go out!";
		if(isRaining || isSonwing || temperature < 50 ) {
			out = "Let's stay home";
		}
		
		System.out.println(out);

	}

}
