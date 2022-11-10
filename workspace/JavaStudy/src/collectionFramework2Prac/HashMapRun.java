package collectionFramework2Prac;

import java.util.*;

public class HashMapRun {

	public static void main(String[] args) {
		HashMap<Integer, String> hmap = new HashMap<>();

		hmap.put(1, "이순신");
		hmap.put(2, "홍길동");
		hmap.put(3, "윤봉길");
		hmap.put(4, "김유신");
		System.out.println(hmap.toString());

		HashMap<Integer, String> hmap2 = new HashMap<>();
		hmap2.putAll(hmap);
		System.out.println(hmap2);
		
		hmap.putIfAbsent(5, "무지개");
		hmap.putIfAbsent(3, "아무개");
		System.out.println(hmap);		
		
		hmap.replace(3, "김구");
		hmap.replace(9, "김구");
		System.out.println(hmap);

		hmap.replace(2, "홍길동", "임꺽정");
		hmap.replace(4, "봉달이", "거북선");
		System.out.println(hmap);
		
		System.out.println(hmap.get(3));
		System.out.println(hmap.getOrDefault(11, "아무개"));
		
		Set<Map.Entry<Integer, String>> entrySet = hmap.entrySet();
		System.out.println(entrySet.toString());
		
		Set<Integer> keyset = hmap.keySet();
		System.out.println(keyset);
		System.out.println(hmap.size());
		
		System.out.println(hmap.containsKey(3));
		System.out.println(hmap.containsKey(7));
		System.out.println(hmap.containsValue("김구"));
		
		System.out.println(hmap.remove(4));
		System.out.println(hmap.remove(2,"임꺽정"));
		System.out.println(hmap);
		
		hmap.clear();
		System.out.println(hmap.isEmpty());
				
		Set<Integer> keyset2 = hmap2.keySet();
		for(int key : keyset2) {
			System.out.println("key : " + key + " / value : " + hmap2.get(key));
		}
		System.out.println();
		
		
		Iterator<Integer> iter = keyset2.iterator();
		while(iter.hasNext()) {
			int key = iter.next();
			System.out.println("key : " + key + " / value : " + hmap2.get(key));
		}
		
		System.out.println(hmap2.values());
	}

}
