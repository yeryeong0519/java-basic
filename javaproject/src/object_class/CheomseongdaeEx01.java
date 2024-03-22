package object_class;

public class CheomseongdaeEx01 {

	public static void main(String[] args) {
		Cheomseongdae cheom1 = Cheomseongdae.getInstance(); // 싱글톤 객체정보 얻어옴
		cheom1.show("철수");
		Cheomseongdae cheom2 = Cheomseongdae.getInstance();
		cheom2.show("길동");
		if (cheom1 == cheom2) {
			System.out.println("같은 객체(첨성대)입니다.");
		} else {
			System.out.println("다른 객체(첨성대)입니다.");
		}

	}

}
