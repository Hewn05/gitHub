package collectionFramework;

class GrandParent {
}

class Parent extends GrandParent {
}

class Me extends Parent {
}

class Family<T extends Parent> {
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
}

public class LimitedType {

	public static void main(String[] args) {
		Family f1 = new Family();
//		Family<GrandParent> f2 = new Family();
		Family<Parent> f3 = new Family();
		Family<Me> f4 = new Family();
//		Family<String> f5 = new Family();
		f3.setT(new Parent());
		f3.setT(new Me());
		
		f4.setT(new Me());
//		f4.setT(null);
		
//		f1.setT(new GrandParent());		
		f1.setT(new Parent());		
		f1.setT(new Me());		
	}
}