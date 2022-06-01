import java.util.Random;

public class Golfer extends Athlete implements Action {

	public Golfer(String fName, String mName, String lName, int age, String team, String position) {
		super(fName, mName, lName, age, team, position);
		
	}
	public String sport() {
		return "GOLF";
	}
	
	public String doThis() {
		return "I got a Hole in one!";
	}

	@Override
	public int ranking() {
		Random rand = new Random();
		return rand.nextInt(11) + 1;
	}
	@Override
	public boolean equals(Object otherObj) {
		if(!(otherObj instanceof Golfer))
		return false;
		else
		//returns "true" if test is true	
		return ((this.ranking() == ((Golfer)otherObj).ranking()) 
				&& (this.ranking() == ((Golfer) otherObj).ranking()));
	}
	@Override
	public String toString() {
		String msg = "Name: " + super.getfName() + " " + super.getmName().charAt(0) + " " + super.getlName() + "\n";
		String msg2 = "Age: " + super.getAge() + "\n" + "Tournment: " + super.getTeam() + "\n" + "Sponsor: " + super.getPosition() + "\n" + "Ranking: " 
		+ ranking() + "\n"+ "SPORT: " + sport();
		return msg + msg2;
	}

}
