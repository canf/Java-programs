/**
 * @(#)BMI.java
 *
 * BMI application
 *
 * @author 
 * @version 1.00 2017/10/19
 */

import java.util.Scanner;

public class Bmi {
	public static void main(String[] args) {
	    double weight;
	    double height;
	    double index;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter weight in kg: ");
		weight = (double) input.nextInt();
		
		System.out.println("Enter height in meters (for example 1.70): ");
		height = (double)input.nextDouble();
	
		index = (weight) / (height*height);
		
		System.out.println("Your BMI is " + index);
	}
	
}
    