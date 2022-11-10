package road;

import factory.Car;

public class Taxi extends Car {
	public static void main(String[] args) {
		Taxi t = new Taxi();
//		t.carNum;
//		int speed = t.speed;
		t.getSpeed();
		t.getCarNum();
	}
}
