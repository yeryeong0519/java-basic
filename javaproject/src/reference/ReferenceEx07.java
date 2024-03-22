package reference;

public class ReferenceEx07 {

	public static void main(String[] args) {
		//문자열 분리 
		String str = (" 김철수, 이영희, 홍길동, 박찬호, 이영표");
		String[] names = str.split(",");	//구분자 "," 에 의해서 분리하겠다.
		System.out.println("** 출석자 명단 **");
		for(int i = 0; i < names.length; i++) {
			System.out.println((i + 1) + "번 : " + names[i]);	//(i + 1) + "번 : "); => 0번이라고 하기 쫌 그래서
		}
	}
}
