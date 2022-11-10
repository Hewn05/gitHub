package lamdaPrac;

public class FunctionalInterfaceLamdaRun {

	public static void main(String[] args) {
		NormalInterface1 ixox = new NormalInterface1() {

			@Override
			public void normalMethod1() {
				System.out.println("i x o x 메소드");

			}
		};
		ixox.normalMethod1();

		ixox = () -> System.out.println("i x o x 메소드 람다");
		ixox.normalMethod1();

		NormalInterface2 ixoo = new NormalInterface2() {

			@Override
			public int normalMethod2() {
				System.out.println("i x o o 메소드");
				return 100;
			}
		};
		System.out.println(ixoo.normalMethod2());

		ixoo = () -> 100;

		System.out.println(ixoo.normalMethod2());

		NormalInterface3 ioox = new NormalInterface3() {
			@Override
			public void normalMethod3(int i) {
				System.out.println("i o o x 메소드 입력값:" + i);
			}
		};
		ioox.normalMethod3(10);

		ioox = i -> System.out.println("io ox 메소드 입력값:" + i);
		ioox.normalMethod3(10);

		NormalInterface4 iooo = new NormalInterface4() {

			@Override
			public double normalMethod4(int i, double d) {
				System.out.println("i o o o 메소드");
				return i * d;
			}
		};
		System.out.println(iooo.normalMethod4(9, 3.5));

		iooo = (i, d) -> i * d;
		System.out.println(iooo.normalMethod4(9, 3.5));

	}
}
