package statment;

public class WhileEx02 {

	public static void main(String[] args) {
		//sum of 0 ~ 100
		int i = 1, sum = 0;
		
		while(i <= 100) {
			sum += i;
			i++;
		}
		System.out.println(sum);

	}
}