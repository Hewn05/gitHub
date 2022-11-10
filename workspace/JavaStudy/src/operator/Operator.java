package operator;

public class Operator {
	
	public static void main(String[] args) {
		
		int num1 = 8, num2 = 4;
		
		System.out.println("+ 연산자:" + (num1 + num2));
		System.out.println("- 연산자:" + (num1 - num2));
		System.out.println("* 연산자:" + (num1 * num2));
		System.out.println("/ 연산자:" + (num1 / num2));
		System.out.println("% 연산자:" + (num1 % num2));
		
		int num3 = 7, num4 = 7, num5 = 7;
		
		num3 = num3 - 3;
		num4 -= 3;				
		num5 =- 3;
		
		System.out.println(num3 + " " + num4 + " " + num5);
		
		int y = 0, x = 10;
		
		y=x-- + 5 + --x;
		System.out.println(y + " " + x);

		System.out.println(num3 == num4);
		System.out.println(num3 != num5);
		System.out.println(x > y);
		System.out.println(x <= y);
		
		char ch1 = 'a';
		char ch2 = 'b';
	
		System.out.println(ch1 > ch2);
		
		boolean bool1 = true, bool2 = false;
		System.out.println(bool1 + " " + bool2);
		
		char char1 = 'v', char2 = 'B';
		boolean result1, result2;
		
		result1 = (char1 > 'c') && (char2 < 'z');
		result2 = (char1 < 'A') || (char2 > 'Z');

		System.out.println("&&result:" + result1);
		System.out.println("||result:" + result2);
		System.out.println("!result:" + !result1);
		
		System.out.println(10&7);
		System.out.println(10|7);
		System.out.println(10^7);
		System.out.println(10<<1);
		System.out.println(10>>1);
		System.out.println(7>>1);
		
		
	}
}
