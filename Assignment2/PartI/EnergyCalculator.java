import java.util.Scanner;

public class EnergyCalculator {

	public static double calculateEnergyIncrease(double m, double v0, double v1) {
		double E = (1.0/2) * m * v1 * v1 + (1.0/2) * m * v0 * v0;
		return E;
	}
	
	public static void main(String[] args) {
		double increasedEnergy = calculateEnergyIncrease(50, 10.0, 20.0);
		System.out.println("The object's increase in energy after speeding up  is " + increasedEnergy + " Joules");
		
	}
}
