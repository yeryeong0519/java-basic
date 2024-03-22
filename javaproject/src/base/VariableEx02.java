package base;

public class VariableEx02 {

	public static void main(String[] args) {
		//byte, short, int, long .. byte형은 127까지
		int num = 457762;
		//byte rnum = (byte)num;	
		System.out.println(num);
		
		double dnum = 45.33;
		int num2 = (int)dnum; //캐스트 형변환
		System.out.println(num2);
	}

}
