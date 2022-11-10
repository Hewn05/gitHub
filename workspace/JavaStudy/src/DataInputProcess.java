import java.io.*;
import java.util.Scanner;

public class DataInputProcess {

	public static void main(String[] args) throws IOException {
//		int a = System.in.read();
//		System.out.println("키보드인풋 값 : " + a);
//		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		String data = br.readLine();
//		System.out.printf("키보드 인풋 값: %s %n",data);
		
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		
		sc.close();
		System.out.printf("키보드 인풋 값: %d",i);
	}
}
