package statment;

public class ForEx05 {

	public static void main(String[] args) {
//		System.out.println("주사위를 굴려보자.");
//		int dice = (int)(Math.random() * 6) + 1;		//난수발생(0~1 사이의 무작위 수 발생)...주사위 0은 없어서 +1
//		System.out.println("나온숫자 : " + dice );
		System.out.println("로또번호생성");
		for(int i = 1; i <= 6; i++) {
			int lotto = (int)(Math.random() * 45) + 1;
			System.out.print(i +"번째 숫자 : " +lotto +"\n");
		}
	}
}
