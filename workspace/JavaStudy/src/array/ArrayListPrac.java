package array;

import java.util.*;

public class ArrayListPrac {

	public static void main(String[] args) {

		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<>();
		ArrayList<Integer> list3 = new ArrayList<>(10);
		ArrayList<Integer> list4 = new ArrayList<Integer>(Arrays.asList(1, 2, 3));
		ArrayList<String> list5 = new ArrayList<String>();

		ArrayList<String> a = new ArrayList<String>();
		a.add("안녕1");
		a.add("안녕2");
		a.add("안녕3");
		System.out.println(a.size());
		System.out.println(a);

		a.add(3, "안녀엉");
		a.add(1, "안뇽");
		System.out.println(a);
		System.out.println(a.size());

		a.set(0, "녕안");
		System.out.println(a);

		a.remove("안녕2");
		System.out.println(a);
		System.out.println(a.size());

		a.remove(3);
		System.out.println(a);

		a.clear();
		System.out.println(a);
		System.out.println(a.size());

		a.add("안녕1");
		a.add("안녕2");
		a.add("안녕3");

		for (int i = 0; i < a.size(); i++) {
			System.out.println(a.get(i));

		}

		for (String str : a) {
			System.out.println(str);
		}

		System.out.println(a.contains("ㅎㅇ"));
		System.out.println(a.indexOf("ㅎㅇ"));
		System.out.println(a.indexOf("ㅎㅇㅇ"));

		ArrayList<String> newA1 = (ArrayList<String>) a.clone();
		printArrayList(newA1);

		ArrayList<String> newA2 = new ArrayList<>();
		newA2.addAll(a);
		printArrayList(newA2);

		ArrayList<String> newA3 = new ArrayList<>();
		for (String str : a) {
			newA3.add(str);
		}
		printArrayList(newA3);

		System.out.println(newA3.isEmpty());
		newA3.clear();
		System.out.println(newA3.isEmpty());

		
		
	}

	public static void printArrayList(ArrayList<String> arr) {
		for (String str : arr) {
			System.out.println(str);
		}

	}

}
