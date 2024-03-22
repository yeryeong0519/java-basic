package reference;

public class ArrayEx02 {

	public static void main(String[] args) {
		int[] nums = {10, 20, 30, 40, 50};	//배열의 초기화
		int sum = 0;
		for(int i = 0; i < nums.length; i++) {
			sum += nums[i];	//sum = sum + nums[i]
		}
		System.out.println("총합=" + sum);
	}
}
