package interfacePrac;

public interface Sell {
	void sell();
	
	default void order() {
		System.out.println("판매 완료");
	}
}
