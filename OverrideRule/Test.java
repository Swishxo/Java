import java.util.*;
public class Test {

	public static void main(String[] args) {
		
		userPick();
	}
	
	public static void xbox() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Gamer tag:\n");
		String gamerTag = scan.nextLine();
		Xbox one = new Xbox(gamerTag);
		System.out.println(one.toString());
		one.menuSystem();
	}
	public static void playstation() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Gamer tag:\n");
		String gamerTag = scan.nextLine();
		Playstation five = new Playstation(gamerTag);
		System.out.println(five.toString());
		five.menuSystem();
	}
	public static void userPick() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Choose a Console:\n1.XBOX X\n2.PLAYSTATION 5");
		int user = scan.nextInt();
		
		if(user == 1) {
			xbox();
		}
		if(user == 2) {
			playstation();
		}
	}
	

}
