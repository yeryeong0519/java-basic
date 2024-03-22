package reference;

public class ArrayEx06 {

	public static void main(String[] args) {
		int[] lotto = new int[6];
		boolean run = true;
		while (run) { // run에 true를 넣어 while문으로 들어옴
			// 번호 6개 무작위 생성
			for (int i = 0; i < lotto.length; i++) { // <=, >= x
				lotto[i] = (int) (Math.random() * 45) + 1;
			}
			run = false; // 같은 번호를 찾아내는 알고리즘
			for (int i = 0; i < lotto.length - 1; i++) {
				for (int j = i + 1; j < lotto.length; j++) {
					if (lotto[i] == lotto[j]) {
						run = true;
						break;
					}
				}
			}
		}
		System.out.println("로또번호자동생성출력");
		for(int p = 0; p < lotto.length; p++) {
			System.out.println((p + 1) + "번째 번호: " + lotto[p]);
		}
	}
}
