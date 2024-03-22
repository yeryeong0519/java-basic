package operator;

import java.util.Scanner;

public class OperatorEx07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//Scanner객체 생성
		System.out.print("인원을 입력>>");
		int num = sc.nextInt();
		int product = 100;
		try {
		int result = product / num;
		System.out.println("일인당 개수 =" + result + "개");
		
		}catch(Exception e) {
			System.out.println("0으로 나누지마세요");			//예외 발생 시 처리 
		}
	}
}


 