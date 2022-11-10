package throwable;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TryWithResources2 {

	public static void main(String[] args) {
		String path = "D:\\workspace\\JavaStudy\\src\\throwAble\\";
		try (Scanner sc = new Scanner(new File(path + "input.txt"));
				PrintWriter pw = new PrintWriter(new File(path + "output.txt"))) {
			String inputContent = sc.nextLine();
			System.out.println(inputContent);
			pw.write(inputContent);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}