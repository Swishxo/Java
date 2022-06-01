import java.util.*;
public class Xbox extends Console {
	Random random = new Random();
	
	private String consoleName; //Name of console
	private int price; //Price of consoles
	private String cpu; // CPU power
	private double gpu; //GPU power
	private int ram; //Ram of each console
	private int storage; //Storage space of each console
	private int frameRate; //Frame rate of each console
	private int resolution; //Resolution of each console
	private int opticalDrive; //Optical Drive for each console
	private String gamerTag; //User Gamer tag
	
	
	
	public Xbox(String gamerTag) {
		setGamerTag(gamerTag);
	}
	public String getGamerTag() {
		return gamerTag;
	}
	public void setGamerTag(String gamerTag) {
		this.gamerTag = gamerTag;
	}

	@Override
	public boolean consoleON() {
		System.out.println("Booting.....\nWelcome");
		return true;
	}

	@Override
	public boolean consoleOFF() {
		System.out.println("Shuting Down..... Signed Off");
		return false;
	}

	@Override
	public boolean insertDisk() {
		System.out.println("Tray space empty, Insert Disk");
		return false;
	}

	@Override
	public boolean ejectDisk() {
		System.out.println("Disk Ejecting");
		return true;
	}

	@Override
	public boolean isConnected() {
		boolean gamers;
		int isOnline = random.nextInt(2); //Only options 0 and 1 are options
		if(isOnline == 0) {
			return false;
		}
		else {
			int gamersOnline = 200000;
			gamersOnline = random.nextInt(gamersOnline);
			System.out.println("Connecting to Online Features");
			System.out.println("Gamers Online: "  + gamersOnline);
			gamers = true;
		}
		return true;
	}

	@Override
	public void gamerTag() {
		int maxKills = 1000;
		int stats = random.nextInt(maxKills);
		System.out.println("Player:" + getGamerTag());
		System.out.println("Enimes Slayed: " + stats);
		double deathRatio = random.nextDouble() * 2.9; 
		System.out.println("K/D: " + deathRatio); 
		int hoursPlayed = 168;
		hoursPlayed = random.nextInt(hoursPlayed);
		System.out.println("Hours Played: " + hoursPlayed);
	}

	@Override
	public int getPrice() {
		price = 599;
		return price;
	}
	@Override
	public void setPrice(int price) {
		this.price = price;
		
	}
	@Override
	public String getConsoleName() {
		consoleName = "XBOX X";
		return consoleName;
	}
	@Override
	public void setConsoleName(String consoleName) {
		
		this.consoleName = consoleName;
	}
	@Override
	public String getCpu() {
		cpu = "8-core, 3.8 GHz AMD Zen 2";
		return cpu;
	}
	@Override
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	@Override
	public double getGpu() {
		gpu = 12.0;
		return gpu;
	}
	@Override
	public void setGpu(double gpu) {
		this.gpu = gpu;
	}
	@Override
	public int getRam() {
		ram = 16;
		return ram;
	}
	@Override
	public void setRam(int ram) {
		this.ram = ram;
	}
	@Override
	public int getStorage() {
		storage = 1;
		return storage;
	}
	@Override
	public void setStorage(int storage) {
		this.storage = storage;
	}
	@Override
	public int getFrameRate() {
		frameRate = 120;
		return frameRate;
	}
	@Override
	public void setFrameRate(int frameRate) {
		this.frameRate = frameRate;
	}
	@Override
	public int getResolution() {
		resolution = 8;
		return resolution;
	}
	@Override
	public void setResolution(int resolution) {
		this.resolution = resolution;
	}
	@Override
	public int getOpticalDrive() {
		opticalDrive = 4;
		return opticalDrive;
	}
	@Override
	public void setOpticalDrive(int opticalDrive) {
		this.opticalDrive = opticalDrive;
	}
	@Override
	public boolean equals(Object otherObj) {
		if(!(otherObj instanceof Xbox))
		return false;
		else
		//returns "true" if test is true	
		return ((this.getGpu() == ((Xbox)otherObj).getGpu()) 
				&& (this.getGamerTag() == ((Xbox) otherObj).getGamerTag()));
	}
	@Override
	public void exclusiveTitles() {
		String titles[] = {"Halo Infinite", "Senua’s Saga: Hellblade 2", "Forza Motorsport 8", "State of Decay 3"};
		
		int count = 0;
		for(int i = 0; i < titles.length; i++) {
			System.out.println((count++) + ":" + " " + titles[i]);
		}
	}
	@Override
	public void menuSystem() {
		System.out.println("1.Gamer Tag\n" + "2.Optical Drive\n" + "3.Resolution\n" + "4.FrameRate\n" +"5.RAM\n" +"6.GPU\n" +"7.ConsoleName\n" + "8.Price\n" + "9.Connected\n" + "10.OFF\n" + "11.ON\n" + "12.Eject Disk\n" + "13.Exclusive Titles\n");
		System.out.println("Enter a number to leave");
		boolean menu = true;
		do {

			Scanner scan = new Scanner(System.in);
			int user = scan.nextInt();
	
			switch(user) {
			case 1: gamerTag();
			break;
			case 2: getOpticalDrive();
			break;
			case 3: getResolution();
			break;
			case 4: getFrameRate();
			break;
			case 5: getRam();
			break;
			case 6: getGpu();
			break;
			case 7: getConsoleName();
			break;
			case 8: getPrice();
			break;
			case 9: isConnected();
			break;
			case 10: consoleOFF();
			break;
			case 11: consoleON();
			break;
			case 12: ejectDisk();
			break;
			case 13: exclusiveTitles();
			break;
			default:System.out.println("Still want to keep looking? 1 Yes/ 2 No  or" + " " + "'M'" + " to look at XBOX X" );
			user = scan.nextInt();
			if(user == 1) {
				menuSystem();
			  }
			else
				menu = false;
			}
			Test.main(null);
		}while(menu);
	}
	@Override
	public String toString() {
		String msg = "Gaming Console:" + getConsoleName() + " " +"Cost $"+ getPrice() + "\n";
		String msg1 = "Spec Preview:\n" + getCpu() + "\n" + "Storage Space: " + getStorage() + " " + "TB" + "\n";
		String msg2 = "Gamer: " + getGamerTag() + "\n";
		return super.toString() + msg + msg1 + msg2;
	}

}
