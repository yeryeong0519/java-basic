package inheritance;
//은행계좌클래스(특별상품)
public class DokdoAccount extends Account{
	//멤버변수(필드)
	int point;	//독도 기부 포인트
	//생성자
	
	public DokdoAccount(String accountNo, String ownerName, int balance, int point) {
		super(accountNo, ownerName, balance);
		this.point = point;	//부모(Account.java)에 없으니 따로 만들어야함 
	}
	
	//메소드 재정의
	
	@Override
	void deposit(int amount) {
		super.deposit(amount);
		point +=  amount * 0.001;	//900원까지 예금해도 포인트 안 쌓임
	}
	
	
	

}
