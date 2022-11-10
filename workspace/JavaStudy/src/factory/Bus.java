package factory;

public class Bus extends Car{
	public static void main(String[] args) {
		Bus b = new Bus();
		
		int speed = b.speed;
		b.getSpeed();
		b.getCarNum();
	}

}
