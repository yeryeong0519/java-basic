package reference;

public class ReferenceEx06 {

	public static void main(String[] args) {
//		String str = "자바를 매일 배우고있다.";
//		int location = str.indexOf("자바");
//		System.out.println(location);
//		String str2 = "자바의 정석은 자바의 기초부터 활용까지 자바를 배울 수 있다.";
//		int location2 = str2.lastIndexOf("자바");
//		System.out.println("location2");
		String book = "자바의 정석";
		int location = book.indexOf("자바");
		if(location != -1) {
			System.out.println("자바와 관련된 책이군요.");
		}else {
			System.out.println("자바과 관련이 없는 책이군요.");
		}
		boolean result = book.contains("자바");
		if(result) {
			System.out.println("자바와 관련된 책이군요.");
		}else {
			System.out.println("자바와 관련이 없는 책이군요.");
		}
	}
}
