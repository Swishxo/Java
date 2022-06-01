import java.util.*;
public class Slot {
	
	Scanner scan = new Scanner(System.in);
	Random rand = new Random();
	
	private int Jackpot;
	private int smallPot;
	int user;
	int settings;
	String player;
	String currentDate;
	
	Date date;
	ID id;
	MoneyBalance balance;
	
	public Slot(Date date, ID id, MoneyBalance balance) {
		setBalance(balance);
		setDate(date);
		setDate(date);
	}

	public void menu() {
		boolean play = true;
		int count = 0;
		int endGame = 3;
		
		do{
			//loop for menu
			System.out.print(  "1. Luck 7\n"
					+ 		   "2. Lucky Lotto\n"
					+ 		   "3. Purple People Eater\n"
					+          "4. Create a Slot Machine\n"
					+          "5. Create a player\n"
					+		   "6. Quit\n");
			user = scan.nextInt();
			switch(user) {
				case 1: System.out.println("Welcome to Lucky 7");
						slotMachine();
				break;
				case 2: System.out.println("Lucky Lotto");
						slotMachine1();
				break;
				case 3: System.out.println("Purple People Eater");
						slotMachine2();
						
				break;
				case 4: System.out.println("Create a Slot Machine");
						System.out.println("How many Slots do you want?");
						int createdMachine = scan.nextInt();
						Slot[] slot = new Slot[createdMachine];
						for(int i = 0; i < slot.length; i++) {
							slot[i] = new Slot(getDate(), getId(), getBalance());
							slotMachine2();
						}
						
						
				break;
				case 5: System.out.println("How many player do you want?");
				 		int createdPlayer = scan.nextInt();
				 		ID[] id = new ID[createdPlayer];
				 		for(int i = 0; i < id.length; i++) {
				 			id[i] = getId();
				 			slotMachine2();
				 		}
				 		
				break;
				case 6: System.out.println("Quit");
						play = false;
						System.out.println("Ending Game.......\nEND");
				break;
				default: System.out.println("Wrong selection");
						 count++;
						 
						 if(count == endGame) {
							 System.out.println("Leaving game");
						 }
						 play = false;
				break;
				
			}
			
		}while(play); //end while
	}
	
