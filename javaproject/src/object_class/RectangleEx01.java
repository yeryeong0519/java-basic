package object_class;

public class RectangleEx01 {

	public static void main(String[] args) {

		// 똑같은 메소드 여러개 사용하는것 : "메소드 오버로딩"

		try {
			Rectangle rect1 = new Rectangle(20, 30);
			int area = rect1.getArea();
			System.out.println("사각형의 면적 = " + rect1.getWidth()); // 캡슐화
			System.out.println("사각형의 높이 = " + rect1.getHeight());
			System.out.println("사각형의 면적 = " + area);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
