import java.util.*;

public class Test {

	public static void main(String[] args) {

		menu();
	}
	
	public static void isEquals(Object obj, Object otherObj) {
		System.out.println("Lets see if the Athletes are EQUAL: \n");
		System.out.println(obj.equals(otherObj));
		
	}
	public static void menu() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Menu\n");
		System.out.println("1.Baseball\n" + "2.Football\n" + "3.Hockey\n" + "4.Golfer\n5.Known Athletes");
		int choice = scan.nextInt();
		
		switch(choice) {
		case 1: System.out.print("Base Players!\n");
				System.out.print("Enter Athlete Name:\n");
				String fName = scan.next();
				System.out.print("Enter Middle Name:\n");
				String mName = scan.next();
				System.out.print("Enter Last Name:\n");
				String lName = scan.next();	
				System.out.print("Enter player Age:\n");
				int age = scan.nextInt();
				System.out.print("Enter player Team:\n");
				String team = scan.next();
				System.out.print("Enter player Position:\n");
				String position = scan.next();
				
				Baseball player = new Baseball(fName, mName, lName, age, team, position);
				
				System.out.println("Enter 1: For his Profession\nEnter 2: For his Ranking");
				int user = scan.nextInt();
				if(user == 1) {
					doThis(player);
				}
				if(user == 2) {
					rank(player);
				}
			break;
		case 2:	System.out.print("Football Players!\n");
				System.out.print("Enter Athlete Name:\n");
				fName = scan.next();
				System.out.print("Enter Middle Name:\n");
				mName = scan.next();
				System.out.print("Enter Last Name:\n");
				lName = scan.next();	
				System.out.print("Enter player Age:\n");
				age = scan.nextInt();
				System.out.print("Enter player Team:\n");
				team = scan.next();
				System.out.print("Enter player Position:\n");
				position = scan.next();
				
				Football playerBack = new Football(fName, mName, lName, age, team, position);
				
				System.out.println("Enter 1: For his Profession\nEnter 2: For his Ranking");
				user = scan.nextInt();
				
				if(user == 1) {
					doThis(playerBack);
				}
				if(user == 2) {
					rank(playerBack);
				}
			break;
		case 3:System.out.print("Football Players!\n");
			   System.out.print("Enter Athlete Name:\n");
			   fName = scan.next();
			   System.out.print("Enter Middle Name:\n");
			   mName = scan.next();
			   System.out.print("Enter Last Name:\n");
			   lName = scan.next();	
			   System.out.print("Enter player Age:\n");
			   age = scan.nextInt();
			   System.out.print("Enter player Team:\n");
			   team = scan.next();
			   System.out.print("Enter player Position: Skater or Goalie\n");
			   position = scan.next();
			   
			   Hockey sticks = new Hockey(fName, mName, lName, age, team, position);
			   
			   System.out.println("Enter 1: For his Profession\nEnter 2: For his Ranking");
				user = scan.nextInt();
				
				if(user == 1) {
					doThis(sticks);
				}
				if(user == 2) {
					rank(sticks);
				}
			break;
		case 4: System.out.print("Golf Players!\n");
		   		System.out.print("Enter Athlete Name:\n");
		   		fName = scan.next();
		   		System.out.print("Enter Middle Name:\n");
		   		mName = scan.next();
		   		System.out.print("Enter Last Name:\n");
		   		lName = scan.next();	
		   		System.out.print("Enter player Age:\n");
		   		age = scan.nextInt();
		   		System.out.print("Enter Tournment player is in:\n");
		   		team = scan.next(); //Represents tournament for golfer
		   		System.out.print("Enter player Sponsor:\n");
		   		position = scan.next(); //Represents sponsor for golfer
		   		
		   		Golfer golf = new Golfer(fName, mName, lName, age, team, position);
		   		
		   		System.out.println("Enter 1: For his Profession\nEnter 2: For his Ranking");
				user = scan.nextInt();
				
				if(user == 1) {
					doThis(golf);
				}
				if(user == 2) {
					rank(golf);
				}
			break;
		case 5: System.out.println("Known Athletes!");
				//Athletes specified
				Athlete aaron = new Baseball("Louis", "Aaron", "Hank", age(), "Braves", "Pitcher");
				Athlete bradshaw = new Football("Terry", "Paxton", "Bradshaw", age(), "Steelers", "QB");
				Athlete lemieux = new Hockey("Joesph", "Mario", "Lemieux", age(), "Penguins", "Skater");
				Athlete woods = new Golfer("Tiger", "Tont", "Woods", age(), "Masters", " Rolex");
				Athlete manning = new Football("Peyton", "Williams", "Manning", age(), "Broncos", "QB");
				Athlete gretzky = new Hockey("Wayne", "Douglas", "Gretzky", age(), "Rangers", "Skater");
				Athlete mickleson = new Golfer("Phil", "Alfred", "Mickelson", age(), "Masters", "Amgen");
				
				//Personal Athlete selection
				Athlete jeter = new Baseball("Derek", "Sanderson", "Jeter", age(), "Yankees", "Shortstop");
				Athlete	brady = new Football("Thomas", "Patrick", "Brady", age(), "Buccaners", "QB");
				Athlete	robinson = new Baseball("Jackie", "Roosevelt", "Robinson", age(), "Dodgers",  "Shortstop");
				Athlete	bossy = new Hockey("Mike", "Jean", "Bossy", age(), "Islanders", "Skater");
				Athlete	johnson = new Football("Chad", "Javon","Johnson", age(), "Bengals", "WR");
				
				Athlete people[] = {aaron, bradshaw, lemieux, woods, manning, gretzky, mickleson, jeter, brady, robinson, bossy, johnson};
				int count = 0;
				for(int i = 0; i < people.length; i++) {
					System.out.println();
					System.out.println(count + "."+ (people[i]) + "\n" + people[i].doThis());
					count++;
				}
				
				System.out.println("\nCompare Athlete of your choice\nAthlete must be in the same sport");
				System.out.println("Example: TIGER vs Mickelson == 4 vs 7");
				System.out.print("Make selection:\n");
				System.out.print("Selection 1: ");
				int selection = scan.nextInt();
				System.out.print("Selection 2: ");
				int selection2 = scan.nextInt();
				System.out.println(compare(people[selection], people[selection2]));;
			break;
			default: System.out.println("Program Done...");
		
		}
		
	}
	public static void doThis(Athlete obj) { //method linked to menu
		Scanner scan = new Scanner(System.in);
		
		System.out.println(obj.doThis());
		System.out.println("Want to see Ranking?");
		System.out.println("1.Ranking\n2.Menu");
		int user = scan.nextInt();
		if(user == 1) {
			rank(obj);
		}
		if(user == 2)
			menu();
	}
	public static void rank(Athlete obj) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ranking: " + obj.ranking());
		System.out.println("Want to see Profession?");
		System.out.println("1.Profession\n2.Menu");
		int user = scan.nextInt();
		if(user == 1) {
			doThis(obj);
		}
		if(user == 2)
			menu();
		
	}
	public static String onlyDoThis(Athlete object) {
		return object.doThis();
	}
	public static String compare(Athlete thisObj, Athlete otherObj) {
		
		if(thisObj.ranking() > otherObj.ranking()) {
			return "Selection 1 is better";
		}
		if(thisObj.ranking() < otherObj.ranking()) {
			return "Selection 2 is better";
		}
		else {
			return "Both Athletes are equal";
		}
	}
	
	public static int age() {
		Random rand = new Random();
		int age = rand.nextInt(15) + 20;// whatever random number plus 20 gives age. This ensures age is greater than 18
		 
		return age;
		
	}
}

