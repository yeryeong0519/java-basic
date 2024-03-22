package operator;

public class OperatorEx09 {

	public static void main(String[] args) {
		
		//비트연산자
		
		//45 => ‭0010 1101‬ 25 => ‭0001 1001‬
		System.out.println(45 & 25);	//AND 모두 1이면 1, 나머지는 0
		System.out.println(45 | 25);	//OR 한 쪽이라도 1이면 1, 나머지는 0
		System.out.println(45 ^ 25);	//XOR 서로 다르면 1, 같으면 0
		
		//비트 이동 연산자
		
		//13 => 0000 1101
		int num = 13;
		System.out.println(num << 2);	//왼쪽으로 두 비트 이동 0000 1101 => ‭0011 0100
		int num2 = 8;
		System.out.println(num2 >> 2);	//오른쪽으로 두 비트 이동 0000 1000 => 0000 0010‬
		
		
	}
}


 