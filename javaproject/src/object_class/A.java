package object_class;

public class A {
	int memberA;
	public A() {
		System.out.println("클래스 A의 생성자");
		//원래 생성자는 출력보다는 멤버변수의 값을 초기화시킴
	}
	
	//내부클래스
	class B{
		int memberB;
		public B() {
			System.out.println("내부 B클래스의 생성자");
		}
		void methodB1() {
			memberA = 10;
			System.out.println("내부 B클래스의 메소드");
		}
	}
	
	void methodA1() {
		System.out.println("A 클래스의 메소드");
	}

}
