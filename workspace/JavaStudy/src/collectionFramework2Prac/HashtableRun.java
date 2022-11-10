package collectionFramework2Prac;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashtableRun {

	public static void main(String[] args) {
		Hashtable<Integer,String> htable = new Hashtable<>();
		
		htable.put(2, "홍길동");
		htable.put(4, "김유신");
		htable.put(3, "윤봉길");
		htable.put(1, "이순신");
		System.out.println(htable.toString());
		
		HashMap<Integer, String> hmap2 = new HashMap<>();
		hmap2.putAll(htable);
		System.out.println(hmap2);
		
		htable.putIfAbsent(5, "무지개");
		htable.putIfAbsent(3, "아무개");
		System.out.println(htable);
		
		htable.replace(3, "김구");
		htable.replace(9, "김구");
		System.out.println(htable);

		htable.replace(2, "홍길동", "임꺽정");
		htable.replace(4, "봉달이", "거북선");
		System.out.println(htable);
		
		System.out.println(htable.get(3));
		System.out.println(htable.getOrDefault(151022, "아무개"));
		
		Set<Map.Entry<Integer, String>> entrySet = htable.entrySet();
		System.out.println(entrySet.toString());
		
		Set<Integer> keyset = htable.keySet();
		System.out.println(keyset);
		System.out.println(htable.size());
		
		System.out.println(htable.containsKey(3));
		System.out.println(htable.containsKey(7));
		System.out.println(htable.containsValue("김구"));
		
		System.out.println(htable.remove(4));
		System.out.println(htable.remove(2,"임꺽정"));
		System.out.println(htable);
		
		//htable.clear();
		System.out.println(htable.isEmpty());
				
		Set<Integer> keyset2 = htable.keySet();
		for(int key : keyset2) {
			System.out.println("key : " + key + " / value : " + htable.get(key));
		}
		System.out.println();
		
		
		Iterator<Integer> iter = keyset2.iterator();
		while(iter.hasNext()) {
			int key = iter.next();
			System.out.println("key : " + key + " / value : " + htable.get(key));
		}
		
		System.out.println(hmap2.values());
		
		Hashtable<Integer, String> htable2 = new Hashtable<>(hmap2);
		
		Enumeration<Integer> en = htable2.keys();
		while(en.hasMoreElements()) {
			Integer key = en.nextElement();
			System.out.print(key + " " + htable2.get(key));
		}
		System.out.println();
		
		Enumeration<String> en2 = htable2.elements();
		while(en2.hasMoreElements()) {
			String value = en2.nextElement();
			System.out.print(value+" ");
		}
		System.out.println();
	}

}
