import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Date date;
		ID id;
		MoneyBalance balance;
		Slot slot;
		
		
		
		System.out.println("Set todays date Example 01/01/1990");
		int month = scan.nextInt();
		int day = scan.nextInt();
		int year = scan.nextInt();
		date = new Date(month, day, year);
		
		System.out.println();
		
		System.out.println("Set your name: Example John Eli Doe\n");
		System.out.println("First/Middle/Last");
		String firstName = scan.next();
		System.out.println("Hit Enter!");
		String middleName = scan.next();
		System.out.println("Hit Enter!");
		String lastName = scan.next();
		System.out.println("Hit Enter!");
		id = new ID(firstName, middleName, lastName);
		
		balance = new MoneyBalance(0);
		
		System.out.println();
		
		slot = new Slot(date, id, balance);
		slot.setStringID(id.toString());
		slot.menu();
		
		
	}

}
