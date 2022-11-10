
public class Pay {

	public static void printPay(double pay, int hours) {
		if (pay < 8) {
			System.out.println("ERROR: 최저시급 불이행");
			return;
		}
		if (hours > 60) {
			System.out.println("ERROR: 제한 근무시간 초과.");
			return;
		}

		if (hours > 40)
			System.out.println("$" + ((40 * pay) + ((hours - 40) * pay * 1.5)));
		else
			System.out.println("$" + (pay * hours));

	}

	public static void main(String[] args) {
		printPay(7.50, 35);
		printPay(8.20, 47);
		printPay(10.00, 73);
		printPay(10.0, 50);
	}

}
