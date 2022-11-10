package interfacePrac;

public interface Buy {
	void buy();
	
	default void order() {
		System.out.println("주문 완료");
	}
}
