package inheritance;

class Parent{
	int age;
	String name = "Parent";

	public Parent() {
		System.out.println("Parent()");
	}

	public Parent(int age, String name) {
		this.age = age;
		this.name = name;
		System.out.println("Parent(param)");
	}

	public void showInfo() {
		System.out.println("이름 : " + name + "/나이 : " + age);
	}
}

class Child extends Parent {
	String name = "Child";

	public Child() {
		System.out.println("Child()");
	}

	public Child(int age, String name) {
		this.age= age;
		this.name = name;
		
		//super(age, name);
		System.out.println("Child(param)");
	}

//	@Override
//	public void showInfo() {
//		System.out.println("이름 : " + name + "/나이 : " + age);
//	}
	
}

public class Inheritance {

	public static void main(String[] args) {
		Child c = new Child(10, "규현");
		c.showInfo();

	}

}
