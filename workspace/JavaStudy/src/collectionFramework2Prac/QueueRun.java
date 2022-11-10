package collectionFramework2Prac;

import java.util.*;

public class QueueRun {

	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<>();
		try {
			queue.element();
		} catch (NoSuchElementException e) {
			System.out.println("요소없음");
		}

		queue.add("나");
		queue.add("너");
		queue.add("우리");

		System.out.println(queue.element());
		System.out.println(queue);
		System.out.println(queue.remove());
		System.out.println(queue);
		System.out.println(queue.remove());
		System.out.println(queue.remove());
		System.out.println(queue);
		System.out.println(queue.peek());
		queue.offer("나");
		queue.offer("너");
		queue.offer("우리");
		System.out.println(queue.peek());
		System.out.println(queue.poll());
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue);

	}

}
