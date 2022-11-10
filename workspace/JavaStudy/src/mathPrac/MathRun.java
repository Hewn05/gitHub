package mathPrac;

public class MathRun {

	public static void main(String[] args) {
		System.out.println(Math.E);
		System.out.println(Math.PI);
		
		System.out.println(Math.abs(-6.8));
		
		System.out.println(Math.floor(32.123));
		System.out.println(Math.floor(32.123/10)*10);
		System.out.println(Math.ceil(32.123));
		System.out.println(Math.round(32.723));
		
		System.out.println(Math.max(71, 89));
		System.out.println(Math.min(1102, 325));
		
		System.out.println(Math.pow(3, 3));
		System.out.println(Math.sqrt(9));
		System.out.println(Math.cbrt(27));

		System.out.println(Math.random());	// 0 ~ 1
		System.out.println(Math.random()*6+1);// 1~7
		System.out.println(Math.random()*11+1);//1~12
		System.out.println(Math.random()*4+10);

		System.out.println((int)(Math.random()*11+2));
	}

}
