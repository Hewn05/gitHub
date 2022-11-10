package interfacePrac;

public interface Calc {

	double PI = 3.14;
	int ERROR = -9999;

	int add(int num1, int num2);
	int sub(int num1, int num2);
	int times(int num1, int num2);
	int div(int num1, int num2);
			
	default void desc() {
		privateMethod();
		privateStaticMethod();
		System.out.println("계산기 구현");
	}
	
	
	static int total(int[] arr) {
		int total = 0;
		for(int i : arr) {
			total += i;
		}
		privateStaticMethod();
		return total;
	}
	
	private void privateMethod() {
		System.out.println("privateMethod");
	}
	private static void privateStaticMethod() {
		System.out.println("privateStaticMethod");
	}
	
}
