package object_class;

//첨성대 클래스(싱글톤)

public class Cheomseongdae {
	
	// 싱글톤 생성
	private static Cheomseongdae cheom = new Cheomseongdae();

	// 생성자
	private Cheomseongdae() {

	}

	// 메소드
	public static void show(String name) {
		System.out.println(name + "(가)이 천문을 관측합니다.");
	}

	public static Cheomseongdae getInstance() {
		return Cheomseongdae.cheom;
		
	}

}
