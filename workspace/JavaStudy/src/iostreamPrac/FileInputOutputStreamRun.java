package iostreamPrac;

import java.io.*;

public class FileInputOutputStreamRun {
	public static void main(String[] args) throws IOException {
		File file = new File("D:\\workspace\\JavaStudy\\src\\iostreamPrac\\files\\Testfile.txt");

		OutputStream os1 = new FileOutputStream(file);
		byte[] barr2 = "InputOutput practice".getBytes();
		os1.write(barr2);
		os1.write('\n');
		os1.flush();
		os1.close();

		InputStream is = null;
		InputStream is2 = null;

		is = new FileInputStream(file);

		int data;
		while ((data = is.read()) != -1) {
			System.out.println((char) data + " " + is.available());
		}

		is.close();

		is2 = new FileInputStream(file);
		byte[] barr = new byte[23];
		int data2;
		while ((data2 = is2.read(barr)) != -1) {
			for (int i = 0; i < data2; i++)
				System.out.print((char) barr[i]);
			System.out.println();
			for (int i = 0; i < data2; i++)
				System.out.print(barr[i] + " ");

			System.out.println(data2);
		}

		is2.close();

	}
}
