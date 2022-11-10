package collectionFramework2Prac;

import java.util.*;

public class MapRun {

	public static void main(String[] args) {
		Map<String, Integer> hashMap = new HashMap<>();
		hashMap.put("C", 24);
		hashMap.put("B", 30);
		hashMap.put("A", 24);
		hashMap.put("C", 99);
		System.out.println(hashMap);
		System.out.println(hashMap.size());		
		
		Map<Integer, String> hashtable = new Hashtable<>();
		hashtable.put(101, "kim");
		hashtable.put(102, "kim");
		hashtable.put(103, "lee");
		hashtable.put(101, "koo");
		System.out.println(hashtable);
		System.out.println(hashtable.size());	
		
		Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
		linkedHashMap.put("C", 24);
		linkedHashMap.put("B", 30);
		linkedHashMap.put("A", 24);
		linkedHashMap.put("C", 99);
		System.out.println(linkedHashMap);
		System.out.println(linkedHashMap.size());
				
		Map<Integer, String> treeMap = new TreeMap<>();
		treeMap.put(103, "lee");
		treeMap.put(102, "kim");
		treeMap.put(101, "kim");
		treeMap.put(102, "hong");
		System.out.println(treeMap);
		System.out.println(treeMap.size());	
		
	}

}
