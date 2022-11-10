package streamPrac;

import java.util.*;
import java.util.stream.*;

public class StreamTerminalOperatorRun {
	public static void main(String[] args) {
		int[] arr = { 1, 3, 5, 8, 9, 10 };
		long count = Arrays.stream(arr).count();
		int sum = Arrays.stream(arr).sum();
		System.out.println(count + " " + sum);

		OptionalInt min = Arrays.stream(arr).min();
		OptionalInt max = Arrays.stream(arr).max();
		System.out.println(min + " " + max);
		// 존재한다면 평균 출력
		Arrays.stream(arr).average().ifPresent(System.out::print);
		System.out.println();
		// 계속 더하기, 20부터 시작해서 계속 더하기
		Arrays.stream(arr).reduce(Integer::sum).ifPresent(System.out::println);
		System.out.println(Arrays.stream(arr).reduce(20, Integer::sum));
		// 계속 빼기
		Arrays.stream(arr).reduce((x, y) -> x - y).ifPresent(System.out::println);
		// 앞의 값 찾기
		Arrays.stream(arr).sorted().findFirst().ifPresent(System.out::println);
		Arrays.stream(arr).sorted().findAny().ifPresent(System.out::println);

		String[] sarr = { "apple", "apple1", "orange", "orange1", "lemon", "lemon" };
		Arrays.stream(sarr).filter(str -> str.startsWith("a")).findAny().ifPresent(System.out::println);
		Arrays.stream(sarr).filter(str -> str.startsWith("a")).findFirst().ifPresent(System.out::println);

		Optional<String> ele = Arrays.stream(sarr).findAny();
		System.out.println(ele.get());
		// 하나라도 전부o 전부x
		System.out.println(Arrays.stream(arr).anyMatch(num -> num > 8));
		System.out.println(Arrays.stream(arr).allMatch(num -> num < 20));
		System.out.println(Arrays.stream(arr).noneMatch(num -> num > 20));

		System.out.println(Arrays.stream(arr).count());
		System.out.println(Arrays.stream(arr).max().getAsInt());
		System.out.println(Arrays.stream(arr).min().getAsInt());

		// collect
		// 배열 컬렉션 변환 : toArray() toList() toSet() toMap()
		// 통계 연산 : counting() maxBy() minBy() summingInt() averaingInt()
		// 요소 처리 : reducing() joining()
		// 그룹 분할 : groupingBy() partitionBy()
		Stream<String> streamEx = Stream.of("나", "너", "우리", "당신");
		List<String> list = streamEx.collect(Collectors.toList());
		System.out.println(list);

		System.out.println(Arrays.stream(sarr).collect(Collectors.joining()));
		System.out.println(Arrays.stream(sarr).collect(Collectors.joining(",", "[", "]")));
		System.out.println(Arrays.toString(arr));

		List<Integer> nums = Arrays.asList(1, 2, 5, 6, 87, 2);
		Double ave = nums.stream().collect(Collectors.averagingInt(Integer::intValue));
		Integer summing = nums.stream().collect(Collectors.summingInt(num -> num));
		System.out.println(ave + " " + summing);

		List<String> list2 = Stream.of("test1", "test2")
				.collect(Collectors.collectingAndThen(Collectors.toList(), Collections::<String>unmodifiableList));
		System.out.println(list2);

		Stream<Integer> stream = Stream.of(25, 50, 75, 100, 125, 150);
		Map<Boolean, List<Integer>> m = stream.collect(Collectors.partitioningBy(a -> a == 50));
		System.out.println(m);

		Stream<Integer> stream2 = Stream.of(25, 50, 75, 100, 125, 150);
		Map<Boolean, List<Integer>> m2 = stream2.collect(Collectors.groupingBy(a -> a == 50));
		System.out.println(m2);

	}
}
