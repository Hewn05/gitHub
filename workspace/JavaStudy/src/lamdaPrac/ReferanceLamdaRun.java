package lamdaPrac;

class NormalClass2 {
	void normalMethod() {
		System.out.println("일반메소드");
	}
	static void staticMethod() {
		System.out.println("정적메소드");
	}
}

interface IFforObject{
	void objectMethod(NCObj t,String k);
}

class NCObj {
	void printString(String str){
		System.out.println(str);
	}
}

public class ReferanceLamdaRun {

	public static void main(String[] args) {
		NormalInterface ni1 = new NormalInterface() {
			@Override
			public void normalMethod() {
				NormalClass2 nc2 = new NormalClass2();
				nc2.normalMethod();
			}
		};
		ni1.normalMethod();

		NormalInterface ni2 = () -> {
			NormalClass2 nc2 = new NormalClass2();
			nc2.normalMethod();
		};
		ni2.normalMethod();

		NormalClass2 nc3 = new NormalClass2();
		NormalInterface ni3 = nc3::normalMethod;
		ni3.normalMethod();

		NormalInterface3 ni31 = new NormalInterface3() {
			@Override
			public void normalMethod3(int i) {
				System.out.println(i);
			}
		};
		ni31.normalMethod3(33);
		ni31 = i -> System.out.println(i);
		ni31.normalMethod3(33);
		ni31 = System.out::println;
		ni31.normalMethod3(32);
		
		NormalInterface ni21 = new NormalInterface() {
			@Override
			public void normalMethod() {
				NormalClass2.staticMethod();
			}
		};
		ni21.normalMethod();
		ni21 = () -> NormalClass2.staticMethod();
		ni21.normalMethod();
		ni21 = NormalClass2::staticMethod;

		IFforObject iff = new IFforObject(){
			public void objectMethod(NCObj t, String k){
				t.printString(k);
			}
		};
		
		iff.objectMethod(new NCObj(), "아이고");
		
		iff = (NCObj t, String k) -> {t.printString(k);};
		iff = (t,k) -> t.printString(k);
		iff = NCObj::printString;
		iff.objectMethod(new NCObj(), "어이구");
	}

}
