package abstractPrac;

public abstract class Computer {
	
	Computer(){
		System.out.println("computer");
	}
	
	public void display() {};
	
//	public void test(); 

	public abstract void typing();
	
	public void turnOn() {
		System.out.println("전원켜기");
	}
	
	public void turnOff() {
		System.out.println("전원끄기");
	}
}
