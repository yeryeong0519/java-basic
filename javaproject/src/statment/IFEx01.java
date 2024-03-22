package statment;

import java.util.Scanner;

public class IFEx01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력 >>");
		int score = sc.nextInt();
		if(score >= 80) {
			System.out.println("합격을 축하드립니다.");
			System.out.println("3월 20일까지 서류를 제출하세요.");
		}
		System.out.println("수고하셨습니다.");
	}

}
