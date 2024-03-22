package reference;

public class ArrayEx08 {

	public static void main(String[] args) {
		int[][] nums = {{78, 96, 80, 70, 85}, {50, 80, 70}};
		int sum;
		double avg;
		for(int i = 0; i < nums.length; i++) {//행의 개수(2행)
			sum = 0;
			avg = 0.0;
			for(int j = 0; j < nums[i].length; j++) {
				sum += nums[i][j];
			}
			avg = (double)sum / nums[i].length;
			System.out.println((i + 1) + "반 학생들의 총점=" + sum);
			System.out.println((i + 1) + "반 학생들의 평균=" + avg);

		}
	}
}
