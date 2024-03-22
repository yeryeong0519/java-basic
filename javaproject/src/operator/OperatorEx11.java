package operator;

import java.util.Scanner;

public class OperatorEx11 {

	public static void main(String[] args) {
		/*근속연수를 입력받아 휴가일수를 출력하는 프로그램을 작성하시오
		 * (근속연수가 5년 이상이면 근속연수의 두 배의 휴가일수가 주어지고
		 * 5년 미만이면 3일의 휴가)
		 * 근속연수 입력 >> ...
		 */
		
		Scanner sc = new Scanner(System.in);	
		System.out.print("근속연수 입력>>");
		int year = sc.nextInt();
		int day = (year > 5) ? year * 2 : 3;
		System.out.println("휴가일은 " +day +"입니다.");
	}
}


 