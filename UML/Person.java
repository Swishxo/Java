//Class defines who a person is
public class Person {
	
	Identity id;

	private char gender;
	private int age;
	private double salary;
	private String name;
	private static boolean isMale = true;
	
	public Person(Identity id,char gender, int age, double salary) {
		setGender(gender);
		setAge(age); 
		setSalary(salary);
		setName(id);
		//this.name = id.toString();
	}
	
	public void setName(Identity id) {
		
		this.name = id.toString();
	}
	
	public String getName() {
		return this.name;
	}

	public char getGender() {
		return this.gender;
	}

	public void setGender(char gender) {
		
		boolean isGender = true;
		this.gender = gender;
		while(isGender) {
			if((this.gender != 'M') || (this.gender != 'F')) {
				isGender = false;
			}
			else {
				this.gender = gender;
			}
			isGender = false;
		}
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		
		this.age = age;
		
		if((this.age < 1) || (this.age > 121)) {
			System.out.println("Age between 1 and 121");
		}
		else {
			this.age = age;
		}
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
		if(this.salary < 0) {
			System.out.println("Enter Salary ex:$ 20000.00");
		}
	}

	@Override
	public String toString() {
		String message;
		
		if(this.gender == 'M'){
			message = this.name + " is a Male" + " who is " + this.age +" years old" + 
					" and Salary is " + this.salary;
			return message;
		}
		else {
			message = this.name + " is a Female " +" who is " + this.age +" years old" + 
					" and Salary is $" + this.salary;
		}
		return message;
		 
	}
	
	
}
