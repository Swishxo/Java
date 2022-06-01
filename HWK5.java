



import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.IOException;



public class HWK5 {
	
	
	
	public static Scanner scan = new Scanner(System.in);
	
	public static String name;
	
	public static int age;
	
	
	
	

	public static void main(String[] args) {
		
		//Prompt user on menu options
		
		System.out.println("Select from the menu!\n");
		
		System.out.println("1.User’s Name\n");
		System.out.println("2.User’s Age\n");
		System.out.println("3.Teenager or not Teenager\n");
		System.out.println("4.Triangle\n");
		System.out.println("5.QUIT\n");
		
		System.out.println("\n");
		
		//Catch failure in user input
		
		try {
			
		
			int input = scan.nextInt();
			
		
		
		
		switch(input) {
		
		case 1:
			System.out.println("What is your name: \n");
			name = scan.next();
			
			nameRepeat(userName(name));
			
			break;
			
		case 2:
			
				System.out.println("What is your age?\n");
				age = scan.nextInt();
				userAge(age);
			
			break;
			
		case 3:
				teenager(age);
			
			break;
			
		case 4:
			
			triangle(0);
			
			break;
			
		case 5:
			
			System.out.println("\nProgram END!");
			break;
			
		default:
			
			System.out.println("You did not enter an option");
			
			}//end switch
		
		} catch(Exception e) {
			
			System.out.println("You didnt enter menu choices");
		}
		
} // end main
	
	
	
	public static String userName(String cloneName) {
		
		//cloneName = scan.next();
		
		name = cloneName;
		
		return name;

	}// END userName
	
	public static String nameRepeat(String repeat) {
		
		for(int i = 0; i <= 20; i++) {
			
			System.out.println(repeat);

		}
		
		return repeat;
		
	} // END nameRepeat()
	
	public static void userAge(int cloneAge) {
		
		int ageDouble = cloneAge;
		
		ageDouble += ageDouble;
		
		System.out.println("You are " + cloneAge + ". Your age doubled is:" + ageDouble);
		
	}// end userAge
	
	public static void teenager(int cloneAge) {
		

		if(cloneAge < 0) {
			
			System.out.println("You didnt enter you age at option 2!");
			
		}// end if
		
		else {
			
			if(cloneAge == 25) {
				
				System.out.println("Since you are 25 years old, you are NOT a teenager.");
				
			} // end nested if
			
			else if(cloneAge == 13) {
				
				System.out.println("Since you are 13 years old, you are a teenager");
			}
		}// end else
		
	}// end teenager()
	
	public static void triangle(int row) {
		

		String fileName = "HWK.txt";
		
		try {
			File myFile = new File(fileName);
			PrintWriter output = new PrintWriter(myFile);
			
			System.out.println("Enter a number: ");
			
			int rows = scan.nextInt();
    
			for (int i = 1; i <= rows; i++) {
    
				for (int j = 1; j <= i; j++) {
        
					//System.out.print("x ");
					
					output.print("x ");
					
				} // end nested for
        
					//System.out.println("");
					
					output.println("");

			} // end for
			
			output.close();
			
			
			
			
		} catch(Exception e) {
			
			System.out.println("Error");
			
		}// end catch
		
    } // triangle
	

}

	
		
	
	


