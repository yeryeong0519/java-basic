package API;

import java.text.DecimalFormat;

public class DecimalFormatEx01 {

	public static void main(String[] args) {
		int price = 1560000;
		DecimalFormat df;
		df = new DecimalFormat("판매가격 = #,###원");
		System.out.println(df.format(price));
		double num = 51264.3234;
		df = new DecimalFormat("#,###.00");
		System.out.println(df.format(num));
	}
}
