package exceptionEx;

public class ExceptionEx01 {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 0 ;
		try {
			int result = num1 / num2;
			System.out.println("결과 = " + result);
		} catch (ArithmeticException e) {
			System.out.println("0 으로 나누면 안됩니다.");
		}
	}
}