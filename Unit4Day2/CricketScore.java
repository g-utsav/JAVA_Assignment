package Unit4Day2;

public class CricketScore {

	public static void main(String[] args) {
		int one = 6;
		int two = 3;
		int three = 1;
		int four = 10;
		int six = 5;
		
		int totalRuns = findScore(one, two, three, four, six);
		
		System.out.println(totalRuns);

	}

	static int findScore(int one, int two, int three, int four, int six) {
		return (1 * one) + 2 * two + 3 * three + 4 * four + 6 * six ;
	}
}
