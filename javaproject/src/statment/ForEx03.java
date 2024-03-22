package statment;

import java.util.Scanner;

public class ForEx03 {

	public static void main(String[] args) {
		//콘솔로 단을 입력받아 출력하는 프로그램을 작성하시오.
		Scanner sc = new Scanner(System.in);	//scanner객체 생성
		System.out.print("원하는 단>>");
		int num = sc.nextInt();
		int i;
		System.out.println(num + "단");
		for(i = 1; i<=9; i++) {					//조건문은 언젠가 탈출하도록
			System.out.println(num + " x " + i + " = " + num * i + "\n");
		}
	}
}
