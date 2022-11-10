import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 0;
		int c = 0;
		int num = 0;

		System.out.print("세자리 정수를 입력하세요 : ");
		num = sc.nextInt();
		if(!checkNum(num)) {
			while(!checkNum(num)){
				System.out.print("잘못된 입력값입니다.\n세자리 정수를 입력하세요 : ");
				num = sc.nextInt();
			}
		}
		a = num / 100;
		b = num % 100 / 10;
		c = num % 10;

		System.out.println(a + b + c);
	}

	public static boolean checkNum(int num) {
		if (num >= 100 && num < 1000)
			return true;
		else
			return false;
	}

}
