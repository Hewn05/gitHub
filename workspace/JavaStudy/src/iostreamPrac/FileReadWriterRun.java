package iostreamPrac;

import java.io.*;

public class FileReadWriterRun {
	public static void main(String[] args) {
		File file = new File("src\\iostreamPrac\\files\\FileReadWriter.txt");

		try (Writer writer = new FileWriter(file); Reader reader = new FileReader(file);) {
			writer.write("Paik's Coffee\n".toCharArray());
			writer.write(123);
			writer.write("집에 가고싶다", 2, 3);
			writer.flush();

			int data;
			while ((data = reader.read()) != -1) {
				System.out.println((char) data);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
