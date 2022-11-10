package throwable;

import java.io.File;
import java.util.Scanner;

public class TryWithResources {

	public static void main(String[] args) {
		Scanner sc = null;
		try {
			sc = new Scanner(new File("D:\\workspace\\JavaStudy\\src\\throwAble\\input.txt"));
			System.out.println(sc.nextLine());
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(sc != null) {
				sc.close();
			}
		}
	}
}
