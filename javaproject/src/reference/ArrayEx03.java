package reference;

public class ArrayEx03 {

	public static void main(String[] args) {
		int[] nums = {45, 22, 78, 36, 41, 96, 32, 43, 10, 15};
		int sum = 0;
		for(int i = 0; i <nums.length; i++) {	//nums.length 배열의 요소 개수를 세지않아도된다.
			if((nums[i] % 2) == 0) {
				sum += nums[i];
			}
		}
		System.out.println("총합=" + sum);

	}
}
