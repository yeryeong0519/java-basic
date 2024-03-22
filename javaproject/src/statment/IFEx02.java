package statment;

import java.util.Scanner;

public class IFEx02 {

	public static void main(String[] args) {
//		수량을 입력받아 판매금액을 계산하는 프로그램을 작성
//		10개 이상 구입하면 20% 할인 1000원 미만 품목 제외
		Scanner sc = new Scanner(System.in);
		System.out.print("구입 할 수량을 입력 >>");
		int amount = sc.nextInt();
		int price = 5000;
		String memo = "(정상가)";
		if(amount >= 10) {
			price *= 0.8;	//복합대입연산자를 자동으로 캐스팅 해준다.
			memo = "(할인가)";				//price = (int)(price * 0.8);
		}
		int salesPrice = amount * price;
		System.out.println("판매금액=" + salesPrice + memo);
	}
}
