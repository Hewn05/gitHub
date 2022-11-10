package collectionFrameworkPrac;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetRun {

	public static void main(String[] args) {
		TreeSet<String> tset1 = new TreeSet<>();
		tset1.add("apple");
		tset1.add("orange");
		tset1.add("banana");
		System.out.println(tset1);

		TreeSet<Integer> tset2 = new TreeSet<>();
		tset2.add(55);
		tset2.add(7);
		tset2.add(32);
		tset2.add(0);
		System.out.println(tset2);

		tset2.clear();
		System.out.println(tset2.isEmpty());

		for (int i = 3; i < 100; i += 3)
			tset2.add(i);

		System.out.println(tset2);

		System.out.println(tset2.first());
		System.out.println(tset2.last());

		System.out.println(tset2.lower(50));
		System.out.println(tset2.higher(50));

		System.out.println(tset2.floor(17));
		System.out.println(tset2.floor(18));
		System.out.println(tset2.ceiling(24));
		System.out.println(tset2.ceiling(25));

		System.out.println(tset2.size());
		System.out.println(tset2.pollFirst());
		System.out.println(tset2.pollLast());
		System.out.println(tset2);

		SortedSet<Integer> sset = tset2.headSet(50);
		System.out.println(tset2.headSet(18));
		NavigableSet<Integer> nset = tset2.headSet(18, true);
		System.out.println(tset2.headSet(18, true));

		System.out.println(tset2.tailSet(84));
		System.out.println(tset2.tailSet(84, false));

		System.out.println(tset2.subSet(42, 54));
		System.out.println(tset2.subSet(42, false, 54, true));

		System.out.println(tset2.descendingSet());

		System.out.println(tset1.remove("apple"));
		System.out.println(tset1);

		Iterator<Integer> iter = tset2.iterator();
		while (iter.hasNext())
			System.out.printf("%d ", iter.next());
		System.out.println();

		Iterator<Integer> iter2 = tset2.descendingIterator();
		while (iter.hasNext())
			System.out.printf("%d ", iter2.next());
		System.out.println();

		TreeSet<Integer> tset3 = new TreeSet<>(tset2);
		System.out.println(tset3);
		int treeSize = tset2.size();
		System.out.print("[");
		for (int i = 0; i < treeSize; i++)
			System.out.print(tset2.pollFirst() + " ");
		System.out.println("]");
		System.out.println(tset2.isEmpty());
		
		System.out.print("[");
		for (int i = 0; i < treeSize; i++)
			System.out.print(tset3.pollLast() + " ");
		System.out.println("]");
		System.out.println(tset3.isEmpty());
		
		String[] str = tset1.toArray(new String[0]);
		System.out.println(Arrays.toString(str));
		
		for(String st : tset1)
			System.out.print(st + " ");
		
	}

}
