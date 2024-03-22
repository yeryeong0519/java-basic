package operator;

import java.text.DecimalFormat;
import java.util.Scanner;

public class OperatorEx12 {

	public static void main(String[] args) {
		/*
		 * 구입할 상품의 금액을 입력받아 할인율을 적용하여 계산하는 프로그램을 작성하시오
		 * 10,000원 이상의 상품은 20% 할인율을 적용, 미만은 10%
		 * 상품의 금액을 입력>>80000
		 */
		
		Scanner sc = new Scanner(System.in);	
		System.out.print("상품금액 입력>>");
		int price = sc.nextInt();
		DecimalFormat df = new DecimalFormat("#,###"); 					//숫자 출력 형식 지정 
		double total = (price > 10000) ? price * (0.8) : price * (0.9);
		
		//double discountRate = (price >= 10000) ? 0.2 : 0.1; ...상품의 금액에 따라 할인율 결정
		//double discountPrice = price - (price * discountRate);
		//System.out.println("상품의 가격은 " +price +"이고, 할인율을 적용하여 " +discountPrice+ "원에 구입 가능합니다.");
		
		System.out.println("상품의 가격은 " +df.format(price) +"원이고, 할인율을 적용하여 " +df.format((int)total)+ "원에 구입 가능합니다.");
	}
}


 