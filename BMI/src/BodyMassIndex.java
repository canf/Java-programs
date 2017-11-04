import java.util.Scanner;

public class BodyMassIndex {
	public static void main (String[] args) {
		double weight;
	    double height;
	    double bmindex;
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter weight in kg: ");
		weight = keyboard.nextSouble();
		
		System.out.print("Enter height in meters (for example 1.70): ");
		height = keyboard.nextDouble();
	
		bmindex = (weight) / (height*height);
		
		System.out.println("Your BMI is " + bmindex);

	
	}
}