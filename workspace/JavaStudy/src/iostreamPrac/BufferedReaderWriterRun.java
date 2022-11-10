package iostreamPrac;

import java.io.*;

public class BufferedReaderWriterRun {

	public static void main(String[] args) {
		File file = new File("src\\iostreamPrac\\files\\FileReadWriter.txt");

		try (Writer writer = new FileWriter(file);
				Reader reader = new FileReader(file);
				BufferedWriter bw = new BufferedWriter(writer);
				BufferedReader br = new BufferedReader(reader);
		) {
			bw.write("Paik's Coffee\n".toCharArray());
			bw.write(124);
			bw.write("집에 가고싶다", 2, 3);
			bw.flush();

			String data;
			while ((data = br.readLine()) != null) {
				System.out.println(data);
			}
		} catch (IOException e) {e.printStackTrace();}

	}

}
