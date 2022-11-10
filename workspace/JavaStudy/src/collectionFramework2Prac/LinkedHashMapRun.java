package collectionFramework2Prac;

import java.util.*;

public class LinkedHashMapRun {

	public static void main(String[] args) {
		HashMap <Integer, String> hmap = new HashMap<>();
		hmap.put(2, "홍길동");
		hmap.put(4, "김유신");
		hmap.put(3, "윤봉길");
		hmap.put(1, "이순신");
		System.out.println("hash" + hmap.toString());
		
		LinkedHashMap<Integer, String> lmap = new LinkedHashMap<>();

		lmap.put(1, "이순신");
		lmap.put(2, "홍길동");
		lmap.put(3, "윤봉길");
		lmap.put(4, "김유신");
		System.out.println("linked" + lmap.toString());
		
		LinkedHashMap<Integer, String> lmap2 = new LinkedHashMap<>();
		lmap2.putAll(lmap);
		System.out.println(lmap2);
		
		lmap.replace(3, "김구");
		lmap.replace(9, "김구");
		System.out.println(lmap);
		
		lmap.replace(2, "홍길동", "임꺽정");
		lmap.replace(4, "봉달이", "쳐녀귀신");
		System.out.println(lmap);
		
		System.out.println(lmap.get(3));
		
		Set<Map.Entry<Integer, String>> entrySet = lmap.entrySet();
		System.out.println(entrySet);
		
		Set<Integer> keyset = lmap.keySet();
		System.out.println(keyset);
		System.out.println(lmap.size());
		
		System.out.println(lmap.containsKey(3));
		System.out.println(lmap.containsKey(7));
		System.out.println(lmap.containsValue("김구"));
		System.out.println(lmap.containsValue("홍길동"));
		
		System.out.println(lmap.remove(4));
		System.out.println(lmap.remove(2,"임꺽정"));
		System.out.println(lmap);
		
		lmap.clear();
		System.out.println(lmap.isEmpty());
		
		
		
		
		
	}

}
