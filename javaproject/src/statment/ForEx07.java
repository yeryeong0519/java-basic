package statment;

public class ForEx07 {

	public static void main(String[] args) {
		//1부터 100까지 더하면서 3500이 넘으려면 몇까지 더하면 될까요
		//정답 : 77
		int sum = 0;
		int i = 0;
		for(i = 1; i <= 100; i++) {	//break 는 반복문들과 switch문에 사용됨
			sum += i;
			if(sum > 3500) {
			//if(sum > 3500)break;로 해도 무관. 조건이 맞으면 내용 수행 아니면 통과. 가끔 이 형식으로도 쓰임
				break;
			}
		}	//for end 
		System.out.println((i-1) + "까지 더하면 " + (sum - i) + "이 되며 따라서 3500이 넘으려면 " + i + "까지 더하면 됨");
	}
}
