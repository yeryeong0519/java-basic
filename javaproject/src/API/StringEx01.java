package API;

public class StringEx01 {

	public static void main(String[] args) {
		String str = "홍길동 ";
		str += "파이팅 ";
		str += "만세";
		System.out.println(str);		//str에는 번지가 들어있고 toString은 번지를 찾아감	(str.toString()) 투스트링 생략가능
		
		StringBuilder sb = new StringBuilder();
		sb.append("우리모두");
		sb.append("파이팅");
		System.out.println(sb.toString());
		sb.insert(4,  "힘차게");
		System.out.println(sb.toString());
		sb.setCharAt(7, '화');
		System.out.println(sb.toString());
		sb.replace(4,  7, "아자아자");
		System.out.println(sb.toString());
		sb.delete(8, 11);
		System.out.println(sb.toString());
		String result = sb.toString();
		System.out.println(result );
	}
}