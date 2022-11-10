package cooperation;

public class Subway extends Trans {
	private int lineNumber;

	public Subway(int lineNumber) {
		this.lineNumber = lineNumber;
	}

	public void showInfo() {
		System.out.println("=============================");
		System.out.println(lineNumber + "번 Subway");
		System.out.println("탑승객 수 : " + passengerCount);
		System.out.println("총 수익 : " + income);
		System.out.println("=============================");
	}
}
