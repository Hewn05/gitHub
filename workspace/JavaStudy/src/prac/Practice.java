package prac;

public class Practice {

	public static void main(String[] args) {

		int score = 72;
		if (score < 90 && score >= 80) {
			System.out.println("B학점");
		} else if (score >= 90) {
			System.out.println("A학점");
		} else if (score < 80 && score >= 70) {
			System.out.println("C학점");
		} else
			System.out.println("F학점");

		switch (score / 10 * 10) {
		case 100:
		case 90:
			System.out.println("A학점");
			break;
		case 80:
			System.out.println("B학점");
			break;
		case 70:
			System.out.println("C학점");
			break;
		default:
			System.out.println("F학점");
			break;
		}

		for (int i = 0;; i++) {
			if (i > 10)
				break;
			if ((i % 2) == 1)
				continue;

			System.out.println(i);
		}

		int ii = 10;
		while (ii > 0) {
			System.out.println(ii);
			ii -= 2;
		}

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 5; j++) {
				if (i == 3 && j == 2) {
					i = 10;
//					break;
				}
			}
		}

		int lines = 4;
		if (lines % 2 == 0)
			lines += 1;
		int space = lines / 2;
		int star = 1;
		for (int i = 1; i <= lines; i++) {
			for (int j = 0; j < space; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < star; k++) {
				System.out.print("*");
			}
			if (i < lines / 2 + 1) {
				space--;
				star += 2;
			} else {
				space++;
				star -= 2;
			}
			System.out.println();
		}

		int num1 = 45, num2 = 100;

		if (num1 > num2) {
			System.out.println(num1);
		} else {
			System.out.println(num2);
		}
		
		System.out.println(Math.max(num1, num2));

		int num3 = -23;
		int num = num3;

		if (num == 0) {
			System.out.println("0입니다.");
		} else if (num > 0) {
			if (num % 2 == 0)
				System.out.println("양수이면서 짝수입니다.");
			if (num % 2 == 1)
				System.out.println("양수이면서 홀수입니다.");
		} else if (num < 0) {			
			if (num % 2 == 0)
				System.out.println("음수이면서 짝수입니다.");
			if (num % 2 == -1)
				System.out.println("음수이면서 홀수입니다.");
		}
		
		

	}
}
