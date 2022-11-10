package collectionFrameworkPrac;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetRun {

	public static void main(String[] args) {
		LinkedHashSet<String> lset = new LinkedHashSet<>();
		lset.add("한국");
		lset.add("미국");
		lset.add("중국");
		lset.add("영국");
		lset.addAll(lset);
		System.out.println(lset);
		
		LinkedHashSet<Integer> lset2 = new LinkedHashSet<>();
		lset2.addAll(Arrays.asList(1,2,3,3,867,345,234));
		System.out.println(lset2);
		System.out.println(lset.size());
		System.out.println(lset.contains("미국"));
		Iterator<String> itr = lset.iterator();
		while(itr.hasNext())
			System.out.print(itr.next());
		System.out.println();
		
		lset.remove("영국");
		System.out.println(lset);
	
		lset.clear();
		System.out.println(lset.isEmpty());
		System.out.println(lset2.isEmpty());
		Integer[] integer = lset2.toArray(new Integer[0]);
		System.out.println(Arrays.toString(integer));
		
	
	
	}

}
