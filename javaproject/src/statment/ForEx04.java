package statment;

public class ForEx04 {

	public static void main(String[] args) {
		// 1부터 100까지의 합을 구하는 프로그램
//		int sum = 0;
//		for(int i = 1; i <= 100; i ++) {
//			sum += i;
//		}
//		System.out.println("1부터 100까지의 합 = " + sum );

		// 1부터 100까지 짝수와 홀수를 분리해서 합을 구하는 프로그램
		// 1부터 100까지 중 짝수의 합, 홀수의 합은?

		int total1 = 0, total2 = 0;

		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				total1 += i;
			} else {
				total2 += i;
			}
		}
		System.out.println("1부터 100까지의 합 = " + total1);
		System.out.println("1부터 100까지의 합 = " + total2);
	}
}
