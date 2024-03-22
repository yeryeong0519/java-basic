package object_class;

public class Calculator {
	
	// 더하기메소드
	
	int sum(int... nums) { // ...은 개수를 알 수 없다는 의미. 배열
		int hap = 0;
		for (int i = 0; i < nums.length; i++) {
			hap += nums[i];
		}
		return hap;
	}
}
