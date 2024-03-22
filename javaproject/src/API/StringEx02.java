package API;

import java.util.StringTokenizer;

public class StringEx02 {

	public static void main(String[] args) {
//		String data = " 김철수, 이영희, 홍길동, 박찬호, 이영표";
//		String[] names = data.split("&|,|-");			//&또는 , 또는 " 로 구분하겠다는 뜻
//		for(int i = 0; i < names.length; i++) {
//			System.out.println(names[i]);
//		}
		
		String data = "김철수, 이영희, 홍길동, 박찬호, 이영표";
		StringTokenizer st = new StringTokenizer(data);
		while(st.hasMoreTokens()) {		//토커나이저가 토큰 객체에 가져올 데이터가 있는지 확인
			String name = st.nextToken();
			System.out.println(name);
		   
		}
	}
}