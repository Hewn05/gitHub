package collectionFramework2Prac;

import java.util.*;
import java.util.Map.Entry;

public class TreeMapRun {

	public static void main(String[] args) {
		TreeMap<Integer, String> tmap = new TreeMap<>();

		for (int i = 2; i <= 40; i += 2) {
			tmap.put(i, (i / 2) + "번 아이");
		}
		System.out.println(tmap);
		System.out.println(tmap.firstKey());
		System.out.println(tmap.lastKey());

		Entry<Integer, String> firstEntry = tmap.firstEntry();
		System.out.println(firstEntry);
		System.out.println(tmap.lastEntry());

		System.out.println(tmap.higherKey(20));
		System.out.println(tmap.lowerKey(20));

		System.out.println(tmap.higherEntry(18));
		System.out.println(tmap.lowerEntry(18));

		System.out.println(tmap.pollFirstEntry());
		System.out.println(tmap.pollLastEntry());
		System.out.println(tmap);

		SortedMap<Integer, String> head = tmap.headMap(18);
		NavigableMap<Integer, String> head2 = tmap.headMap(18, true);
		System.out.println(head);
		System.out.println(head2);

		System.out.println(tmap.tailMap(32));
		System.out.println(tmap.tailMap(32, false));

		System.out.println(tmap.subMap(18, 32));
		System.out.println(tmap.subMap(18, false, 32, true));

		System.out.println(tmap.ceilingKey(17));
		System.out.println(tmap.ceilingEntry(17));
		System.out.println(tmap.floorKey(17));
		System.out.println(tmap.floorEntry(17));

		System.out.println(tmap.keySet());
		System.out.println(tmap.entrySet());

		System.out.println(tmap.descendingKeySet());
		System.out.println(tmap.descendingMap());

		System.out.println(tmap.replace(4, "4번 녀석"));
		System.out.println(tmap.replace(4, "모르는 녀석", "안나올 녀석"));
		System.out.println(tmap);

		System.out.println(tmap.remove(4));
		System.out.println(tmap.remove(6, "4번 아이"));
		System.out.println(tmap);

		System.out.println(tmap.values());

		System.out.println("======================================");
		Set<Integer> keySet = tmap.keySet();
		for (int key : keySet)
			System.out.println("key: " + key + "\tvalue: " + tmap.get(key));
		System.out.println("======================================");

		Iterator<Integer> iter = keySet.iterator();
		while (iter.hasNext()) {
			int key = iter.next();
			System.out.println("key: " + key + "\tvalue: " + tmap.get(key));
		}
		System.out.println("======================================");

		Set<Entry<Integer, String>> tset = tmap.entrySet();
		for (Entry<Integer, String> entry : tset)
			System.out.println("key: " + entry.getKey() + "\tvalue: " + entry.getValue());
		System.out.println("======================================");

		Iterator<Entry<Integer, String>> eiter = tset.iterator();
		while (eiter.hasNext()) {
			Entry<Integer, String> e = eiter.next();
			System.out.println("key: " + e.getKey() + "\tvalue: " + e.getValue());
		}
		System.out.println("======================================");

		tmap.clear();
		System.out.println();

	}

}
