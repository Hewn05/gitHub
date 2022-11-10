package functionalInterfacePrac;

import java.util.function.*;

public class PredicateRun {

	public static void main(String[] args) {
		Predicate<Integer> p = new Predicate<>() {
			@Override
			public boolean test(Integer t) {
				return t > 3;
			}
		};
		System.out.println(p.test(4));

		Predicate<Integer> p2 = num -> num > 3;
		
		BiPredicate<String, String> p3 = (str1, str2) -> str1.equals(str2);
		System.out.println(p3.test("apple","apple"));
		
		IntPredicate p4 = num->(num%2==0)? true : false;
		System.out.println(p4.test(4));
		
		LongPredicate p5 = num->num>2000;
		System.out.println(p5.test(102l));
		DoublePredicate p6 = num->(num*20>100);
		System.out.println(p6.test(2.5));
		
		
	}

}
