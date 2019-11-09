

class Currency {
	private double dollars;
	private double won;
 	private double yen;
	
	public Currency(double initial_amount) {
		// initial_amount is given in won 
		// fill here! 
		if (initial_amount > 0) won = initial_amount;
		else won = 0;		

		dollars = initial_amount * 0.001;
		yen = initial_amount * 0.1;
	}
	
	public Currency add(Currency other) {
		// fill here!
		double new_amount;
		new_amount = won + other.getWon();
		Currency result = new Currency(new_amount);
		return result;
		//return new Currency(this.won + other.getWon());
	}
	public double getDollars() {
		// fill here!
		return dollars;
	}
	public double getWon() {
		// fill here!
		return won;
	}
	public double getYen() {
		// fill here!
		return yen;
	}
}

class BankAccount {
    private Currency balance;

    public BankAccount(Currency initial_amount) {
    	// fill here!
    	balance = initial_amount;
    }

    public Currency getBalance() {
    	// fill here!
    	return balance;
    }

    public boolean deposit(Currency money) {
    	// fill here!
    	boolean result = false;
    	balance = balance.add(money);
    	result = true;
    	return result;
    }
}

public class Q5 {
  public static void main(String[] args) {
    Currency money = new Currency(100); 
    BankAccount account = new BankAccount(money);
    account.deposit(money);
    System.out.println("balance = " + account.getBalance().getDollars()); // balance = 0.2
  }
}
