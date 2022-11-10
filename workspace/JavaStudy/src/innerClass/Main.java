package innerClass;

abstract class AbstractClass {
	int a = 10, b = 20;

	abstract int sum(int a);
}

class NormalClass {
	int a = 10, b = 20;

	int sum(int c) {
		return a + b + c;
	}
}

public class Main {

	public static void main(String[] args) {
		AbstractClass abs = new AbstractClass() {
			int c = 30;

			int sum(int a) {
				return a + b + c + a;
			}
		};
		System.out.println(abs.sum(15));

		NormalClass nor = new NormalClass() {
			int d = 40;

			int sum(int c) {
				return a + b + c + d;
			}
		};
		System.out.println(nor.sum(30));
	
		System.out.println(new NormalClass() {
			int d = 100;
			int sum(int c) {
				return c+d;
			}
		}.sum(100));
	}
}

