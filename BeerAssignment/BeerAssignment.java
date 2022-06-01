/* Name..:	Stephon Tidd
 * Date..:	May 15, 2021
 * Purpose: This project does a number of calculations based on users beer consumption
 * 
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class BeerAssignment {

	public static void main(String[] args) {
		
		//Prompt user of program
		
		System.out.println("This program does calculations based on you beer consumption");
		
		System.out.println();
		
		prompt();
		
		
		

	}

	public static void prompt() {
		
		Scanner scan = new Scanner(System.in); //Stores users input from keyboard
		
		System.out.println("How much beer do you consume? EX: 2 or 2.5"); //Question 1
		
		double beer = scan.nextDouble();
		
		System.out.println("How much will you pay for each can of beer?\n"); //Question 2
		
		double pay = scan.nextDouble();
		
		
		/*
		 *  Calling yearlyConsumption method
		 */
		
		yearlyConsumption(beer); // pass beer variable to method
		
		double consumpution = yearlyConsumption(beer); // passed method to variable
		
		DecimalFormat newFormat = new DecimalFormat("0.00"); // object to format answer
		
		
		System.out.println("Your yearly beer consumption is " + 
		newFormat.format(consumpution)); //using object with format method to confine user answers 
		
		// Calories in-take message
		
		double calories = calorieConsumption(beer);
		
		System.out.println("Your yearly calorie in-take: " + calories);
		
		//Weight gained from beer
		
		weightGain(beer);
		
		// Calculated amount of money spent
		
		double money = moneySpent(pay);
		
		System.out.println("The amount of moeny you spend a year: " + newFormat.format(money));
		
		
		
		
		
		
		
	} //End of prompt Method
	
	public static double yearlyConsumption(double yearAmount) {
		
		return yearAmount * 365;
		
	} //End of yearlyConsumption method
	
public static double calorieConsumption(double yearAmount) {
		
		return (yearAmount * 150) * 365;
		
}// End of calorieCunsumption method

public static void weightGain(double fat) {
	
	 double weight = fat * 15;
	 
	 System.out.println("Weight gained from beer: " + weight);
	 
}// End of weightGain method
	
	
	public static double moneySpent(double yearlyAmount) {
		
		return yearlyAmount * 365;
		
	}// End of moneySpent method
}
