package object_class;

public class CalculatorEx01 {
	
	public static void main(String[] args) {
		
		Calculator myCalc = new Calculator();
		int result1 = myCalc.sum(251, 364);
		
		System.out.println("계산결과" + result1);
		int result2 = myCalc.sum(451, 74, 99);
		
		System.out.println("계산결과 = " + result2);
		int result3 = myCalc.sum(451, 74, 99);
		
		System.out.println("계산결과 = " + result2);
		
		int[] values = {21, 89, 5, 96, 123, 47, 63, 55, 99};
		int result4 = myCalc.sum(values);
		System.out.println("계산결과 : " + result4);
		
	}
}
