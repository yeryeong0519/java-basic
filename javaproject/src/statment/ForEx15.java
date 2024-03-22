package statment;

public class ForEx15 {

	public static void main(String[] args) {
		Exit:for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <=5; j++) {
				System.out.println(i + "--" + j);
				if(i == 3 && j == 3) {
					break;	//Exit으로 탈출하게되면 아예 바깥쪽 즉 14번째 줄로 빠져나감
				}
			}
		}
			System.out.println("탈출성공");
	}
}
