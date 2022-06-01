import java.util.Random;

public class Baseball extends Athlete implements Action{
	
	Random rand = new Random();
	public Baseball(String fName, String mName, String lName, int age, String team, String position) {
		super(fName, mName, lName, age, team, position);
		
	}
	@Override
	public String sport() {
		return "Baseball";
	}

	@Override
	public int ranking() {
		
		return rand.nextInt(11) + 1;
	}
	@Override
	public String doThis() {
		return "I hit home Runs!";
	}
	@Override
	public boolean equals(Object otherObj) {
		if(!(otherObj instanceof Baseball))
		return false;
		else
		//returns "true" if test is true	
		return ((this.ranking() == ((Baseball)otherObj).ranking()) 
				&& (this.ranking() == ((Baseball) otherObj).ranking()));
	}
	
	@Override
	public String toString() {
		return super.toString() + "\n" + "Ranking: " + ranking() + "\n" + "SPORT: " + sport();
	}

}
