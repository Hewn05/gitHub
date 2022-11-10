package recur;

public class Recursive {
	public static void main(String[] args) {
		System.out.println(fibonacci(8));
		System.out.println(factorial(8));
	}

	public static long fibonacci(long n) {
		if (n <= 2) {
			return 1;
		}
		return fibonacci(n - 1) + fibonacci(n - 2);
	}

	public static long factorial(long n) {
		if (n <= 1) {
			return 1;
		}
		return factorial(n - 1) * n;
	}
	
}
