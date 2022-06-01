
public class Date {

	private int month;
	private int day;
	private int year;
	
	Date(int month, int day, int year){
		setMonth(month);
		setDay(day);
		setYear(year);
	}
	
	Date(Date date){
		setMonth(date.month);
		setDay(date.day);
		setYear(date.year);
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if((month < 1) || (month > 12)) {
			System.out.println("Enter a month 1-12");
		}
		else {
			this.month = month;
		}
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		if((day < 1) || (day > 31)) {
			System.out.println("Enter a correct day 1-31");
		}
		else {
			this.day = day;
		}
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		if((year < 2021 ) || (year > 2021)) {
			System.out.println("Enter current year");
		}
		else {
			this.year = year;
		}
	}
	
	public String toString() {
		return "Date:" + " " + getMonth() + "/" + getDay() + "/" + getYear();
	}
	
	
}
