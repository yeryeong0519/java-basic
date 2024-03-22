package statment;

public class ForEx13 {

	public static void main(String[] args) {
		// 56족.. 영수증엔 총 17마리.. 돼지 몇 마리, 오리 몇 마리
		int pig, duck, sum = 0;

		SGo: for (pig = 1; pig <= 17; pig++) {
			for (duck = 1; duck <= 17; duck++) {
				sum = pig * 4 + duck * 2;
				if (sum == 56 && pig + duck == 17) {
					System.out.println("돼지마리수는" + pig + ", 오리마리수는" + duck);
					break SGo;
				}
			}
		}

	}
}
