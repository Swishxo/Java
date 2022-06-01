import java.util.Random;

public class Hockey extends Athlete implements Action{

	public Hockey(String fName, String mName, String lName, int age, String team, String position) {
		super(fName, mName, lName, age, team, position);
	}
	@Override
	public String sport() {
		return "Hockey";
	}
	@Override
	public String doThis() {
		return "I play on ICE";
	}

	@Override
	public int ranking() {
		Random rand = new Random();
		return rand.nextInt(11) + 1;
	}
	@Override
	public boolean equals(Object otherObj) {
		if(!(otherObj instanceof Hockey))
		return false;
		else
		//returns "true" if test is true	
		return ((this.ranking() == ((Hockey)otherObj).ranking()) 
				&& (this.ranking() == ((Hockey) otherObj).ranking()));
	}
	@Override
	public String toString() {
		String msg = "Name: " + super.getfName() + " " + super.getmName().charAt(0) + ". " + super.getlName() + "\n";
		String msg2 = "Age: " + super.getAge() + "\n" + "Team: " + super.getTeam() + "\n" + "IS A: " + super.getPosition() + "\n" + "Ranking: " 
		+ ranking() +  "\n" + "SPORT: " + sport(); 
		
		return msg + msg2;
	}

}
