package inheritance;

class Animal{
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}	
	
	void sleep() {
		System.out.println("zzzZZZ");
	}
	
}

class Human extends Animal{
	void sleep() {
		System.out.println("쿨쿨쿨");
	}
}

class Dog extends Animal {
	void sleep() {		
		System.out.println("그르렁");
	}
}

class Cat extends Animal{
	void sleep() {
		System.out.println(name + "\t갸르릉");
	}
}

class PetDog extends Dog{
	void sleep() {
		System.out.println(name + "\t집에서 드르렁");
	}
	
	void sleep(int hour) {
		System.out.println(name + "\t" + hour + "\t집에서 드르렁");	
	}
}


public class AnimalRun {

	public static void main(String[] args) {
		PetDog pDog = new PetDog();
		pDog.setName("해피");
		pDog.sleep(5);		

		Cat c = new Cat();
		c.setName("야옹이");
		c.sleep();
	
	}

}
