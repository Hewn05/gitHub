package collectionFrameworkPrac;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class ArrayListRun {

	public static void main(String[] args) {

		ArrayList<Integer> intArr = new ArrayList<>();
		intArr.add(10);
		intArr.add(20);
		intArr.add(40);
		intArr.add(80);
		intArr.add(-60);
		intArr.add(140);

		System.out.println(intArr.toString());

		intArr.remove(0);

		for (int i : intArr)
			System.out.print("[" + i + "] ");
		System.out.println();

		Iterator<Integer> iter = intArr.iterator();
		while (iter.hasNext())
			System.out.print(iter.next() + " | ");
		System.out.println();

		System.out.println(intArr.size());

		intArr.set(0, 0);
		System.out.println(intArr.toString());

		System.out.println(intArr.contains(-60));
		System.out.println(intArr.indexOf(-60));

		intArr.sort(Comparator.naturalOrder());
		System.out.println(intArr.toString());
		intArr.sort(Comparator.reverseOrder());
		System.out.println(intArr.toString());
		
		ArrayList<String> strArr = new ArrayList<>();
		strArr.add("나연");
		strArr.add("정연");
		strArr.add("모모");
		strArr.add("사나");
		strArr.add("지효");
		strArr.add("미나");
		strArr.add("다현");
		strArr.add("채영");
		strArr.add("쯔위");
		System.out.println(strArr);
		Collections.sort(strArr);
		System.out.println(strArr);
		Collections.sort(strArr, Collections.reverseOrder());
		System.out.println(strArr);

		intArr.clear();
		System.out.println(intArr.toString());
	}

}
