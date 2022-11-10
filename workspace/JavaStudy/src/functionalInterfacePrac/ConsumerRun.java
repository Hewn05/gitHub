package functionalInterfacePrac;

import java.util.function.*;

public class ConsumerRun {
	public static void main(String[] args) {
		Consumer<String> c = new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		};
		c.accept("t");

		Consumer<String> c2 = System.out::println;
		c2.accept("ASAP");

		IntConsumer c3 = System.out::println;
		LongConsumer c4 = System.out::println;
		DoubleConsumer c5 = System.out::println;
		BiConsumer<String, Integer> c6 = (name, age) -> System.out.println(name + age);
//		c6.accept("운미래",30);

	}
}
