package collectionFramework2Prac;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student {
	int stuID;
	String name;
	int age;

	public Student(int stuID, String name, int age) {
		this.stuID = stuID;
		this.name = name;
		this.age = age;
	}

	public String toString() {
		return stuID + " " + name + " " + age;
	}
}

class AgeComparator implements Comparator<Student> {

	public int compare(Student o1, Student o2) {
		return o1.age - o2.age;
	}
}

public class StudentAgeRun {

	public static void main(String[] args) {
		ArrayList<Student> alist = new ArrayList<>();
		alist.add(new Student(111, "구름", 12));
		alist.add(new Student(222, "달", 10));
		alist.add(new Student(333, "해", 11));
		System.out.println(alist);
		Collections.sort(alist, new AgeComparator());
		System.out.println(alist);

		ArrayList<Student> alist2 = new ArrayList<>();
		alist2.add(new Student(222, "달", 10));
		alist2.add(new Student(111, "구름", 12));
		alist2.add(new Student(333, "해", 11));
		System.out.println(alist2);

		Collections.sort(alist2, new Comparator<Student>() {
			public int compare(Student o1, Student o2) {
				return o1.name.compareTo(o2.name);
			}
		});
		System.out.println(alist2);

	}
}
