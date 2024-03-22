package application;

import java.awt.Toolkit;

public class ThreadEx01 {

	public static void main(String[] args) {
		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {
				Toolkit tool = Toolkit.getDefaultToolkit();
				for (int i = 0; i < 5; i++) {
					tool.beep();	//비프음 발생
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
					}
				}
			}
		});
		thread.start();
		for (int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			}
		}
	}
}
