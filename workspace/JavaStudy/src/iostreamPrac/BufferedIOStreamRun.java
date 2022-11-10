package iostreamPrac;

import java.io.*;

public class BufferedIOStreamRun {
	public static void main(String[] args) {
		File file = new File("src/ioStreamPrac/files/Bufferedfile.txt");
		File file2 = new File("src/ioStreamPrac/files/BufferedOutfile.txt");

		try (
				FileInputStream fis = new FileInputStream(file); 
				FileOutputStream fos = new FileOutputStream(file2);
				BufferedInputStream bis = new BufferedInputStream(fis);				
				BufferedOutputStream bos = new BufferedOutputStream(fos);
		) {
			int i;
			while((i=fis.read())!=-1){
				bos.write(i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
