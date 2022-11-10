package lamdaPrac;

interface ArrIF {
	int[] sizeOfArray(int length);
}

public class ArrayLamdaRun {
	public static void main(String[] args) {
		ArrIF aif = new ArrIF() {
			@Override
			public int[] sizeOfArray(int length) {
				return new int[length];
			}
		};
		int[] arr = aif.sizeOfArray(4);
		System.out.println(arr.length);

		ArrIF aif1 = length -> new int[length];
		System.out.println(aif1.sizeOfArray(6).length);

		ArrIF aif2 = int[]::new;
		System.out.println(aif2.sizeOfArray(15).length);
		
		ConstLamda c1 = new ConstLamda() {
			@Override
			public TwoConst getInstance() {
				return new TwoConst();
			}
		};
		TwoConst tc = c1.getInstance();
		
		ConstLamda c2 = ()->new TwoConst();
		c2.getInstance();
		
		ConstLamda c3 = TwoConst::new;
		c3.getInstance();
	
		ConstLamdaParam clp1 = new ConstLamdaParam() {
			@Override
			public TwoConst getInstance(String str) {
				return new TwoConst(str);
			}
		};
		clp1.getInstance("안녕하세요");
		
		ConstLamdaParam clp2 = str->new TwoConst(str);
		clp2.getInstance("안안녕하세요");		
		
		ConstLamdaParam clp3 = TwoConst::new;
		clp3.getInstance("안녕안하세요");
	}
}
interface ConstLamda{
	TwoConst getInstance();
}

interface ConstLamdaParam{
	TwoConst getInstance(String str);
}

class TwoConst {
	TwoConst() {
		System.out.println("기본 생성자");
	}

	TwoConst(String str) {
		System.out.println("매개변수 생성자");
	}

}