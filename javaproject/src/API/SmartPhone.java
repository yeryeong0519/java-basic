package API;

public class SmartPhone {
	
	//멤버변수(필드)
	private String company;
	private String os;
	
	//생성자
	public SmartPhone(String company, String os) {	//매개변수 , 외부에서 받는 변수
		this.company = company;
		this.os = os;
	}

	//메소드
	@Override
	public String toString() {
		return company + "," + os;
	}
	
	
}
