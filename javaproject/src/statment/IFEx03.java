package statment;

import java.util.Scanner;

public class IFEx03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("수량을 입력 >>");
		int amount = sc.nextInt();
		System.out.print("단가를 입력 >>");
		int price = sc.nextInt();
		if(amount >= 10 && price >= 1000) {
			price *= 0.8;
		}
		int salesPrice = amount * price;
		System.out.println("판매금액=" + salesPrice);
	}
}
