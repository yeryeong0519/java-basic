package inheritance;

import exceptionEx.InsufficientException;

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
	
	void deposit (int amount) {
		
	}
	
	//인출메소드
	int withdraw(int amount) throws InsufficientException{
		if(balance < amount) {
		}
		balance -= amount;
		return amount;
	}
}
