package object_class;

public class SingletonEx01 {

	public static void main(String[] args) {
		//Singleton single1 = new Singleton();		//싱글톤은 new로 인스턴스 객체를 만들 수 없다. 
		Singleton single1 = Singleton.getInstance();
		Singleton single2 = Singleton.getInstance();
		
		if(single1 == single2) {
			System.out.println("같은 객체입니다.");
		}else {
			System.out.println("다른 객체입니다.");
		}
	}

}
