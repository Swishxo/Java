/******************************************************************************
Makes use of Recursive method to get factorials 
*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		
		System.out.println(test(10)); // Method is displayed after being called on
	}
	
	/*
	This method returns an int value back to main once it is done calculating  
	
	*/
	
	public static int test(int x){ // x now has 10 stored in. We will use x to test conditions and calculations 
	    
	    if(x == 0){ // condition test for x 
	        
	        return 1; // if x equal 0 is TRUE 1 will be sent back to the method instead of 0
	    }// end if
	    
	    else{ // if x == 0 is FALSE this line executes
	    
	    /*
	        10 is the baseNumber
	        
	        x = 10 <--- so now x acts as the base Number
	        
	        here we execute the recursion method. the baseNumber + test(baseNumber - 1). it continously runs this until 
	        test(x - 1) is == to 0.
	        
	      */  
	      
	        int a = x + test(x-1);  // var a holds the calculations 
	        
	        return a; // a is returned to test() method whit new calculations for 
	    }
	}
}
