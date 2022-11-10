package cooperation;

public class Passenger {
	String passengerName;
	int money;

	Passenger(String passengerName, int money) {
		this.passengerName = passengerName;
		this.money = money;
	}

	public void takeBus(Bus bus) {
		bus.take(1000);
		money -= 1000;
	}

	public void takeSubway(Subway subway) {
		subway.take(1000);
		money -= 1000;
	}

	public void takeTrans(Trans trans, int money) {
		trans.take(money);
		this.money -= money;
	}

	public void showInfo() {
		System.out.println("=============================");
		System.out.println("승객 : " + passengerName);
		System.out.println("소지금 : " + money);
		System.out.println("=============================");
	}
}
