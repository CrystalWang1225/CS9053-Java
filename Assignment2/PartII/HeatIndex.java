import java.util.Scanner;

public class HeatIndex {

	public static double heatIndex(double temp, double humidity) {
		double c1 = -42.379;
		double c2 = 2.04901523;
		double c3 = 10.14333127;
		double c4 = -0.22475541;
		double c5 = -6.83783e-3;
		double c6 = -5.481717e-2;
		double c7 = 1.22874e-3;
		double c8 = 8.5282e-4;
		double c9 = -1.99e-6;
		
		//If the humidity entered is invalid, return -1
		if (humidity > 100 || humidity < 0) {
			return -1;
		}
		
		double heatIndex = c1 + c2 * temp + c3 * humidity + c4 * temp * humidity + c5 * Math.pow(temp, 2) + c6 * Math.pow(humidity, 2) + c7 * Math.pow(temp, 2) * humidity + c8 * temp * Math.pow(humidity, 2) +  c9 *  Math.pow(temp, 2) * Math.pow(humidity, 2);
		
		return heatIndex;
	}
	
	public static void main(String[] args) {
		
		double temp;
		double humidity;
		
		double heatIndexTemp;
		
		temp = Double.parseDouble(args[0]);
		humidity = Double.parseDouble(args[1]);
		
		heatIndexTemp = heatIndex(temp, humidity);
		
		//For Debugging
		System.out.println("Heat Index " + heatIndexTemp);

	}
}
