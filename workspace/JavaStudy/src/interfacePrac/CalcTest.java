package interfacePrac;

public class CalcTest {

	public static void main(String[] args) {
		CompleteCalc calc = new CompleteCalc();
		int n1 = 14, n2 = 7;
		System.out.println(calc.add(n1, n2));
		System.out.println(calc.sub(n1, n2));
		System.out.println(calc.times(n1, n2));
		System.out.println(calc.div(n1, n2));
		n2 = 0;
		System.out.println(calc.div(n1, n2));
		n2 = (int) calc.PI;
		System.out.println(calc.times(n1, n2));
		calc.desc();
		
		int[] array = {1,2,3,4,5};
		System.out.println(Calc.total(array));
	}

}
