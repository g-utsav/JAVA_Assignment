package Unit4.Day6.Question3;

public class FindPrime {

	public int[] findAndReturnPrimeNumbers(int[] inputArray){
		
		int[] out = new int[inputArray.length];
		int ind = 0;
		for(int i = 0; i<inputArray.length; i++) {
			boolean flag = true;
			for(int j = 2; j<inputArray[i]; j++) {
				if(inputArray[i]%j == 0) {
					flag = false;
				}
			}
			if(flag) {
				out[ind] = inputArray[i];
				ind++;
			}
		}
		
		return out;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {10,12,5,50,11,14,15};
		
		FindPrime fp = new FindPrime();
		
		int[] out = fp.findAndReturnPrimeNumbers(arr);
		
		boolean flag = true;
		for(int i : out) {
			if(i != 0) {
				System.out.println(i);
				flag = false;
			}
		}
		
		if(flag){
			System.out.println("Prime number not found in the supplied Array");
		}
		
	}

}
