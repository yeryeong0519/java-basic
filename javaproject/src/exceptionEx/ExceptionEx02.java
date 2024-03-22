package exceptionEx;

public class ExceptionEx02 {

	public static void main(String[] args) {
		String[] str = { "100", "200", "150" };
		int sum = 0;
		try {
			for (int i = 0; i <= str.length; i++) {
				int value = Integer.parseInt(str[i]); // String 숫자를 int로 바꿔준다. 하지만 문자는 못 바꿈
				sum += value;						  // "100"이라는 문자를 숫자 100으로 바꿈
			}
			System.out.println("총합 =" + sum);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 인덱스를 초과했습니다.");
		} catch(NumberFormatException e) {
			System.out.println("문자데이터는 변활 할 수 없습니다.");
		} catch(Exception e) {
			System.out.println("에러발생(개발자에게 문의하세요(010 - 1111 - 2222)) - " + e.getMessage());
		}finally {
			System.out.println("무조건 실행");
		}
	}
}