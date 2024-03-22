package object_class;

//싱글톤은 오로지 딱 하나만 존재하는것. 

public class Singleton {
	//접근 제한자와 함께 정적 멤버 선언과 초기화
	private static Singleton singleton = new Singleton();
	
	//생성자
	private Singleton() {		//클래스명과 동일

	}
	
	//메서드
	static Singleton getInstance() {
		return singleton;
	}
	
	

}