//
//Scanner scan = new Scanner(System.in);
//
////Athletes specified
//Athlete aaron = new Baseball("Louis", "Aaron", "Hank", age(), "Braves", "Pitcher");
//Athlete bradshaw = new Football("Terry", "Paxton", "Bradshaw", age(), "Steelers", "QB");
//Athlete lemieux = new Hockey("Joesph", "Mario", "Lemieux", age(), "Penguins", "Skater");
//Athlete woods = new Golfer("Tiger", "Tont", "Woods", age(), "Masters", " Rolex");
//Athlete manning = new Football("Peyton", "Williams", "Manning", age(), "Broncos", "QB");
//Athlete gretzky = new Hockey("Wayne", "Douglas", "Gretzky", age(), "Rangers", "Skater");
//Athlete mickleson = new Golfer("Phil", "Alfred", "Mickelson", age(), "Masters", "Amgen");
//
////Personal Athlete selection
//Athlete jeter = new Baseball("Derek", "Sanderson", "Jeter", age(), "Yankees", "Shortstop");
//Athlete	brady = new Football("Thomas", "Patrick", "Brady", age(), "Buccaners", "QB");
//Athlete	robinson = new Baseball("Jackie", "Roosevelt", "Robinson", age(), "Dodgers",  "Shortstop");
//Athlete	bossy = new Hockey("Mike", "Jean", "Bossy", age(), "Islanders", "Skater");
//Athlete	johnson = new Football("Chad", "Javon","Johnson", age(), "Bengals", "WR");
//
//Athlete people[] = {aaron, bradshaw, lemieux, woods, manning, gretzky, mickleson, jeter, brady, robinson, bossy, johnson};
//int count = 0;
//for(int i = 0; i < people.length; i++) {
//	System.out.println();
//	System.out.println(count + "."+ (people[i]) + "\n" + people[i].doThis());
//	count++;
//}
//
//System.out.println("\nCompare Athlete of your choice\nAthlete must be in the same sport");
//System.out.println("Example: TIGER vs Mickelson == 4 vs 7");
//System.out.print("Make selection:\n");
//System.out.print("Selection 1: ");
//int selection = scan.nextInt();
//System.out.print("Selection 2: ");
//int selection2 = scan.nextInt();
//System.out.println(compare(people[selection], people[selection2]));;