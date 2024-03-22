package reference;

public class ArrayEx01 {

	public static void main(String[] args) {
//		int score1 = 96;
//		int score2 = 70;
//		int score3 = 82;
//		int sum = score1 + score2 + score3;
//		double avg= sum / 3;

		int[] nums = new int[3];// int[] nums 도 가능 .. nums 라는 배열 생성. 4바이트 정수값 담을 수 있는 '기억장소 3개' 생성
		nums[0] = 10;
		nums[1] = 20;
		nums[2] = 30;
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i]; // sum = sum + nums[i];
		}
		System.out.println("총점 =" + sum);
	}
}
