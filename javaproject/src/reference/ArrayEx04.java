package reference;

import java.util.Scanner;

public class ArrayEx04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("*** 가위바위보게임 ***");
		System.out.println("선택해주세요(1.바위 2.가위 3.보)>>");
		int my = sc.nextInt();
		int com = (int)(Math.random()*3)+1;
		String[] choice = {"바위", "가위", "보"};
		if(my == com) {
			System.out.println("컴퓨터와 비겼습니다.");
		}else if((my == 1 && com == 2) || (my == 2 && com == 3) || (my == 3 && com == 1)){
			System.out.println("당신이 이겼습니다.");
		}else {
			System.out.println("컴퓨터한테지다니");
		}
		System.out.println("[컴퓨터:" + choice[com -1] + "]***[나 :" + choice[my-1]+"]");

	}
}
