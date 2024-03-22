package operator;

public class OperatorEx10 {

	public static void main(String[] args) {
		//삼항연산자 (조건식) ? 식1 : 식2;
		//조건식이 참이면 식1 수행, 거짓이면 식2 수행
		int num1 = 70;
		int num2 = 300;
		int result = (num1 > num2) ? num1 : num2;
		System.out.println("두 수 중에 큰 값은 " + result);
	}
}


 