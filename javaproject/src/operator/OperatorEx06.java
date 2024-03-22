package operator;

import java.util.Scanner;

public class OperatorEx06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	//scanner객체 생성
		System.out.print("구입 할 수량을 입력>>");
		int num = sc.nextInt();
		int price = 1500;
		System.out.println("총 구입금액 = " +num * price +"원");
		
	}
}


 