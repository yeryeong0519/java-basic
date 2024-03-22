package operator;

public class OperatorEx01 {

	public static void main(String[] args) {
		int pencil = 253;
		int child = 12;
		int share = pencil / child;
		int remain = pencil % child;
		//System.out.println(5/2.0);		//나누기 결과를 실수로 받고싶으면 계산 할 때 둘다, 하나만 실수로 입력
		System.out.println("연필 " +pencil+ "자루를 " +child+ "명의 아이들에게 나누어주면 "+ pencil / child + "자루씩 가지고 " + pencil % child + "자루가 남는다.");
		System.out.printf("연필 %d자루를 %d명의 아이들에게 나누어주면 %d자루씩 가지고 %d자루가 남는다.", pencil, child, share, remain);
	}
}
 