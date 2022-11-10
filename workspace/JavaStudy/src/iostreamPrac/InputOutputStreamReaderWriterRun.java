package iostreamPrac;

import java.io.*;

public class InputOutputStreamReaderWriterRun {
	public static void main(String[] args) throws IOException {
		File file = new File("src\\iostreamPrac\\files\\FileReadWriter.txt");
		
		InputStream is = new FileInputStream(file);
		InputStreamReader isr = new InputStreamReader(is);
		OutputStream os = new FileOutputStream(file);
		OutputStreamWriter osw = new OutputStreamWriter(os);
		
		is.close();
		isr.close();
		os.close();
		osw.close();
		
		OutputStreamWriter osw2 = new OutputStreamWriter(System.out,"UTF-8");
		osw2.write("콘솔출력을위한입력");
		osw2.flush();
		osw2.close();
	}
}
