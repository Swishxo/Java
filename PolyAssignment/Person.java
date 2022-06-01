
public class Person extends Name {
	
	private int age;

	public Person(String fName, String mName, String lName, int age) {
		super(fName, mName, lName);
		setAge(age);
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return super.toString() + "\n" + "Age: " + getAge();
		
	}

}
