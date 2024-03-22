package statment;

public class IFEx05 {

	public static void main(String[] args) {
//		시험점수로 학점을 계산하는 프로그램
//		90 ~ 100	A
//		80 ~ 89		B
//		70 ~ 79		C
//		60 ~ 69		D
//		59점 이하		F
		int score = 100;
		String grade;
		if(score <= 100 && score >= 0) {
		if(score >=90) {
			if(score >= 95) {
				grade = "A+";
			}
			grade = "A";
		}else if(score>=80) {
			if(score >= 85) {
				grade = "B+";
			}
			grade = "B";
		}else if(score>=70) {	
			grade = "C";
		}else if(score>=60) {	
			grade = "D";
		}else {
			grade = "F";
			}
		System.out.println(grade + "등급");
		}else {
			System.out.println("점수입력오류");
		}
	}
}

/*
 * 중첩 if문
==================
*처음 조건이 참이고 두번째 조건이 거짓이면 수행할 내용이 없음. 처음과 두번째 다 참이면 else
*
	if(조건) {
		if(조건) {
			내용
		}else{
		}
	}else {
	}
	 */