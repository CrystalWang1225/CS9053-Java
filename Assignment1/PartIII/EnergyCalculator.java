class EnergyCalculator {

	
	public static void main(String[] arguments) {
		double mass = 50;
		double initialVelocity = 10;
		double finalVelocity = 20.0;
		double increasedEnergy = 0.0;
		increasedEnergy = (1.0/2)* mass * finalVelocity * finalVelocity - (1.0/2) * mass * initialVelocity * initialVelocity;
		 System.out.println("The object's increase in energy after speeding up from"
		 		+  + initialVelocity +
		" m/s to " + finalVelocity + "m/s is " + increasedEnergy + " Joules");
	}
}