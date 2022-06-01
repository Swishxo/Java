import java.util.Scanner;

/**********************************************************************************************************************************
 * 
 * Written by...: Stephon Tidd
 * Date written.: January 21, 2021
 * Purpose......: a short program that asks the user to enter his full name, age, and favorite number the program will output statements
 * 
 * REMEMBER:  submit Psudeocode as well  
 ***********************************************************************************************************************************/
public class HomeWrk1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); // Used to take in user-input
		
		String name; // Stores the users name
		int age, favNum; // Stores user AGE and Favorite number
		
		System.out.println("Enter your name: "); // Prompt user to enter their name
		name = scan.next(); // Stores user-input in variable (name) 
		
		System.out.println("Enter your age: "); // Prompt user for age
		age = scan.nextInt(); // Stores users age in variable (age)
		
		System.out.println("Enter your favorite number: "); // Prompt user to enter favorite number
		favNum = scan.nextInt(); // Stores user-input
		
		System.out.println("Hello, " + name +" you are " + age + " years old"); // Display user information 
		
		
		if(age <= 20) { // IF (age) is greater-than or equal-to (20) execute this code block
			
			System.out.println("You are still young."); // Display message if user age meets condition 
			
		} //END IF
		
			else if(age > 80){ // IF (age) is greater-than (80) execute this code block
				
				System.out.println("You are extremely old."); // Display message if user age meets condition
			
		} //END ELSE-IF
		
		if((age > 20) && (age <= 80)) { // Test if both conditions are true. IF conditions are execute code block 
			
			System.out.println("You are not too old and not too young."); // Display message if user age meets condition
			
		} //END IF
		
		if(favNum % 2 == 0) {
			
			System.out.println("Your favorite number is even");
			
		} //END IF
		
		else {
			System.out.println("Your favorite number is odd");
			
		} //END ELSE
		
		System.out.println("End of program");

	}// END MAIN

}// END CLASS
