package iostreamPrac;

import java.io.*;

public class DataInputOutputStreamRun {

	public static void main(String[] args) throws IOException, IOException {
		File file = new File("src/iostreamPrac/files/file.txt");
		
		try (
		FileInputStream fis = new FileInputStream(file);
		FileOutputStream fos = new FileOutputStream(file);
		DataInputStream dis = new DataInputStream(fis);
		DataOutputStream dos = new DataOutputStream(fos);	){
		
		dos.writeInt(99);
		dos.writeDouble(11.12);
		dos.writeChar('A');
		dos.writeUTF("우리나라");
		dos.flush();
		
		System.out.println(dis.readInt());
		System.out.println(dis.readDouble());
		System.out.println(dis.readChar());
		System.out.println(dis.readChar());
		System.out.println(dis.readUTF());
		} catch(IOException e) {
			e.printStackTrace();	
		
		}
			
	}

}
