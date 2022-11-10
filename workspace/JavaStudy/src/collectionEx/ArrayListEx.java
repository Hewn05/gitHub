package collectionEx;

import java.util.ArrayList;

public class ArrayListEx {

	public static void main(String[] args) {

		ArrayList<String> arr = new ArrayList<>();
		
		arr.add("일식이");
		arr.add("이식이");
		arr.add("삼식이");
		arr.add("사식이");
		arr.add("오식이");
		arr.add("육식이");
		arr.add("칠식이");

		for (String str : arr)
			System.out.print(str + " ");
	}

}
