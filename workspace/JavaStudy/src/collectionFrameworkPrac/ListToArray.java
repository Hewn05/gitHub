package collectionFrameworkPrac;

import java.util.*;

public class ListToArray {
	public static void main(String[] args) {
		ArrayList<Integer> alist = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
		LinkedList<Integer> llist = new LinkedList<>(Arrays.asList(5, 6, 7, 8));
		Vector<Integer> vec = new Vector<>(Arrays.asList(9, 10, 11, 12));
		
		Object[] obj = alist.toArray();
		System.out.println(Arrays.toString(obj));
		
		Integer[] integer = alist.toArray(new Integer[0]);
		System.out.println(Arrays.toString(integer));
		
		Integer[] integer1 = llist.toArray(new Integer[0]);
		System.out.println(Arrays.toString(integer1));
		
		Integer[] integer2 = vec.toArray(new Integer[0]);
		System.out.println(Arrays.toString(integer2));
		
			
	}
}
