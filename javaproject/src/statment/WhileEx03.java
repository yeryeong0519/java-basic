package statment;

import java.util.Scanner;

public class WhileEx03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		boolean run = true;
		while (run) {
			System.out.print("로또 번호를 생성하려면 C를 입력, 그만 끝내려면 S를 입력 >>");
			String choice = sc.nextLine();
			if (choice.equals("C")) {

				for (int i = 1; i <= 6; i++) {
					num = (int) (Math.random() * 45) + 1;
					System.out.println(i + "번째 숫자 : " + num);
				}
			} else if (choice.equals("S")) {
				run = false;
			} else {
				System.out.println("입력오류 다시 입력하세요.");
			}
			System.out.println("<<프로그램종료>>");
		}
	}
}