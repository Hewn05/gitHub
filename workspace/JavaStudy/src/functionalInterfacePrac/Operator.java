package functionalInterfacePrac;

import java.util.function.*;

public class Operator {

	public static void main(String[] args) {
		UnaryOperator<Double> o1 = new UnaryOperator<Double>() {
			@Override
			public Double apply(Double t) {
				return t * 12.3;
			}
		};
		System.out.println(o1.apply(4.1));

		UnaryOperator<Double> o2 = dd -> dd * 12.3;
		System.out.println(o2.apply(2.2));

		BinaryOperator<String> o3 = (str1, str2) -> str1 + str2;
		System.out.println(o3.apply("이탈리안", "BMT"));

		IntUnaryOperator o4 = num -> num + 3;
		System.out.println(o4.applyAsInt(0));
		LongUnaryOperator o5 = num -> num + 21l;
		System.out.println(o5.applyAsLong(23l));
		DoubleUnaryOperator o6 = num -> num * 1.2;
		System.out.println(o6.applyAsDouble(2.3));

		IntBinaryOperator o7 = (num1, num2) -> num1 - num2;
		System.out.println(o7.applyAsInt(12, 100));
		LongBinaryOperator o8 = (num1, num2) -> num1 - num2;
		System.out.println(o8.applyAsLong(12l, 100l));
		DoubleBinaryOperator o9 = (num1, num2) -> num1-num2;
		System.out.println(o9.applyAsDouble(12.4,42.25));

	}

}
