import java.util.Arrays;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		
		int[][] twoDimArray = new int[2][5];
		int[] arrayOne = {5, 9, 55, 23, 89};
		int[] arrayTwo = {15, 3, 23, 19, 64};
		
		/* copy arrayOne and arrayTwo into twoDimArray */
        /* print out the first list of 5 numbers in twoDimArray
         * on one line, and the second list of 5 numbers in twoDimArray
         * on the next line
         */
        
        /* the solution should use nested loops: one loop to loop over
         * each array in twoDimArray, and one loop to loop over each element
         * in that array
         */
		//For twoDimArray[0]
		for (int i = 0; i < twoDimArray[0].length; i++) {
			for (int j = 0; j < arrayOne.length; j++) {
				twoDimArray[0][i] = arrayOne[i];
			}
		}

		//For twoDimArray[1]
		for (int i = 0; i < twoDimArray[1].length; i++) {
			for (int j = 0; j < arrayTwo.length; j++) {
				twoDimArray[1][i] = arrayTwo[i];
			}
		}

		
		System.out.println("twoDimArray is " + 
							Arrays.deepToString(twoDimArray));
	}
}
