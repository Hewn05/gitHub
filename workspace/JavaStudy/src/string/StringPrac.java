package string;

import java.util.Arrays;

public class StringPrac {

	public static void main(String[] args) {

		String str1 = new String("abc");
		String str2 = new String("abc");

		System.out.println(str1 == str2);

		String str3 = "bcd";
		String str4 = "bcd";

		System.out.println(str3 == str4);

		str3 = "cde";
		System.out.println(str4.toString());

		String a = "hello";
		String b = "world";
		String c = "hello";
		String d = new String("hello");

		System.out.println(a.equals(b));
		System.out.println(a.equals(c));
		System.out.println(a.equals(d));
		System.out.println(a == d);

		String e = "Hello World.";
		System.out.println(e.indexOf("wor"));

		System.out.println(e.contains("ro"));

		System.out.println(e.charAt(4));

		System.out.println(e.replaceAll("world", "baby"));
		System.out.println(e.toString());

		System.out.println(e.substring(0, 7));
		
		System.out.println(e.toUpperCase());
		System.out.println(e.toLowerCase());

		String str = new String("abcd");
		System.out.println(str.compareTo("bcde"));
		System.out.println(str.compareTo("abcd"));
		System.out.println(str.compareTo("Abcd"));
		System.out.println(str.compareToIgnoreCase("Abcd"));
		
		System.out.println(e.concat(str));
		
		String f = " Java    Java   ";
		System.out.print("|||");
		System.out.print(f.trim());
		System.out.println("|||");
		
		System.out.println(f.length());
		System.out.println(f.isEmpty());
		
		String test = "이 문장은 스트링- 입니다./this is String";
		String[] token = test.split("/");
		System.out.println(Arrays.toString(token));
		
//		StringTokenizer stk = New StringTokenizer(test);
	}
	

}
