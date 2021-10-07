 
public class Account {
	private static int account_count = 0;
	private double balance;
	private int id;
	
	public Account() {
		id = Account.account_count;
		Account.account_count ++;
	}
	public Account(double startingBalance) {
		this.balance = startingBalance;
		id = Account.account_count;
		Account.account_count ++;
	}
	
	public boolean withdraw(double amount) {
		if (balance - amount < 0) {
			return false;
		}else {
			balance = balance - amount;
			return true;
		}
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public int getId() {
		return id;
	}
}
