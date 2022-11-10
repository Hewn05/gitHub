package collectionFrameworkPrac;

import java.util.TreeSet;

public class TreeSetMachRun {

	public static void main(String[] args) {
		TreeSet<Integer> tset1 = new TreeSet<>();
		Integer intVal1 = new Integer(10);
		Integer intVal2 = new Integer(10);
		tset1.add(intVal1);
		tset1.add(intVal2);

		TreeSet<String> tset2 = new TreeSet<>();
		String strVal1 = "당신";
		String strVal2 = "우리";
		tset2.add(strVal1);
		tset2.add(strVal2);
		
		CompareMemberTreeSet cts = new CompareMemberTreeSet();
		Member lee = new Member(101,"이순신",45);
		cts.addMember(lee);
		Member koo = new Member(102,"구준표",18);
		cts.addMember(koo);
		Member kim = new Member(103,"김주환",32);
		cts.addMember(kim);
		cts.showAll();
		cts.removeMember(100);
		cts.deleteMember(101);
		cts.showAll();
	}

}

