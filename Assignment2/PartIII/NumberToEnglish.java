import java.util.Scanner;

public class NumberToEnglish {
		
		public static String lookUpTable(int num){
			String result = "";
			switch (num) {
			case 1 :
				result = "one";
				break;
			case 2 :
				result = "two";
				break;
			case 3 :
				result = "three";
				break;
			case 4 :
				result = "four";
				break;
			case 5 :
				result = "five";
				break;
			case 6 :
				result = "six";
				break;
			case 7 :
				result = "seven";
				break;
			case 8 :
				result = "eight";
				break;
			case 9 :
				result = "nine";
				break;
			case 10:
				result = "ten";
				break;
			case 11:
				result = "eleven";
				break;
			case 12:
				result = "twelve";
				break;
			case 13:
				result = "thirteen";
				break;
			case 14:
				result = "fourteen";
				break;
			case 15:
				result = "fifteen";
				break;
			case 16:
				result = "sixteen";
				break;
			case 17:
				result = "seventeen";
				break;
			case 18:
				result = "eighteen";
				break;
			case 19:
				result = "nineteen";
				break;
			case 20:
				result = "twenty";
				break;
			case 30:
				result = "thirty";
				break;
			case 40:
				result = "forty";
				break;
			case 50:
				result = "fifty";
				break;
			case 60:
				result = "sixty";
				break;
			case 70:
				result = "seventy";
				break;
			case 80:
				result = "eighty";
				break;
			case 90:
				result = "ninety";
				break;
			}
			return result;
		}
		public static String processThreeNumbers(int num) {
			String result = "";
			int numberOfHundreds = num / 100;
			int remain = num % 100;
			int numberOfTens = 0;
			int numberOfDigits = 0;
			if (remain >= 20) {
				numberOfDigits = remain % 10;
				numberOfTens = remain - numberOfDigits;
			} else {
				numberOfTens = remain;
			}
			if (numberOfHundreds != 0) {
				String hundred = NumberToEnglish.lookUpTable(numberOfHundreds);
				result = hundred + " hundred ";
			}
			if (numberOfTens != 0) {
				String ten = NumberToEnglish.lookUpTable(numberOfTens);
				result += ten + " ";
			}
			if (numberOfDigits  != 0) {
				String digit = NumberToEnglish.lookUpTable(numberOfDigits);
				result += digit + " ";
			}		
			return result;
		}
		
        public static String numberToEnglish(int num) {
            int remainingAmount = 0;
        	if (num == 0) {
            	return "Zero ";
            }
            String result = "";
        	if (num < 0) {
                	result = "Negative ";
                }
        	// After taking care of the sign, make the number absolute value
        	num = Math.abs(num);
        	int numberOfMillions = num / 1000000 ;
        	remainingAmount = num % 1000000;
        	
        	if (numberOfMillions != 0) {
            	result += NumberToEnglish.processThreeNumbers(numberOfMillions) + "Million ";
        	}

        	
        	int numberOfThousands  = remainingAmount / 1000 ;
        	
        	if (numberOfThousands != 0) {
        		result += NumberToEnglish.processThreeNumbers(numberOfThousands) + "Thousand ";
        	}
        	//remainingAmount here is the number of Hundreds
        	remainingAmount = remainingAmount % 1000 ;
        	
        	if (remainingAmount != 0) {
        		result += NumberToEnglish.processThreeNumbers(remainingAmount);
        	}
        	return result;
        	
        }
        
        public static void main(String[] args) {
                
                Scanner in = new Scanner(System.in);
                System.out.print("Enter a number: " );
                
                int number = in.nextInt();
                
                	System.out.println("The number " + number + " in English is " + NumberToEnglish.numberToEnglish(number));                
     
        }
}
