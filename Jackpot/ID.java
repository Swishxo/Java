import java.util.Random;

public class ID {
	
	Random randomGen = new Random();
	private String name;
	private String middleName;
	private String lastName;
	private int playerID;
	private int random;
	
	private final int idNum = 100000;
	
	ID(String name, String middleName, String lastName){
		setName(name);
		setMiddleName(middleName);
		setLastName(lastName);
		setPlayerID(randomGen.nextInt(idNum));
	}
	
	ID(String name, String lastName){
		setName(name);
		setMiddleName(middleName);
		setLastName(lastName);
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getPlayerID() {
		return playerID;
	}
	public void setPlayerID(int playerID) {
		this.playerID = playerID;
		
	}
	
	public String toString() {
		String msg;
		String message = "Player ID#" + getPlayerID();
		if(getMiddleName() == null) {
			 msg = "Player: " + getName() + " " + getLastName();
		}
		else {
			msg = "Player: " + getName() + " " + getMiddleName() + " " + getLastName();
		}
		
		return message + " " + msg;
	}
	

}
