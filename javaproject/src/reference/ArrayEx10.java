package reference;

public class ArrayEx10 {

	public static void main(String[] args) {
		//배열에 값을 복사하는방법
		int[] num1 = {10, 20, 30};
		int[] num2 = new int[3];
		for(int i = 0; i < num2.length; i++) {
			num2[i] = num1[i];
		}
		for(int i = 0; i < num2.length; i++) {
			System.out.println(num2[i]);
		}
	}
}
