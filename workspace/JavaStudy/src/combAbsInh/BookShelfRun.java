package combAbsInh;

public class BookShelfRun {
	
	public static void main(String[] args) {
		Queue sQueue = new BookShelf();
		Shelf sShelf = new BookShelf();
		BookShelf b = new BookShelf();
		b.enQueue("adf");
		b.deQueue2();
		
		
		sQueue.enQueue("태백산맥1");
		sQueue.enQueue("태백산맥2");
		sQueue.enQueue("태백산맥3");
		sQueue.enQueue("태백산맥4");
		sQueue.enQueue("태백산맥5");

//		sShelf.enQueue();
		
		System.out.println(sQueue.deQueue());
		System.out.println(sQueue.getSize());
		System.out.println(sQueue.deQueue());
		System.out.println(sQueue.getSize());
	}
}
