
public abstract class Athlete extends Person implements Action {
	
	private String team;
	private String position;

	public Athlete(String fName, String mName, String lName, int age, String team, String position) {
		super(fName, mName, lName, age);
		setTeam(team);
		setPosition(position);
		
	}
	
	public abstract int ranking();
	
	public String getTeam() {
		return team;
	}


	public void setTeam(String team) {
		this.team = team;
	}


	public String getPosition() {
		return position;
	}
	
	public void setPosition(String position) {
		this.position = position;
	}


	public String doThis() {
		return "I am an Athlete that play major sports";
	}
	
	@Override
	public String toString() {
		return super.toString() + "\n" + "Team: " + getTeam() + "\n" + "Position: " + getPosition();
	}
	

}
