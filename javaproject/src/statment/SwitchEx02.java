package statment;

import java.util.Scanner;

public class SwitchEx02 {

	public static void main(String[] args) {
		// 시험점수를 입력받아 등급을 계산하는 프로그램을 작성하시오
		// 문제를 입력>>96
		// A등급
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력 >>");
		int score = sc.nextInt();
		if (score <= 100 && score >= 0) {
			switch (score / 10) {
			case 10:
				System.out.println("A+");
				break;
			case 9:
				System.out.println("A");
				break;
			case 8:
				System.out.println("B");
				break;
			case 7:
				System.out.println("C");
				break;
			case 6:
				System.out.println("D");
				break;
			default:
				System.out.println("F");
			}

		}else {
			System.out.println("점수를입력하쇼");
		}

	}
}
