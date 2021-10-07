public class LoopSum {

        public static int sum100() {
        	int sum = 0;
        	for (int i = 1; i <= 100; i++) {
        		sum += i;	
        	}
        			
                return sum;
        }
        
        public static int sumN(int N) {
        	//Assuming N is non-negative integer
        	int sum = 0;
        	for (int i = 1; i <= N; i++) {
        		sum += i;
        	}
               return sum;
        }
        
        public static void main(String[] args) {
        	int sum100 = sum100();
        	System.out.println("The sum of integers from 1 - 100 is " + sum100);
        	
        	//Assign an N value
        	int N = 50;
        	int sumN = sumN(N);
        	System.out.println("The sum of integers from 1 through " + N + " is " + sumN);
        }
        
}
