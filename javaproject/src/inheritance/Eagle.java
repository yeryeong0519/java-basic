package inheritance;

public class Eagle extends Animal{

	String home;
	
	@Override
	void move() {
		System.out.println("날개로 이동합니다.");
		
	}
}
