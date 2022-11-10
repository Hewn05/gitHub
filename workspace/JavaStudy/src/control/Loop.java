package control;

public class Loop {
	public static void main(String[] args) {

		int num = 1;
		int sum = 0;

		while (num <= 10) {
			sum += num++;
		}

		System.out.println(sum);

		num = 1;
		sum = 0;

		do {
			sum += num++;
		} while (num <= 10);

		System.out.println(sum);

		num = 1;
		sum = 0;

		for (; num <= 10; num++) {
			sum += num;
		}

		System.out.println(sum);

		for (int dan = 2; dan <= 9; dan++) {
			for (int t = 1; t <= 9; t++) {
				System.out.println(dan + " X " + t + " = " + dan * t);
			}
			System.out.println();
		}

		int dan = 2;
		while (dan <= 9) {
			int t = 1;
			while (t <= 9) {
				System.out.println(dan + " X " + t + " = " + dan * t++);
			}
			System.out.println();
			dan++;
		}

		for (int i = 0; i < 10; i++) {
			if (i == 4)
				break;
			System.out.println(i);
		}

		for (int i = 0; i < 10; i++) {
			if (i == 4)
				continue;
			System.out.println(i);
		}

		sum = 0;
		for (int i = 0; i <= 100; i++) {
			if ((i % 2) == 0)
				continue;
			sum += i;
		}
		System.out.println(sum);

		int total = 0;
		for (int i = 0; i < 100; i++) {
			total += i;

			if (total > 100) {
				System.out.println(total + " " + i);
				break;
			}
		}
		
		int sum1 = 0;
		int num1 = 1;
		while(sum1 < 100) {
			sum1 += num1;
			if(sum1 > 100)
				break;
			num1++;
		}
		System.out.println(sum1 + " " + num1);
		
		
	}
}
