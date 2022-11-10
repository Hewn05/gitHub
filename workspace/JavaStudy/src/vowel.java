import java.util.Scanner;

public class vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String in;
		int con = 0;
		int vow = 0;
		System.out.print("글자입력:");
		Scanner sc = new Scanner(System.in);
		in = sc.nextLine();
		String check = in.toLowerCase();
		for (int i = 0; i < check.length(); i++) {
			char ch = check.charAt(i);
			if (ch== ' ')
				continue;
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vow++;
			} else {
				con++;
			}
		}
		System.out.println(con + "/////" + vow);
		sc.close();
	}

}
