//Unique identification of individual
public class Identity {

	//Class Attributes
	
	private String firstName;
	private String middleName;
	private String lastName;
	
	//Constructor for person with only two names First and last
	Identity(String firstName, String lastName){
		
		setFirstName(firstName);
		setLastName(lastName);
	}//end Constructor
	
	//For all name fields getting filled
	Identity(String firstName, String middleName, String lastName){
		
		setFirstName(firstName);
		setMiddleName(middleName);
		setLastName(lastName);
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
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
	
	@Override
	public String toString() {
		String id = null;
		if(this.middleName == null) {
		id = this.firstName+" "+this.lastName;
		}
		else {
			id = this.firstName+" "+this.middleName+" "+this.lastName;
		}
		return id;
	}
}
