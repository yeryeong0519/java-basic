package operator;

public class OperatorEx02 {

	public static void main(String[] args) {
//		int apple = 1;
//		double pieceUnit = 0.1;
//		int number = 7;
//		double result = apple - number *  pieceUnit;
//		System.out.println("나눠주고 남은 사과 양=" + result);
		
		int apple = 1;
		int totalPiece = apple * 10;
		int number = 7;
		int result = totalPiece - number;
		System.out.println("10조각에서 남은 조각수 = " + result);
		System.out.println("실제 사과 1개에서 남은 양 = " + result / 10.0);
	}
}
 