package functionalInterfacePrac;

import java.util.function.*;

public class FuntionRun {
	public static void main(String[] args) {
		Function<String, Integer> f0 = new Function<String, Integer>() {
			@Override
			public Integer apply(String t) {
				return t.length();
			}
		};
		System.out.println(f0.apply("진짜 개발자가 되는 Java 프로그래밍 입문서"));
		
		Function<String, Integer> f1 = str -> str.length();
		System.out.println(f1.apply("자바 완전정복"));

		Function<String, Integer> f2 = String::length;
		System.out.println(f2.apply("컴공과 1년치 강의 대공개"));

		IntFunction<Double> f3 = num -> num * 1.3;
		System.out.println(f3.apply(13));

		LongFunction<String> f4 = num -> String.valueOf(num);
		System.out.println(f4.apply(84651l));

		DoubleFunction<Integer> f5 = num -> (int) num;
		System.out.println(f5.apply(12.48613));

		BiFunction<String, String, String> f6 = (s1, s2) -> s1 + s2;
		System.out.println(f6.apply("김동형", "지음"));
		
		LongToDoubleFunction f7 = num->num;
		System.out.println(f7.applyAsDouble(12l));
		LongToIntFunction f8 = num ->(int)num;
		System.out.println(f8.applyAsInt(1234l));
		
		ToIntFunction<String> f9 = str->str.length();
		System.out.println(f9.applyAsInt("이지스 퍼블리싱"));
		ToDoubleBiFunction<Integer, Double> f10 = (intNum, ddNum)->intNum*ddNum;
		System.out.println(f10.applyAsDouble(12, 13.29));

	}
}
