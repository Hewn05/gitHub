package collectionFramework;

interface TestInterface{
	public abstract void test();
	
}

class SubClass implements TestInterface{
	public void test() {
		System.out.println("subclass test() run");
	}
}

class NormalClass{
	public <T extends TestInterface> void genMethod(T t) {
		t.test();		
	}
}

public class LimitedTypeGenericClass2 {

	public static void main(String[] args) {
		NormalClass nc = new NormalClass();
		
		SubClass sc = new SubClass();					// 상속받은클래스로 쓰기
		nc.<SubClass>genMethod(sc);
		
		nc.genMethod(new TestInterface() {				// 익명클래스로 쓰기
			@Override
			public void test() {
				System.out.println("익명클래스 test() run");
			}
		});
		

	}

}
