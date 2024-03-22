package reference;

public class ReferenceEx05 {

	public static void main(String[] args) {
		String str = ("우리모두화이팅");
		String newStr = str.replace("우리나라", "대한민국");
		System.out.println(newStr);
		System.out.println(str);
		String str2 = "computer";
		System.out.println(str2.substring(5));
		System.out.println(str2.substring(3, 6));
		String ssn = "950505-233355";
		System.out.println("주민등록번호 :" + ssn.substring(0,7) + "*******");

	}
}
