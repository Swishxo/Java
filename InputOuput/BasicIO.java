import java.util.Scanner;

public class BasicIO {

	public static void main(String[] args) {
		
		//Variables used to store user answer
		
		int num1 = 0, num2 = 0, num3 = 0;
		
		//Collects user input from Keyboard
		Scanner scan = new Scanner(System.in); 
		
		//Welcome Prompt for user
		System.out.println("This program gives the user the SUM and Average of three intergers!");
		
		System.out.println(); //A blank line before user enters info
		
		//Instruction prompts
		System.out.println("Enter your first number: ");
		num1 = scan.nextInt();
		
		System.out.println("Enter your second number: ");
		num2 = scan.nextInt();
		
		System.out.println("Enter your first number: ");
		num3 = scan.nextInt();
		
		//SPACE
		System.out.println();
		
		//Calculate the SUM
		int sum = num1 + num2 + num3;
		
		//Display answer to SUM
		System.out.println("The SUM:" + sum);
		
		//Calculate Average
		int avg = (num1 + num2 + num3) / 3;
		
		//Display Average
		System.out.println("The Average:" + avg);
		 
		
		 
		 
		
		

	}

}
