package reference;

public class ArrayEx11 {

	public static void main(String[] args) {
		//배열에 값을 복사하는방법2
		int[] num1 = {10, 20, 30};
		int[] num2 = new int[5];
		System.arraycopy(num1, 0, num2, 0, num1.length);
		for(int i = 0; i < num2.length; i++) {
			System.out.println(num2[i]);
		}
	}
}
