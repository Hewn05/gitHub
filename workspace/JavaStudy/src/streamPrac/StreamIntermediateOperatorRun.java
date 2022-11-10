package streamPrac;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.*;

public class StreamIntermediateOperatorRun {

	public static void main(String[] args) {
		IntStream st1 = IntStream.of(7, 5, 5, 2, 1, 3, 4, 6, 8, 9, 2, 4, 8);
		IntStream st2 = IntStream.of(7, 5, 5, 2, 1, 3, 4, 6, 8, 9, 3, 5, 7);

		st1.filter(num -> num % 2 == 0).forEach(e -> System.out.print(e + " "));
		System.out.println();
		st2.filter(num -> num % 2 == 1).filter(num -> num % 3 == 0).forEach(e -> System.out.print(e + " "));
		System.out.println();

		Stream<String> st3 = Stream.of("html", "CSS", "java", "javascript");
		st3.map(str -> str.length());
		String[] arr = { "I study Html", "I love CSS", "java like javascript" };
		Stream<String> st4 = Arrays.stream(arr);
		st4.flatMap(str -> Stream.of(str.split(" "))).forEach(e -> System.out.print(e + " "));
		System.out.println();

		IntStream.of(14, 10, 21, 35, 27).sorted().forEach(e -> System.out.print(e + " "));
		System.out.println();

		Stream<String> st5 = Stream.of("html", "CSS", "java", "javascript");
		Stream<String> st6 = Stream.of("html2", "CSS2", "java2", "javascript2");
		Stream.concat(st5, st6).sorted().forEach(e -> System.out.print(e + " "));
		System.out.println();

		List<String> lang = Arrays.asList("java", "c++", "scala", "go", "python");

		lang.stream().sorted(Comparator.reverseOrder()).forEach(e -> System.out.print(e + " "));
		System.out.println();
		List<String> list = lang.stream().collect(Collectors.toList());
		System.out.println(list);

		lang.stream().peek(System.out::println).forEach(e -> System.out.print(e + " "));
		System.out.println();
		int sum = IntStream.of(1, 42, 12, 51, 67).peek(System.out::println).sum();
		System.out.println(sum);
		
	}

}
