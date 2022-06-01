import java.util.*;
public class Football extends Athlete implements Action{
	
	Random rand = new Random();
	private int tackles;
	private int yardsRan;
	private int yardsThrown;

	public Football(String fName, String mName, String lName, int age, String team, String position) {
		super(fName, mName, lName, age, team, position);
		
	}
	
	public int getTackles() {
		return tackles;
	}


	public void setTackles(int tackles) {
		this.tackles = rand.nextInt(tackles);
	}


	public int getYardsRan() {
		return yardsRan;
	}


	public void setYardsRan(int yardsRan) {
		this.yardsRan = rand.nextInt(yardsRan);
	}


	public int getYardsThrown() {
		return yardsThrown;
	}


	public void setYardsThrown(int yardsThrown) {
		this.yardsThrown = rand.nextInt(yardsThrown);
	}
	@Override
	public int ranking() {
		return rand.nextInt(11) + 1;
	}
	@Override
	public String sport() {
		return "Football";
	}
	@Override
	public boolean equals(Object otherObj) {
		if(!(otherObj instanceof Football))
		return false;
		else
		//returns "true" if test is true	
		return ((this.ranking() == ((Football)otherObj).ranking()) 
				&& (this.ranking() == ((Football) otherObj).ranking()));
	}
	@Override
	public String doThis() {
		return "I score TOUCHDOWNS!";
	}
	@Override
	public String toString() {
		return super.toString() + "\n" + "Ranking: " + ranking() + "\n" + "SPORT: " + sport();
	}
}
