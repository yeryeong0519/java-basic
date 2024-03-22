package statment;

public class DoWhileEx01 {

	public static void main(String[] args) {
		
		// While문**
		// while(조건){
		// 반복내용;
		// }
		
		// DoWhile문** 조건이 만족하지 않더라도 한 번 이라도 수행하고 싶을 때 
		// Do{
		//}while

		int i = 1;
		int sum = 0;
		do {
			sum += i;
			i++;

		} while (i <= 100);
		System.out.println("1부터 100까지의 합");

	}

}
