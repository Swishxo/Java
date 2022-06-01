/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/

import java.util.Scanner;
import java.text.DecimalFormat;

public class Main
{
	public static void main(String[] args) {
		
		
		//Prompt users
		
		System.out.println("Welcome to the Slot Machine\n");
		System.out.println("Do you wish to play? 1 = yes\n2 = no");
		
		Scanner scan = new Scanner(System.in); //gets keyboard commands
		
		int choice = scan.nextInt();
		
		if(choice == 1) {
		    
		    switch(choice){
		        
		            case 1:
		                spin(1);
		                
		                System.out.println("Play again? 1 or 2");
		                choice = scan.nextInt();
		                
		                if(choice == 1){
		                    
		                    for(choice = 1; choice <= 100; choice++){
		                        
		                        spin(choice);
		                    
		                    }//end for
		                    
		                }//end if
		                
		                else{
		                    
		                    coinAmt(0);
		                }
		                
		                break;
		            default:
		            System.out.println("Thanks for coming bye");
		               
		        }//end switch
		    
		    if(choice == 2){
		       
		}//end if
	
		    
		}
	}//end main
	
	public static void spin(int num) {
		
		int count = 0;
		
		count += num;
		
		coinAmt(count);
		
	}//end spin
	
	public static void coinAmt(int cost) {
		
		int amt = 100 - cost;
		
		DecimalFormat newFormat = new DecimalFormat("0.00");
	
		
		System.out.println("Coin left over: " + newFormat.format(amt) + " Valued @: " + (amt * .25));
		
		winnings(amt);
		
		machine();
		
	}//end coin
	
	public static void winnings(int x){
	    
	    DecimalFormat newFormat1 = new DecimalFormat("0.00");
	    
	    System.out.println("Coin left over: " + newFormat1.format(x) + " Valued @: " + (x * .25));
	    
	}//end winnings
	
	public static void machine(){
	    
	    slot();
	    
	}//end machine
	
	public static void slot(){
	    
	    double win1, win2, win3;
	    
	    win1 = 1;
	    win2 = 3;
	    win3 = 5;
	    
	    int count = 0;
	    
	    ++count;
	    
	    if(count < 35){
	        
	        System.out.println("You Lost on Slot 1!");
	        
	        
	        if(count == 35){
	            
	            System.out.println("You Won! on Slot 1");
	            //winnings(win1);
	            
	        }//end nested if
	        
	    }//end if
	    
	    if(count < 100){
	        
	        System.out.println("You Lost on Slot 2!");
	        
	        if(count == 100){
	            
	            System.out.println("You Won! on Slot 2");
	            //winnings(win2);
	            
	        }//end nested if
	        
	    }//end if
	    
	    if(count < 8){
	        
	        System.out.println("You Lost on Slot 3!");
	        
	        if(count == 8){
	            
	            System.out.println("You Won! on Slot 3");
	            count = 0;
	            //winnings(win3);
	            
	        }//end nested if
	        
	    }//end if
	    
	}//end slot
	
	
	
}//end main
