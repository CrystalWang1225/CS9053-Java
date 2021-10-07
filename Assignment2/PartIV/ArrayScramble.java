
public class ArrayScramble {

	public static void main(String[] args) {
		int[] intArray = new int[50];

		System.out.println("original array:");
		/* initialize the source Array */
		for (int i = 0;i < intArray.length; i++) {
			intArray[i] = (int)(Math.random()*100);
			System.out.print(intArray[i] + " ");
		}
		System.out.println();
		
		// scramble here
		// getting random integers within the index range, reference here https://stackoverflow.com/questions/363681/how-do-i-generate-random-integers-within-a-specific-range-in-java
		for (int i= 0; i < intArray.length; i++) {
			int randomIndex = 0 + (int)(Math.random() * ((49 - 0) + 1));
			//Swapping the current index value with the random index value
			int temp = intArray[i];
			intArray[i] = intArray[randomIndex];
			intArray[randomIndex] = temp;
		}
		System.out.println("new arrangement:");
		for (int i = 0;i < intArray.length; i++) {
			System.out.print(intArray[i] + " ");
		}
		
		System.out.println();
	}
}
