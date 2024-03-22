package statment;

public class ForEx11 {

	public static void main(String[] args) {

		for (int i = 1; i <= 15; i++) {
			for(int b = 15; b >= i; b--) {	//공백 줄이기 (-2)
				System.out.print(" ");
			}
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print("*");
			}
			System.out.println(); // 줄바꿈
		}
	}
}