	public void slotMachine() {
		//current amount
		int amount = getJackpot();
		if(amount < 0) {
			System.out.println("No money in wallet");
			menu();
		}
		//cost to play
		int cost = 1;
		//counts for various use
		int bigWin = 0, smallWin = 0, count = 0;
		//small cash win
		int smallCash = 5;
		
		System.out.println("Welcome to the Game");
		amount -= cost;
		System.out.println("Game cost "+cost+"\nNew Balance: " + amount);
		System.out.println(getCurrentDate());
		System.out.println("Welcome " + getStringID() + " " + "Current Jackpot: " + getJackpot());
		System.out.println();
		System.out.println("Game Starting");
		
		final int JACKPOT = 10;
		int miniPot = 5;
		
		for(int i = 1; i < JACKPOT; i++) {
			count++;
			System.out.println("Enter a number between 1-10");
			int user = scan.nextInt();
			int winningNum = rand.nextInt(11);
			System.out.println("Winning Number: "+ winningNum + "\n" + "Your Number: "+ user);
			if(i == JACKPOT) {
				bigWin++;
				System.out.println("Congrats You Won\n PRIZE: " + getJackpot());
				amount = amount - getSettings();
				System.out.println("New Total: "+ amount);
				System.out.println("Jackpot Wins: " + bigWin);
			}

			if(i == miniPot) {
				System.out.println("Smallpot Won");
				smallWin++;
				System.out.println("Congrats You Won\n PRIZE: " + smallCash);
				amount = amount - miniPot;
				System.out.println("New Total: "+ amount);
				System.out.println("Jackpot Wins: " + smallWin);
				miniPot +=5;

			}
			if(user == winningNum) {
				bigWin++;
				System.out.println("Congrats You Won\n PRIZE: " + getJackpot());
				amount = amount - getSettings();
				System.out.println("New Total: "+ amount);
				System.out.println("Jackpot Wins: " + bigWin);
			}
			
		}
		System.out.println("Do you want to play again? 1.Yes");
		user = scan.nextInt();
		if(user == 1) {
			slotMachine();
		}
		else{
			System.out.println("Number of games played " + count + "\nNumber of Jackpot Wins: " +bigWin);
			System.out.println("Number of Small Jackpot "+ smallWin + "\nYou won: " + amount);
			menu();
		}
			
	}
	//Lucky Lotto
	public void slotMachine1() {
				//current amount
				int amount = getJackpot1();
				if(amount < 0) {
					System.out.println("No money in wallet");
					menu();
				}
				//cost to play
				int cost = 1;
				//counts for various use
				int bigWin = 0, smallWin = 0, count = 0;
				//small cash win
				int smallCash = 25;
				
				System.out.println("Welcome to the Game");
				amount -= cost;
				System.out.println("Game cost "+cost+"\nNew Balance: " + amount);
				System.out.println(getCurrentDate());
				System.out.println("Welcome " + getStringID() + " " + "Current Jackpot: " + getJackpot1());
				System.out.println();
				System.out.println("Game Starting");
				
				final int JACKPOT = 100000;
				int miniPot = 50;
				
				for(int i = 1; i < JACKPOT; i++) {
					count++;
					System.out.println("Enter a number between 1-10");
					int user = scan.nextInt();
					int winningNum = rand.nextInt(11);
					System.out.println("Winning Number: "+ winningNum + "\n" + "Your Number: "+ user);
					if(i == JACKPOT) {
						bigWin++;
						System.out.println("Congrats You Won\n PRIZE: " + getJackpot1());
						amount = amount + getJackpot1();
						System.out.println("New Total: "+ amount);
						System.out.println("Jackpot Wins: " + bigWin);
					}
					if(i == miniPot) {
						System.out.println("Smallpot Won");
						smallWin++;
						System.out.println("Congrats You Won\n PRIZE: " + smallCash);
						amount = amount - miniPot;
						System.out.println("New Total: "+ amount);
						System.out.println("Jackpot Wins: " + smallWin);
						miniPot += 50;

					}
					if(user == winningNum) {
						bigWin++;
						System.out.println("Congrats You Won\n PRIZE: " + getJackpot1());
						amount = amount - getJackpot1();
						System.out.println("New Total: "+ amount);
						System.out.println("Jackpot Wins: " + bigWin);
					}
					
				}
				System.out.println("Do you want to play again? 1.Yes");
				user = scan.nextInt();
				if(user == 1) {
					slotMachine();
				}
				else{
					System.out.println("Number of games played " + count + "\nNumber of Jackpot Wins: " +bigWin);
					System.out.println("Number of Small Jackpot "+ smallWin + "\nYou won: " + amount);
					menu();
				}
	}
	public void slotMachine2() {
		//current amount
		int amount = 1000;
		if(amount < 0) {
			System.out.println("No money in wallet");
			menu();
		}
		//cost to play
		int cost = 1;
		//counts for various use
		int bigWin = 0, smallWin = 0, count = 0;
		//small cash win
		int smallCash = 40;
		
		System.out.println("Welcome to the Game");
		amount -= cost;
		System.out.println("Game cost "+cost+"\nNew Balance: " + amount);
		System.out.println(getCurrentDate());
		System.out.println("Welcome " + getStringID() + " " + "Current JackPot: " + getJackpot2());
		System.out.println();
		System.out.println("Game Starting");
		
		final int JACKPOT = 50;
		int miniPot = 5;
		
		for(int i = 1; i < JACKPOT; i++) {
			count++;
			System.out.println("Enter a number between 1-10");
			int user = scan.nextInt();
			int winningNum = rand.nextInt(11);
			System.out.println("Winning Number: "+ winningNum + "\n" + "Your Number: "+ user);
			if(i == JACKPOT) {
				bigWin++;
				System.out.println("Congrats You Won\n PRIZE: " + getJackpot2());
				amount = amount + getJackpot2();
				System.out.println("New Total: "+ amount);
				System.out.println("Jackpot Wins: " + bigWin);
			}
			
			if(i == miniPot) {
				System.out.println("Smallpot Won");
				smallWin++;
				System.out.println("Congrats You Won\n PRIZE: " + smallCash);
				amount = amount - miniPot;
				System.out.println("New Total: "+ amount);
				System.out.println("Jackpot Wins: " + smallWin);
				miniPot +=5;

			}
			if(user == winningNum) {
				bigWin++;
				System.out.println("Congrats You Won\n PRIZE: " + getJackpot2());
				amount = amount - getJackpot1();
				System.out.println("New Total: "+ amount);
				System.out.println("Jackpot Wins: " + bigWin);
			}
			
		}
		System.out.println("Do you want to play again? 1.Yes");
		user = scan.nextInt();
		if(user == 1) {
			slotMachine();
		}
		else{
			System.out.println("Number of games played " + count + "\nNumber of Jackpot Wins: " +bigWin);
			System.out.println("Number of Small Jackpot "+ smallWin + "\nYou won: " + amount);
			menu();
		}
		
	}
	
	public int getJackpot() {
		int jackpot;
		return jackpot = 5000;
		
	}
	public int getJackpot1() {
		int jackpot = 75000;
		return jackpot;
	}
	public int getJackpot2() {
		int jackpot = 40;
		return jackpot;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		setCurrentDate(date.toString());
		this.date = date;
	}

	public ID getId() {
		return id;
	}

	public void setId(ID id) {
		setStringID(id.toString());
		this.id = id;
	}



	public MoneyBalance getBalance() {
		return balance;
	}



	public void setBalance(MoneyBalance balance) {
		this.balance = balance;
	}
	
	public int getUser() {
		int user = scan.nextInt();
		return user;
	}
	//will set player up according to users choice
	public void setSettings(int settings) {
		int temp = settings;
		settings = balance.getFunds(temp);
		 this.settings = settings;
	}
	//has the balance for the player
	public int getSettings() {
		return settings;
	}
	
	public void setStringID(String player) {
		 this.player = player;
	}
	
	public String getStringID() {
		return player;
	}

	public String getCurrentDate() {
		return currentDate;
	}

	public void setCurrentDate(String currentDate) {
		this.currentDate = currentDate;
	}
	
	
	
}
