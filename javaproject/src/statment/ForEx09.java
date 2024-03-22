package statment;

public class ForEx09 {

	public static void main(String[] args) {
		for(int a = 1; a <= 3; a++) {
			for(int b = 1; b <= 5; b++) {
				System.out.println(a + "-" + b);
				
			}
		}
		System.out.println("끝");
		
		for(int dan = 2; dan <= 9; dan++) {
			System.out.println("♬ " + dan + "단 ♬ \n");
			for(int num = 1; num <= 9; num++) {
			
				System.out.println(dan + " x " + num + " = " + dan * num);
			}
			System.out.println("\n======================\n");
		}
	}
}
