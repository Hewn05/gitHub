package innerClass;

public class Main2 {

	public static void main(String[] args) {
		Calculator c1 = new MyMath();
		double res = c1.oper(3.0, 7.0);
		System.out.println(res);

		Calculator c2 = new Calculator() {
			public double oper(double x, double y) {
				return x * y;
			}
		};
		System.out.println(c2.oper(3.0, 7.0));

		System.out.println(new Calculator() {
			public double oper(double x, double y) {
				return Math.pow(x, y);
			}
		}.oper(3.0, 3.0));
	}

}

interface Calculator {
	public abstract double oper(double x, double y);
}

class MyMath implements Calculator {
	public double oper(double x, double y) {
		return x + y;
	}
}
