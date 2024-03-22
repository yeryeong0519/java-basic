package base;

public class VariableEx05 {

	public static void main(String[] args) {
		double dnum = 20.3;
		int num = (int)dnum;
		System.out.println(num);
		String str1 = "20";
		String str2 = "30";
		System.out.println(Integer.parseInt(str1) + Integer.parseInt(str2)); 							 
		int num2 = 10;								//Integer.parseInt => 문자로 되어있는 숫자를 숫자로 바꿔줌
		String str3 = String.valueOf(num2); 		//String.valueOf => 숫자를 문자로 
		System.out.println("값 =" + num2);
	}
}
