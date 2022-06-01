/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		System.out.println("Welcome to my zombie game!");
		
		String wpn[] = {"Sword", "Rifle", "Launcher"};
		System.out.println(wpn[2]);
		
		
		int grades[] = {100, 78, 90, 84, 100};
		
		for(int i = 0; i <= grades.length; i++){  \\ the (.length) function can be used as a shortcut to increment through grades Array 
		    System.out.println(grades[i]);
		}
	}
}
