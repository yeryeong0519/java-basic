package object_class;

//사각형 클래스 

public class Rectangle {
	// 멤버변수(필드)
	private int width;
	private int height;

	public Rectangle(int width, int height) throws Exception {
		if (width < 0 || height <= 0) {
			throw new Exception("넓이와 높이는 플러스 값이어야합니다.");
		}
//		super();
		this.width = width;
		this.height = height;
	}

	// 메소드

	int getArea() { // public 없으니까 default
		return width * height;
	}

	// getter, setter 메소드란?
	// 접근제한자 'private'을 둬서 접근하지 못 하도록(변경하지 못 하도록) 했을 때 읽어오거나 ..

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}
}
