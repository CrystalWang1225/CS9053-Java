
public class LargestPairProduct {

	public static void main(String[] args) {
		
		int[] intArray = {17, 1, 3, 12, 39, 4, 76, 4, 31, 87};
		int product = Integer.MIN_VALUE;
		
		for (int i= 0; i < intArray.length - 1; i++) {
			for (int j = i + 1; j < intArray.length; j++) {
				int result = intArray[i] * intArray[j];
				if (result >= product) {
					product = result;
				}
			}
		}
		System.out.println("Maximum product of all pairs in the array: " +
				product);
	}
}
