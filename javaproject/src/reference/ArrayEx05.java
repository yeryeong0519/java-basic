package reference;

public class ArrayEx05 {

	public static void main(String[] args) {
		// sort 알고리즘 : 무질서한 자료를 원하는 순서대로 재배열하는것
		// 오름차순 정렬(ascending sort): 작은것에서 큰것
		// 내림차순 정렬(descending sort): 큰것에서 작은것

		int[] nums = { 50, 24, 5, 82, 67 };
		int temp; // 소트 알고리즘은 임시 기억장소가 필요

		// ***소트 전 자료 출력
		System.out.println("**소트 전 자료 출력 **");
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		// ***소트 알고리즘 구현
		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] > nums[j]) {
					{
						temp = nums[i];
						nums[i] = nums[j];
						nums[j] = temp;
					}
				}
			}
		}
		// ***소트 후 자료 출력
		System.out.println("\n\n**소트 후 자료 출력 **");
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
	}
}
