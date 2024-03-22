package exceptionEx;

public class Account {
	String accountNo;
	String ownerName;
	int balance;

	public Account() {

	}

	public Account(String accountNo, String ownerName, int balance) {
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}

	void deposit(int amount) {
	}

	int withdraw(int amount) throws Exception {
		if (balance < amount) {
			throw new InsufficientException("잔고부족(" + (amount - balance) + "모자람");
		}
		balance -= amount;
		return amount;
	}
}
