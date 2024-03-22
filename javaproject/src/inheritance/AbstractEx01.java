package inheritance;

public abstract class AbstractEx01 {
	
	public static void main(String[] args) {
		Tiger hodol = new Tiger();
		Eagle eagle1 = new Eagle();
		hodol.name = "호돌이";
		hodol.age = 3;
		System.out.println(hodol.name + "는 " + hodol.age + "살입니다.");
		hodol.move();
		eagle1.home = "소나무둥지";
		eagle1.name = "독수리";
		System.out.println(eagle1.name +"는 " + eagle1.home + "에서 삽니다.");
		eagle1.move();
		
		
	}
}
