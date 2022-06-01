/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		int numbers[] = {1,34,5,63,55};
		
		int sum = 0;
		
		for(int count = 0; count <= 4; count++){
		    
		    sum = sum + numbers[count];
		    
		    System.out.println("count: " + count + "\tindex: " + numbers[count] + "\t" + "SUM:" + sum);
		}
	}
}
