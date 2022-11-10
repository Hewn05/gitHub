package collectionEx;

import java.util.*;

class Hashex {
	HashSet<String> hset = new HashSet<>();

	public void add(String str) {
		hset.add(str);
	}
}

public class HashSetEx {

	public static void main(String[] args) {
		// 객2 생
		Hashex ex1 = new Hashex();
		Hashex ex2 = new Hashex();
		// 일 오식이 추가
		ex1.add("일식이");
		ex1.add("이식이");
		ex1.add("삼식이");
		ex1.add("사식이");
		ex1.add("오식이");
		// 객체내용옮기기
		ex2.hset.addAll(ex1.hset);
		// 반복 출력
		for (String str : ex1.hset) {
			System.out.print(str);
		}
		System.out.println();
		for (String str : ex2.hset) {
			System.out.print(str);
		}
		System.out.println();
		// 삼식? 육식 : 오식x
		if(ex2.hset.contains("삼식이")) {
			ex2.add("육식이");
		}else {
			ex2.hset.remove("오식이");
		}
		// array 변환후 출력
		System.out.println(Arrays.toString(ex2.hset.toArray(new String[0])));
		
	}

}
