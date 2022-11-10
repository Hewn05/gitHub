package collectionFrameworkPrac;

import java.util.*;

public class SpeedALandLL {
	public static void main(String[] args) {
		List<Integer> alist = new ArrayList<>();
		List<Integer> llist = new LinkedList<>();
		long start = 0;
		long end = 0;
		start = System.nanoTime();
		for (int i = 0; i < 100000; i++)
			alist.add(0, i);
		end = System.nanoTime();
		System.out.printf("ArrayList : %10d\n", (end - start));
		start = System.nanoTime();
		for (int i = 0; i < 100000; i++)
			llist.add(0, i);
		end = System.nanoTime();
		System.out.printf("LinkedList: %10d\n", (end - start));

		start = System.nanoTime();
		for (int i = 0; i < 100000; i++)
			alist.get(i);
		end = System.nanoTime();
		System.out.printf("ArrayList : %10d\n", (end - start));
		start = System.nanoTime();
		for (int i = 0; i < 100000; i++)
			llist.get(i);
		end = System.nanoTime();
		System.out.printf("LinkedList: %10d\n", (end - start));

		start = System.nanoTime();
		for (int i = 0; i < 100000; i++)
			alist.remove(0);
		end = System.nanoTime();
		System.out.printf("ArrayList : %10d\n", (end - start));
		start = System.nanoTime();
		for (int i = 0; i < 100000; i++)
			llist.remove(0);
		end = System.nanoTime();
		System.out.printf("LinkedList: %10d\n", (end - start));

	}
}
