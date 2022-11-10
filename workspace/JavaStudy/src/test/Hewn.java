package test;

import java.util.ArrayList;
import java.util.Scanner;

public class Hewn {
	public static void main(String[] args) {
		/*
		 * 일단 수를 받고 각각 약수 만들고 약수만드는 함수? 최대공약수 구하고 최소공배수 구하고 출력
		 */

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		boolean br = true;

		if (a <= 1 || b <= 1)
			return;
		ArrayList<Integer> as = div(a);
		ArrayList<Integer> bs = div(b);
		ArrayList<Integer> ss = new ArrayList();

		int max = 0;
		for (int i = 0; i < as.size(); i++)
			for (int j = 0; j < bs.size(); j++)
				if (as.get(i) == bs.get(j))
					if (max < as.get(i))
						max = as.get(i);
		int min = 0;
		while (br) {
			for (int i = 2; true; i++) {
				for (int j = 1; j < i; j++) {
					for (int k = 1; k < i; k++) {
						if (a * i == j * k) {
							min = a * i;
							br = false;
						}
					}
				}
			}
		}
		System.out.println(max + "\n" + min);
	}

	public static ArrayList<Integer> div(int a) {
		ArrayList<Integer> result = new ArrayList<Integer>();

		for (int i = 2; i < a; i++)
			if (a % i == 0)
				if (!result.contains(i))
					result.add(i);

		return result;
	}
}