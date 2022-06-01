package Unit4.Day6.Question2;

public class EvenSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		
		for(int col = 0; col < arr[0].length; col++) {
			int sum = 0;
			for(int row = 0 ; row < arr[col].length; row++ ) {
//				System.out.println(arr[0][col]);
				if(arr[row][col]%2 == 0) {
					sum += arr[row][col];
				}
			}
			System.out.println(sum);
		}
		
	}

}
