package abstractPrac;

public class ManualCar extends Car {

	@Override
	public void drive() {
		System.out.println("사람이 운전");
	}

	@Override
	public void stop() {
		System.out.println("사람이 브레이크로 멈춤");
	}

	@Override
	public void turnOn() {
		System.out.println("시동켜기");
	}

	@Override
	public void turnOff() {
		System.out.println("시동끄기");
	}

}
