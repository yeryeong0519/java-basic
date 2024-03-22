package object_class;

public class PhysicalInfo {

	String name;
	int age;
	float height, weight;

	public PhysicalInfo(String name, int age, float height, float weight) {
//		super();		//부모생성자 호출
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	// 오버로딩이란 ...
	// 위, 아래 매서드는 같지만 매개변수가 달라서 오류가 나지 않음
	// 매개변수의 개수는 타입이 달라도 만들 수 있다.
	// 똑같은 이름을 가진 메소드 여러개를 만드는것이 오버로딩이다.

	void update(int age, float height, float weight) {
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	void update(int age, float height) {
		this.age = age;
		this.height = height;
		// 해당 필드에 업데이트
	}

	void update(int age) {
		this.age = age;
	}

}
