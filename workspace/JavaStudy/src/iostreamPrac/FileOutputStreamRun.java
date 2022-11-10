package iostreamPrac;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamRun {

	public static void main(String[] args) {
		byte[] barr2 = new byte[26];
		byte data3 = 65;
		for (int i = 0; i < barr2.length; i++) {
			barr2[i] = data3++;
		}

		try (FileOutputStream fos = new FileOutputStream("src\\iostreamPrac\\files\\TestfileOut.txt")) {
			fos.write(barr2);
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("FIN");

	}

}
