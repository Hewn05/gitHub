package lamdaPrac;

class NormalClass1 implements NormalInterface {

	public void normalMethod() {
		System.out.println("함수형 인터페이스 구현 객체 메소드");
	}
}

public class LamdaRun1 {

	public static void main(String[] args) {

		NormalClass1 nc1 = new NormalClass1();
		nc1.normalMethod();

		NormalInterface nc2 = new NormalInterface() {
			@Override
			public void normalMethod() {
				System.out.println("함수형 인터페이스 익명이너클래스 구현 메소드");
			}
		};
		nc2.normalMethod();

		NormalInterface nc3 = () -> {
			System.out.println("함수형 인터페이스 람다식 구현 메소드");
		};
		nc3.normalMethod();
	}

}
