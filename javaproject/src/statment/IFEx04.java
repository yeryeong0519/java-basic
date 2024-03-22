package statment;

import java.util.Scanner;

public class IFEx04 {

	public static void main(String[] args) {
//		짝수, 홀수를 판별하는 프로그램을 작성
//		숫자 입력 >> 123
//		홀수입니다.
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력 >>");
		int num = sc.nextInt();
		if(num % 2 == 1) {
			System.out.println("홀수입니다.");
		}else {
			System.out.println("짝수입니다.");
		}
	}
}
