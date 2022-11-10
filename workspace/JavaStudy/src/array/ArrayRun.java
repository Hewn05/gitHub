package array;

public class ArrayRun {

	public static void main(String[] args) {
		int[] num1 = new int[10];
		int[] num2 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		System.out.println(num1.length);
		System.out.println(num2.length);
		System.out.println(num2[3]);
		num1[1] = 11;
		System.out.println(num1[1]);

		for (int i = 0; i < num1.length; i++) {
			System.out.print(num1[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < num2.length; i++) {
			System.out.print(num2[i] + " ");
		}
		System.out.println();

		String[] str = new String[5];
		System.out.println(str[2]);
		boolean[] bool = new boolean[5];
		System.out.println(bool[2]);

		char ch = 'A';
		ch = 65;
		System.out.println(ch);

		char[] alphabet = new char[26];
		for (int i = 0; i < 26; i++, ch++) {
			alphabet[i] = ch;
		}
		
		for(int i = 0;i<alphabet.length;i++) {
			System.out.print(alphabet[i] + " ");			
		}
		

	}
}
