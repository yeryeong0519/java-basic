package statment;

import java.util.Scanner;

public class IFEx06 {

	public static void main(String[] args) {
		//비만도 체크 프로그램을 개발하시오
		//표준몸무게  = (키 - 100)*0.9 ... 마른체형, 정상, 비만
		//표준몸무게를 구한 후 -5<=표준몸무게<=+5이면 정상입니다.
		Scanner sc = new Scanner(System.in);
		System.out.print("키를 입력하세요>>");
		int height = sc.nextInt();
		System.out.print("몸무게를 입력하세요>>");
		int weight = sc.nextInt();
		int standard = (int)((height - 100) * 0.9);
		
		if(weight > standard + 5) {
			System.out.println("비만입니다.");
		}else if(weight >= standard - 5) {
			System.out.println("정상입니다.");
		}else {
			System.out.println("마른체형입니다.");
		}
	}
}
