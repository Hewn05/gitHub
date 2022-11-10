package abstractPrac;

public class CarTest {

	public static void main(String[] args) {
		Car ai = new AICar();
		Car man = new ManualCar();
		
		ai.run();
		man.run();
	}

}
