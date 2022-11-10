package collectionFrameworkPrac;

import java.util.*;

public class VectorRun {

	public static void main(String[] args) {
		Vector<String> vec1 = new Vector<>();
		Vector<String> vec2 = new Vector<>(Arrays.asList("사과","오렌지","망고","배"));
		
		System.out.println(vec2);
		vec2.add("귤");
		vec2.addElement("감");
		System.out.println(vec2);
		System.out.println(vec2.size());
		System.out.println(vec2.capacity());;
		System.out.println(vec2.remove(4));
		System.out.println(vec2.remove("감"));
		System.out.println(vec2);
		
		for(int i = 0 ; i < vec2.size();i++)
			System.out.print(vec2.get(i));
		System.out.println();
		for(String arr : vec2)
			System.out.print(arr);
		System.out.println();
		Iterator iter = vec2.iterator();
		while(iter.hasNext())
			System.out.print(iter.next());
		System.out.println();
		
		System.out.println(vec2.contains("망고"));
		System.out.println(vec2.indexOf("사과"));
		System.out.println(vec2.elementAt(1));
		System.out.println(vec2.firstElement());
		System.out.println(vec2.lastElement());
		System.out.println(vec2.set(0, "귤"));
		System.out.println(vec2);
		vec2.setElementAt("사과", 2);
		System.out.println(vec2);
		vec2.clear();
		System.out.println(vec2.isEmpty());
		
		
		
		

	}

}
