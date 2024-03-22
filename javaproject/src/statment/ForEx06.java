package statment;

public class ForEx06 {

	public static void main(String[] args) {
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			if(i % 5 == 0) {
				continue;
			}
			sum += i;
		}
		System.out.println("1부터 100까지의 합 (5의 배수 제외) = " + sum);
	}
}
