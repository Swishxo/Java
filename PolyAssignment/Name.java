
public class Name {

	private String fName;
	private String mName;
	private String lName;
	
	public Name(String fName, String mName, String lName) {
		setfName(fName);
		setmName(mName);
		setlName(lName);
	}
	
	
	public String getfName() {
		return fName;
	}


	public void setfName(String fName) {
		this.fName = fName;
	}


	public String getmName() {
		return mName;
	}


	public void setmName(String mName) {
		this.mName = mName;
	}


	public String getlName() {
		return lName;
	}


	public void setlName(String lName) {
		this.lName = lName;
	}


	@Override
	public String toString() {
		return "Name: " + getfName() + " " + getmName().charAt(0) + ". " + getlName();
	}
}
