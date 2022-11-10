package collectionFramework;

class Parents<T> {
	private T t;
	public T getT() {
		return t;
	}
	public void setT(T t) {
		this.t = t;
	}	
}

class FirstChild<T> extends Parents<T>{
	
}

class SecondChild<T,V> extends Parents<T> {
	private V v;
	public V getV() {
		return v;
	}
	public void setV(V v) {
		this.v = v;
	}
}

public class InheritanceGeneric {
	public static void main(String[] args) {
		Parents<String> parents = new Parents<>();
		parents.setT("Parents 제너릭 클래스");
		System.out.println(parents.getT());
		
		FirstChild<String> fchild = new FirstChild<>();
		fchild.setT("Firstchild 제너릭 상속받은 제너릭 클래스");
		System.out.println(fchild.getT());
		
		SecondChild<String, Double> schild = new SecondChild<>();
		schild.setT("SecondChild 제너릭 상속에 제너릭 추가한 클래스");
		schild.setV(3.15);
		System.out.printf("%s:%.2f",schild.getT(),schild.getV());	
		
		Sup s = new Sup();
		s.<Integer>testMethod(10);
		s.testMethod(10);
		
		Under un = new Under();
		un.testMethod(5.8);	
		
	}
}

class Sup{
	<T extends Number> void testMethod(T t) {
		System.out.println(t);
	}
}

class Under extends Sup{
	
}










