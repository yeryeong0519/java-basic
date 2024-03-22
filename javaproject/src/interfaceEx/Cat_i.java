package interfaceEx;

public class Cat_i implements InterAnimal{
	//implements : 구현한다는 의미
	//'implements' 입력 시 클래스명에 에러뜨는이유 :  반드시 구현해야하기때문에
	
	@Override
	public void eat() {
		System.out.println("생선을 좋아합니다.");
		
	}

}
