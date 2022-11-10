package cooperation;

public abstract class Trans {
	int income;
	int passengerCount;

	public Trans() {
		income = 0;
		passengerCount = 0;
	}

	public void takeTrans(Trans trans, int money) {
		trans.passengerCount++;
		trans.income += money;
	}

	public void take(int money) {
		income += money;
	}

	public abstract void showInfo();
}
