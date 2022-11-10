package iostreamPrac;

import java.io.*;

public class PrintStreamWriterRun {
	public static void main(String[] args) {
		File psf = new File("src\\iostreamPrac\\files\\PrintStream.txt");
		File pwf = new File("src\\iostreamPrac\\files\\PrintWriter.txt");
		
		try(
//			PrintStream ps = new PrintStream(psf);
			OutputStream os = new FileOutputStream(psf);
			PrintStream ps = new PrintStream(os);
			
			PrintStream ps2 = new PrintStream(System.out);
		){
			ps.println(10.9);
			ps.print(10+"년"+9+"개월\n");
			ps.printf("%s", "우리나라");
			ps.println();
			
			ps2.println(10.9);
			ps2.print(10+"년"+9+"개월\n");
			ps2.printf("%s", "우리나라");
			ps2.println();
		
			
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		try(
//			PrintWriter pw = new PrintWriter(pwf);
			
			OutputStream os = new FileOutputStream(pwf);
			PrintWriter pw = new PrintWriter(os);
			
			PrintWriter pw2 = new PrintWriter(new FileWriter(pwf));
				
			PrintWriter pw3 = new PrintWriter(System.out);
		){
			pw.println(10.9);
			pw.print(10+"년"+9+"개월\n");
			pw.printf("%s", "우리나라");
			pw.println();
			
			pw2.println(10.9);
			pw2.print(10+"년"+9+"개월\n");
			pw2.printf("%s", "우리나라");
			pw2.println();
		}catch(IOException e) {e.printStackTrace();}
	}
}
