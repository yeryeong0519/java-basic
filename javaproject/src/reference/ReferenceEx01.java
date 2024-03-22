package reference;

public class ReferenceEx01 {

	public static void main(String[] args) {
		//변수는 기본타입, 참조타입
		int num = 20;	//기본타입... num이라는 변수에 20 저장
		String str = "korea";	//참조타입... str이라는 변수 안에 'korea'가 저장되어있는 주소 저장
		//String은 기본 타입이 아닌 클래스. 메소드가 있음
		System.out.println(str.toString());
		
	}

}
