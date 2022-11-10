package streamPrac;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.*;
import java.util.stream.Stream.Builder;

public class StreamMKRun {

	public static void main(String[] args) throws IOException {
		ArrayList<Integer> alist = new ArrayList<>(Arrays.asList(6, 5, 4, 3, 2, 1));
		Stream<Integer> streamCollection = alist.stream();
		streamCollection.forEach(System.out::print);
		System.out.println();

		String[] sarr = new String[] { "넷", "셋", "둘", "하나" };
		Stream<String> streamArrays = Arrays.stream(sarr);
		streamArrays.forEach(str -> System.out.print(str + " "));
		System.out.println();
		streamArrays = Arrays.stream(sarr, 1, 3);
		streamArrays.forEach(str -> System.out.print(str + " "));
		System.out.println();

		Stream<Double> stream1 = Stream.of(4.2, 2.7, 1.4, 3.7);
		stream1.forEach(num -> System.out.print(num + " "));
		System.out.println();

		IntStream stream2 = IntStream.range(1, 5);
		stream2.forEach(num -> System.out.print(num + " "));
		System.out.println();

		LongStream stream3 = LongStream.rangeClosed(1, 5);
		stream3.forEach(num -> System.out.print(num + " "));
		System.out.println();

		DoubleStream stream4 = new Random().doubles(3);
		stream4.forEach(num -> System.out.print(num + " "));
		System.out.println();

		int dd = (int) (new Random().nextDouble() * 6 + 1);
		System.out.println(dd);

		IntStream stream5 = "StringStream".chars();
		stream5.forEach(num -> System.out.print(num + " "));
		System.out.println();
		//정규식, 정규표현식, Regular Expression, RegEx
		Stream<String> stream6 = Pattern.compile(", ").splitAsStream("서울, 대전, 대구, 부산, 울산");
		stream6.forEach(str -> System.out.print(str + " "));
		System.out.println();
		
		System.out.println(System.getProperty("user.dir"));
		Stream<String> stream7 = Files.lines(Paths.get("D:\\workspace\\JavaStudy\\src\\streamPrac\\testfile.txt"),Charset.forName("UTF-8"));
		stream7.forEach(str -> System.out.print(str + " "));
		System.out.println();
		
		ArrayList<String> alist2 = new ArrayList<>(Arrays.asList("나","너","우리"));		
		Stream<String> stream8 = streamOf(alist2);
		stream8.forEach(str -> System.out.print(str + " "));
		System.out.println();
		
//		Stream.Builder<String> builder = Stream.builder();
//		Stream<String> bstream = builder.add("수학").add("물리").add("영어").build();
		Stream<String> bstream = Stream.<String>builder().add("수학").add("물리").add("영어").build();
		bstream.forEach(str -> System.out.print(str + " "));
		System.out.println();
		
		Stream<String> gstream = Stream.generate(() -> "wow").limit(4);
		gstream.forEach(str -> System.out.print(str + " "));
		System.out.println();
		
		Stream<Integer> istream = Stream.iterate(100, num -> num ).limit(4);
		
		
	}
	
	public static Stream<String> streamOf(List<String> list){
		return list == null || list.isEmpty() ? Stream.empty() : list.stream();
	}
}
