/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	    
		System.out.println(message(6, 3)); // calls the method
	}
	
	public static int message(int w ,int x){ // method answers call
	    
	    if(x <= 0){ // test condition
	        
	        return 1;
	    }// end if
	    
	    else{ // executes only when if is FALSE
	    
	        int sum = w * message(w, x - 1); //multiply the base time the METHOD with the NEW exponent. Stored in sum
	        
	        System.out.println(sum);
	       
	        return sum; // SUM returns the answer back to METHOD message() and message sends answer to main
	    }
	}
}
