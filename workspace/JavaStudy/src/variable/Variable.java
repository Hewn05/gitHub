package variable;

public class Variable {

	public static void main(String[] args) {

		int num = 10;
		System.out.println(num);

		int bin_num = 0B1010;
		System.out.println(bin_num);

		int oct_num = 013;
		System.out.println(oct_num);

		int hex_num = 0x1A;
		System.out.println(hex_num);

//		integer 32bit
		int num1 = 0B00000000000000000000000000000101;
		int num2 = 0B11111111111111111111111111111011;
		int sum = num1 + num2;
		System.out.println(num1);
		System.out.println(num2);
		System.out.println("sum:" + sum);
		System.out.println(num1 + num2 + "결과");

		System.out.print("hello");
		System.out.print("\n");
		System.out.print("world!\n");

		String world = "World";
		String java = "java";
		System.out.printf("Hello, %s, %s\n", world, java);

		byte bytedata = -128;
		System.out.println(bytedata);
		bytedata = (byte)128;
		System.out.println(bytedata);

		int integerNum = 1234567;
		long longNum = 2223456789L;
		
		char ch = 'A';
		System.out.println(ch);
		ch = 65;
		System.out.println(ch);
		
		int chin = 'A';
		System.out.println(chin);
		
		double doubleNum = 3.14;
		float floatNum = 3.14f;
		System.out.println(doubleNum + " " + floatNum);
		
		
		final double PI = 3.141592;
		
		int num3 = bin_num;
		System.out.println(num3);
		num3 = (int) longNum;
		System.out.println(num3);
		num3 = (int) floatNum;
		System.out.println(num3);
		
		doubleNum = floatNum + num3;
		System.out.println(doubleNum);
		
		floatNum = 0.9f;
		num1 = (int) (doubleNum + floatNum);
		num2 = (int)doubleNum + (int)floatNum;
		System.out.println(num1 + " " + num2);
		
		var num10 = 10;
		var doubNum = 10.01;
		var str = "우리집";
		System.out.println(num10 + " " + doubNum + " " + str);
		
		
		
		
		
		
	}

}
