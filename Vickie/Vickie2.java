/*
 * Created..: Stephon Tidd
 * Date..:	  May 16, 2021
 * Purpose..: Slot Machine
 */

import java.util.Scanner;
import java.text.DecimalFormat;

public class Vickie2 {

public static void main(String[] args) {
		
		
		//Prompt users
		
		System.out.println("Welcome to the Slot Machine\n");
		System.out.println("Do you wish to play? 1 = yes\n2 = no");
		
		Scanner scan = new Scanner(System.in); //gets keyboard commands
		
		//Menu based on user choice
		
		int choice = scan.nextInt();
		
		if(choice == 1) {
		    
		    switch(choice){//Enter menu based on selection
		        
		            case 1://Automatic spin as if playing
		            	
		                spin(1);
		                
		                System.out.println("Play again? 1 or 2");//Another selection for user
		                
		                choice = scan.nextInt();
		                
		                if(choice == 1){
		                    
		                    for(choice = 1; choice <= 100; choice++){ //Adds +1 until choice reaches 100
		                        
		                        spin(choice); //Pass Active variable to spin Method
		                    
		                    }//end for
		                    
		                }//end if
		                
		                else{
		                    
		                	//If user selects anything other than 1
		                    coinAmt(0);
		                }
		                
		                break;
		                
		            default:
		            System.out.println("Thanks for coming bye");
		               
		        }//end switch
		    
		    if(choice == 2){
		    	
		    	System.out.println("Game End!");
		       
		}//end nested if
	
		    
		}//end if
		
	}//end main
	
	public static void spin(int num) {
		
		int count = 0;
		
		count += num;
		
		coinAmt(count);
		
	}//end spin
	
	public static void coinAmt(int cost) {
		
		//Calculations done for quarter amount and quarter left value
		
		int amt = 100 - cost;
		
		DecimalFormat newFormat = new DecimalFormat("0.00");
	
		
		System.out.println("Coin left over: " + newFormat.format(amt) + " Valued @: " + (amt * .25));
		
		winnings(amt);
		
		machine();
		
	}//end coin
	
	public static void winnings(int x){
		
		//Calculates the amount won
	    
	    DecimalFormat newFormat1 = new DecimalFormat("0.00");
	    
	    System.out.println("Coin won: " + newFormat1.format(x) + " Valued @: " + (x * .25));
	    
	}//end winnings
	
	public static void machine(){
	    
	    slot();
	    
	}//end machine
	
	public static void slot(){
		
		//IF repersents 3 different slots
	    
	    int win1, win2, win3;
	    
	    win1 = 1;
	    win2 = 3;
	    win3 = 5;
	    
	    int count;
	    
	    for(count = 100; count > 1; count--) {
	    	
	    	
	    }
	    
	    
	    //Slot 1
	    
	    
	    if(count < 35){
	        
	        System.out.println("You Lost on Slot 1!");
	        count++;
	       
	    }//end if
	    
	    if(count == 35){
            
            System.out.println("You Won! on Slot 1");
            winnings(win1);
            count++;
        }//end if
	    
	    
	    //Slot 2
	    
	    
	    else if(count < 100){
	        
	        System.out.println("You Lost on Slot 2!");
	        count++;
	        
	        if(count == 100){
	            
	            System.out.println("You Won! on Slot 2");
	            count++;
	            winnings(win2);
	            
	        }//end nested if
	        
	    }//end if
	    
	    
	    //Slot 3
	    
	    
	    if(count < 8){
	        
	        System.out.println("You Lost on Slot 3!");
	        count++;
	        
	        if(count == 8){
	            
	            System.out.println("You Won! on Slot 3");
	            count = 0;
	            winnings(win3);
	            
	        }//end nested if
	        
	    }//end if
	    
	}//end slot
	
	
	

}
