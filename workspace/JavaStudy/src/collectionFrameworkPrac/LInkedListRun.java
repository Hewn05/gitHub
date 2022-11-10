package collectionFrameworkPrac;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LInkedListRun {
	public static void main(String[] args) {
		LinkedList<String> llist = new LinkedList<>();
		llist.add("딸기");
		llist.add("초코");
		llist.add("바나나");
		llist.add("커피");
		llist.add(2, "바닐라");
		System.out.println(llist);

		System.out.println(llist.get(1));
		System.out.println(llist.getFirst());
		System.out.println(llist.getLast());

		System.out.println(llist.remove());
		System.out.println(llist);
		System.out.println(llist.remove(1));
		System.out.println(llist);
		System.out.println(llist.size());

		for (int i = 0; i < llist.size(); i++)
			System.out.print(llist.get(i) + "/ ");
		System.out.println();

		for (String str : llist)
			System.out.print(str + "/ ");
		System.out.println();

		Iterator<String> iter = llist.iterator();
		while (iter.hasNext()) {
			System.out.print(iter.next() + "/ ");
		}
		System.out.println();

		llist.set(2, "모카");
		System.out.println(llist);
		System.out.println(llist.contains("바나나"));
		System.out.println(llist.indexOf("초코"));

		llist.clear();
		System.out.println(llist);

		llist = new LinkedList<>(Arrays.asList("초코", "바나나", "딸기", "커피", "모카", "바닐라"));
		System.out.println(llist);

		Collections.sort(llist);
		System.out.println(llist);
		Collections.sort(llist, Collections.reverseOrder());
		System.out.println(llist);

		
		
	}
}
