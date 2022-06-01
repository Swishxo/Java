//If a class is abstract, the method must also be abstract
public abstract class Console {
	
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
	
	//Features of each console
	public abstract boolean consoleON();
	public abstract boolean consoleOFF();
	public abstract boolean insertDisk();
	public abstract boolean ejectDisk();
	public abstract boolean isConnected();
	public abstract void gamerTag(); //Random game stats for player
	
	//Getters and Setters for class variables
	public abstract int getPrice(); //abstract method
	public abstract void setPrice(int price); //abstract method
		
	public String getCpu() {
		return cpu;
	}
	public void setCpu(String cpu) { 
		this.cpu = cpu;
	}
	public double getGpu() {
		return gpu;
	}
	public void setGpu(double gpu) {
		this.gpu = gpu;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public int getStorage() {
		return storage;
	}
	public void setStorage(int storage) {
		this.storage = storage;
	}
	public int getFrameRate() {
		return frameRate;
	}
	public void setFrameRate(int frameRate) {
		this.frameRate = frameRate;
	}
	public int getResolution() {
		return resolution;
	}
	public void setResolution(int resolution) {
		this.resolution = resolution;
	}
	public int getOpticalDrive() {
		return opticalDrive;
	}
	public void setOpticalDrive(int opticalDrive) {
		this.opticalDrive = opticalDrive;
	}
	public abstract String getConsoleName(); //abstract method
		
	public abstract void setConsoleName(String consoleName); //abstract method
	
	public abstract String getGamerTag(); //abstract method
	
	public abstract void setGamerTag(String gamerTag); //abstract method
	
	public void menuSystem() {
		
	}
	public abstract void exclusiveTitles();
	@Override
	public String toString() {
		return "Console:.....Starting!" + "\n\n";
		
	}
	
}
