
public class MoneyBalance {
	
	private int funds;
	
	MoneyBalance(int option){
		getFunds(option);
	}

	public int getFunds(int funds) {
		if(funds == 1) {
			funds = 5000;
			return funds;
		}
		if(funds == 2) {
			funds = 55000;
			return funds;
		}
		else {
			funds = 1000;
			return funds;
		}
		
	}
	
	public int setFunds(int funds) {
		if(funds == 1) {
			funds = 5000;
			return funds;
		}
		if(funds == 2) {
			funds = 55000;
			return funds;
		}
		else {
			funds = 1000;
			return funds;
		}
		
	}

}
