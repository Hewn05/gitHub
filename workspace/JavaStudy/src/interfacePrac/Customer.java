package interfacePrac;

public class Customer implements Buy, Sell{

	public void sell() {
		System.out.println("고객 판매");
	}

	public void buy() {
		System.out.println("고객 구입");
	}	
	
	public void order() {
		System.out.println("고객 주문");
	}
		
	public void comp() {
		System.out.println("고객 불만");
	}
	
}
