package classPrac;

class Calculator {
	
	private int result = 0;
	static int mem = 3;

	int add(int num) {
		result += num;
		return result;
	}

}

public class SampleCalculator {

	public static void main(String[] args) { 
		Calculator cal1 = new Calculator();
		System.out.println(cal1);
		Calculator cal2 = new Calculator();
		System.out.println(cal2);
		System.out.println(cal1.add(5));
//		System.out.println(cal1.result);
		System.out.println(cal1.add(4));
		
//		System.out.println(cal2.result);
		System.out.println(cal2.add(6));

//		cal2.result = 32;
		System.out.println(cal2.add(1));
		
		cal1.mem = 9;
		System.out.println(cal2.mem);
		
		cal2.mem =45;
		System.out.println(cal1.mem);
	}

}
