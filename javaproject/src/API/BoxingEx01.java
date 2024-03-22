package API;

public class BoxingEx01 {

	public static void main(String[] args) {
		int num1 = 10;
		System.out.println(num1);
		//박싱(Boxing)
		Integer num2 = 20;
		System.out.println(num2.intValue());
		//언박싱(UnBoxing)
		int value = num2;
		int num3 = 50;
		int num4 = 50;
		System.out.println(num3 ==num4);
		Integer num5 = new Integer(50);
		Integer num6 = new Integer(50);
		System.out.println(num5.equals(num6));

	}

}
