package API;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegEx01 {

	public static void main(String[] args) {
		//정규표현식
		Scanner mysc = new Scanner(System.in);
		System.out.print("전화번호 입력 >>");
		String phoneNumber = mysc.next();
		String regExp = "(02|010)-\\d{3,4}-\\d{3,4}";	
//		전화번호 입력 시 맨 첨이 02 혹은 010 이어야함	"\\d{3, 4}:" 숫자로 된 3~4자리 	
		
		boolean result = Pattern.matches(regExp, phoneNumber);	
//		패턴 클래스의 매치란 메소드 . result(전화번호)가 올바른 형식인지 판단한다 ~
		if(result) {
			System.out.println("올바른 전화번호입니다.");
		}else {
			System.out.println("전화번호 형식이 아닙니다.");
		}
		
		System.out.print("이메일 입력 >>");
		String email = mysc.next();
		regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
//		'\w'는 숫자 영문자 둘다가능, '\d'는 숫자, '\.'은 숫자 '()?'은 나와도 되고 안 나와도 되는 형식
		result = Pattern.matches(regExp, email);
		if(result) {
			System.out.println("올바른 이메일 주소입니다.");
		}else{
			System.out.println("이메일 주소형식이 아닙니다.");
		}
	}
}
