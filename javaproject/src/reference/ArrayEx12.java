package reference;

public class ArrayEx12 {

	public static void main(String[] args) {
		// 총점 = ??? 평균 = ???
		int[] scores = { 78, 96, 80, 75, 68, 70, 88 };
		int sum = 0;
		double avg = 0.0;	//아님 밑에서 cast(double)
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];	// scores의 i번째 까지의 총합
			avg = sum / scores.length;	// 총합 / scores 변수 길이 
		}
		System.out.println("총점 = " + sum +"점\n평균 = "+ avg + "점");
		
	}
}