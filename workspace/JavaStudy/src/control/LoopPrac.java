package control;

import java.util.Scanner;

public class LoopPrac {

	public static void main(String[] args) {
		System.out.println(args[0]);
		Scanner scan = new Scanner(System.in);
		System.out.print("입력 : ");
		int line = scan.nextInt();
		System.out.println(line);

		for (int i = 0; i < line; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}

		for (int i = 0; i < line; i++) {
			for (int j = 0; j < line - i; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}

		for (int i = 0; i < line; i++) {
			for (int k = 1; k < line - i; k++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int dan = 2; dan <= 9; dan++) {
			System.out.println(dan);
			for (int t = 1; t <= 9; t++) {
				if (dan == 5)
					continue;
				System.out.println(dan + " X " + t + " = " + dan * t);
			}
			System.out.println();
		}

	}

}
