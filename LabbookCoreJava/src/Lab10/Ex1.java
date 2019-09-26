package Lab10;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex1 extends Thread {

	FileInputStream fip;
	FileOutputStream fout;

	public Ex1(FileInputStream fip, FileOutputStream fout) {
		super();
		this.fip = fip;
		this.fout = fout;
	}

	public void run() {
		int a = 0;
		int count = 0;
		try {
			while (!((a = fip.read()) < 0)) {
				char c = (char) a;
				fout.write(c);
				count++;
				if (count == 10) {
					System.out.println("10 characters are copied");
					count = 0;
					Thread.sleep(5000);
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
