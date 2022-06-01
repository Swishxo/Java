
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Identity stephon = new Identity("Stephon", "Tidd");
		Identity lyric = new Identity("Lyric", "Larina", "Tidd-Gray");
		Identity destiny = new Identity("Destiny", "Brown", "Tidd-Gray");
		
		//System.out.println(id);
		
		Person person1 = new Person(stephon,'M', 28, 100000.00);
		Person person2 = new Person(lyric,'F', 24, 90000.00);
		Person person3 = new Person(destiny,'F', 21, 80000.00);
		
		System.out.println(person1);
		System.out.println(person2);
		System.out.println(person3);
		
		
		
	

	}

}
