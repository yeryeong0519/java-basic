package API;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx01 {
	public static void main(String[] args) {
		
		//Date java.sql - db 관련 정보 클래스
		//Date java.util - 
		//SimpleDateFormat 날짜를 보기좋게 표현
		
		Date now = new Date();
		System.out.println(now);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");	//M month / m minute
		System.out.println(sdf.format(now));
		sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf.format(now));
		sdf = new SimpleDateFormat("yyyy년 MM월 dd일 ~~ ^^");
		System.out.println(sdf.format(now));
		sdf = new SimpleDateFormat("yyyy-MM-dd | hh:mm:ss E요일");	//hh 12시간 / HH 24시간 / E는 요일
		System.out.println(sdf.format(now));
		sdf = new SimpleDateFormat("yyyy년 D일째 날입니다.");
		System.out.println(sdf.format(now));
		sdf = new SimpleDateFormat("이번주는 MM월의 W번째 주입니다.");
		System.out.println(sdf.format(now));
		sdf = new SimpleDateFormat("이번주는 yyyy년의 w번째 주입니다.");
		System.out.println(sdf.format(now));
	}

}
