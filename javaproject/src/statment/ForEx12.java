package statment;

public class ForEx12 {

	public static void main(String[] args) {
		// 56족.. 영수증엔 총 17마리.. 돼지 몇 마리, 오리 몇 마리
		int pig, duck, sum = 0;

		for (pig = 1; pig <= 17; pig++) {
			for (duck = 1; duck <= 17; duck++) {
				sum = pig * 4 + duck * 2;
				if(sum == 56 && pig + duck == 17) {
					System.out.println("돼지마리수는" +pig+ ", 오리마리수는" +duck);
				}
			}
		}

		// 2kg 3, 3kg 3.. 배가 견딜 수 있는 무게는 100kg . 사람의 무게는 70kg . 가지고 갈 수 있는 보물  무게 30kg . 2kg 와 3kg 몇 개씩 가져 갈 수 있는지
	
		int totalWeight;
		
		for(int a = 1; a <= 30; a++) {	//2kg
			for(int b = 1; b <= 30; b++) {	//3kg
				totalWeight = a * 2 + b * 3;
				if(totalWeight == 30) {
					System.out.println("2kg=" +a+ " , 3kg=" +b);
				}
				
			}
		}
	}
}
