package API;

import java.util.Calendar;
import java.util.TimeZone;


public class TimeEx01 {

	public static void main(String[] args) {
		TimeZone tz = TimeZone.getTimeZone("Europe/Rome \n\n");
		System.out.println(tz);
//		TimeZone
		Calendar now = Calendar.getInstance();
//		System.out.println(now);
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) + 1;
		int day = now.get(Calendar.DAY_OF_MONTH);
		//시
		int hour = now.get(Calendar.HOUR);
		//분
		int minute = now.get(Calendar.MINUTE);
		//초
		int second = now.get(Calendar.SECOND);
		//오전오후
		int ampm = now.get(Calendar.AM_PM);
		String ap;
		if(ampm == Calendar.AM) {
			ap = "오전";
		}else {
			ap = "오후";
		}
		System.out.printf("현재 로마의 날자는 %d년 %d월 %d일이고 " ,year, month, day );
		System.out.printf("현재 로마의 시간은 %s %d시 %d분 %d초 입니다.", ap, hour, minute, second);
//		System.out.println(year + "년" + month + "월" + day + "일\n");
//		System.out.println(hour + "시 " + minute + "분 " +ampm);

	}

}
