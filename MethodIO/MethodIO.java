

/*
 * Name..: Stephon Tidd
 * 
 * Date..: May 19, 2021
 * 
 * Purpose..: Program will do different things based on user input using a menu driven system
 * 
 * 
 * File prints with project you have refresh it
 */

import java.util.Scanner;
import java.io.*;

public class MethodIO {

	public static void main(String[] args) throws IOException{
		
		//Scanner Object for users input
		
		Scanner scan = new Scanner(System.in);
		
		//Prompt user of what program does
		
		String name = null;
		
		
			
			System.out.println("This program does different things based on your selection!");
			
			//Prompt for user to enter name
			
			System.out.print("Enter your name: ");
			name = scan.nextLine();
			
			
			//Menu
			
			
			try {
				
					System.out.println("1. Name display 20x\n2. Age Doubled\n3. Triangle Output\n4. Quit");
					
					//Store user input and will be tested in menuChoice()
					
					int userChoice = scan.nextInt();
					
					menuChoice(userChoice, name);
					
				
			}catch(Exception e) {
				
				System.out.println("Please follow Prompt");
				
			}//end catch
			
		
		
	}//end main
	
	static void menuChoice(int selection, String name) {
		
		//Scanner Object for menuChoice
		
		Scanner scan = new Scanner(System.in);
			
			//user choice is passed here to be tested
		
			switch(selection) {
			case 1: 
				nameEchoed(name);
			break;
			
			case 2: 
				System.out.println("What is your age?");
				
				int age = scan.nextInt();
				
				ageDoubled(age);
			break;
			
			case 3: 
				//Prompt
				
					System.out.println("Enter a number between 3 and 50\n");
					int num = scan.nextInt();
					System.out.println();
					
					if((num >= 3) && (num <= 50)) {
						
						//triangle method here
						
						triangle(num);
						
					}//end if
					
			default: 
				System.out.println("BYE!!!");
					
			}//end switch
			
			
	}//end menuChoice
	
	static void nameEchoed(String name) {
		
		//Control loop for name
		
		int counter;
		
		for(counter = 1; counter <= 20; counter++) {
			
			System.out.println(counter+ " Hello, " +name);
			
		}//end for-loop
		
	}//end nameEchoed
	
	static void ageDoubled(int age) {
		
		//This variable stores the user age multiplied by two
		
		int ageDoubled  = age * 2;
		
		//Displays user age and user ageDoubled
		
		System.out.println("Your age is: " + age);
		System.out.println("Your age Doubled: " + ageDoubled);
		
		//Method that display message based on user input from age
		
		ageGroup(age);
		
		
	}//end ageDoubled
	
	static void ageGroup(int age) {
		
		if(age > 20) {
			
			System.out.println("You are not a teenager!");
			
		}//end if
		
		else if((age > 12) && (age <= 19)) {
			
			System.out.println("You are a teenager!");
			
		}//end else if
		
	}//end ageGroup
	
	static void triangle(int num) {
		
		//Will create a file and print triangle
		
		String fileName = "aRandomFile.txt"; // name your file here (Make sure the name is original or YOU WILL OVER-WRITE an existing FILE)
		
		
		//Allows for object (writer) to be used throughout method and not be limited by the scope
		
		PrintWriter writer = null;
		
		//Exception handling if file is not created
		
		try {
			
			 writer = new PrintWriter(fileName);
			
		} catch (FileNotFoundException e) {

				System.out.println("File was not created");
			
		}//end catch
		
		//Controlled loops
		
		for(int i = 0; i < num; i++) { //This for-loop focuses on the Column
			//nested for loop
			for(int j = 0; j < i; j++) { //This for-loop focuses on rows
			
				//Reference writer obj to print to file
				
				writer.print("*"); 
				
			}//end nested for loop
			
			//Reference writer obj to file
			
			writer.println("*");
		}//end outer for loop
		
		
		//MUST CLOSE OUT or it will not print to file. File will appear empty
		writer.close();
		
	}//end triangle

}//end class
