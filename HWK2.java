import java.util.Scanner;

/*
 * Written by..: Stephon Tidd
 * Date Written..: Jan. 21, 2021
 * Purpose..: Figure out the hazards of drinking based on users input
 * 
 */
public class ForTestOnly {

	public static void main(String[] args) {
		
		/*double test = 3233.4449393;
		
		String test1 = String.format("%.2f", test);
		
		System.out.println(test1);
		
		this is the two place precision 
		*/
		
		Scanner scan = new Scanner(System.in); // Take user input from keyboard 
		
		double beer, money; // Will store user-input and will be used for calculations later in program
		
		double consume, calories, weight, moneyWasted; // Will be used to store various calculations 
		
		int year = 365; // Days in a year
		
		System.out.println("This program will calculate the hazards of drinking"); // Explains what the program does for the user
		
		
		//Questions for the user
		
		
		System.out.println("On average, how many beers will you consume each day?: ");
		
		beer = scan.nextDouble(); // Stores users answer
		
		
		//Condition Test
		
		
		if(beer > 0) { // Test condition to ensure user enters only positive number
			
		System.out.println("On average, how much will you pay for each can of beer?  (EX: $1.00 ): ");
		
		money = scan.nextDouble(); // Stores the user answer
		
			if(money > 0) {
		
				consume = beer * year; // Calculates beers how many drinks in a year
				calories = beer * 150 * year; // Calculates calories gained from drinking beer everyday for a year
				weight = beer * 15; // Calculates weight gained from beer drinking
				moneyWasted = (beer * 365) * money; // Calculates money spent on beer a year
				
				
				
				String precision = String.format("%.2f", consume);
				System.out.println("You would consume approximately " + precision + " beers in one year.\n"); // Display how much user drinks in one year
				
				precision = String.format("%.2f", calories);
				System.out.println("In one year, you will consume approximately " + calories + " calories from beer alone.\n"); // Display amount of calories user intakes
				
				precision = String.format("%.2f", weight);
				System.out.println("Without diet or exercise to counter these calories, you can expect to gain " + weight + 
						" pounds from drinking that much beer this year.\n"); // Display how pounds the user will gain
				
				
			} // END NESTED IF
		
		} // END IF

	} //END MAIN

} // END CLASS
