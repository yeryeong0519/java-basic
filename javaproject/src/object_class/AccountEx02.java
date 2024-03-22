package object_class;

public class AccountEx02 {
	public static void main(String[] args) {
		Account chanho = new Account("222-33-11111", "박찬호", 0);
		Account gildong = new Account("222-33-11111", "박찬호", 0);
		chanho.deposit(1000);
		
		try {
			chanho.withdraw(400);
			printAccount(chanho);
			printAccount(gildong);
			printAccount(new Account("333-77-99999", "손흥민"));
		}catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}

}
