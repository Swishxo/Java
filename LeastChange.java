import java.util.Scanner;

/*
 *  Written by..: Stephon Tidd
 *  Date written: January 22, 2021
 *  Purpose.....: Give the an accurate description of the change they are entering
 */
public class LeastChange {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); // Take user input from keyboard
		
		int change; // Will store the users input
		
		// Variables will counts number of each coin iteration
		
		int count1, count2, count3, count4, count5; 
		
		count1 = 0; // Count number of HALFDOLLAR
		count2 = 0; // CO
		count3 = 0;
		count4 = 0;
		count5 = 0;
		
		// Declaring coin representation and assigning values to them (AMERICAN CURRENCY)
		
		final int HALFDOLLAR, QUATER, DIME, NICKEL, PENNY; // Values wont be changed once declared
		
		HALFDOLLAR = 50;
		QUATER = 25;
		DIME = 10;
		NICKEL = 05;
		PENNY = 01;
		
		System.out.println("This program give accurate description of you change. 99 cents is the highest value accepted"); // Display purpose of program to user and constraints
		System.out.print("Enter change amount: "); // Prompt user to enter change amount
		change = scan.nextInt(); // Stores the users coin amount
		
		// Loop to test user-input against conditions helps keep users answer in the scope
		
		if((change > 0) && (change <= 99)) {
			
			if(change >= HALFDOLLAR) {
				
				change -= HALFDOLLAR;
				count1++;
				
			}//END line 45 IF
				
			if((change <= HALFDOLLAR) && (change >= QUATER)) {
					
				change -= QUATER;
				count2++;
				
			}//END line 51 IF
					
			if((change <= QUATER) && (change >= DIME)) {
						
				change -= DIME;
				count3++;
				
			}//END line 58 IF
			
			if(change > DIME) {
				
				change -= DIME;
				count3++;
				
			}//END line 65 IF
						
			else if((change <= DIME) && (change >= NICKEL)) {
							
				change -= NICKEL;
				count4++;
				
			}//END line 72 ELSE-IF
			
			else if(change > NICKEL) {
				
				change -= NICKEL;
				
			}//END line 81 ELSE-IF
							
			if(change > PENNY) {
								
				count5 = change;
				
				
			}//END line 79 IF
						
		
		// Closing remarks for program
		
		if((count1 == 1) && (count2 == 1)) {
			
			System.out.println("HALF DOLLAR: " + count1 + "\nQUATER: " + count2);
			
		}// END IF 
		
		else {
			
			System.out.println("HALF DOLLARS: " + count1 + "\nQUATERS: " + count2);
			
		}// END ELSE
		
		if((count3 == 1) && (count4 == 1)) {
			
			System.out.println("DIME: " + count3 + "\nNICKEL: " + count4);
			
		}// END IF
		
		else{
			
			System.out.println("DIMES: " + count3 + "\nNICKELS: " + count4);
			
		}// END ELSE
		
		if(count5 == 1) {
			
			System.out.println("PENNY: " + count5);
			
		}// END IF
		
		if(count5 > 1) {
			
			System.out.println("PENNIES: " + count5);
			
		}// END ELSE
		
		
		
		}
		

	}// End MAIN

}// END CLASS
