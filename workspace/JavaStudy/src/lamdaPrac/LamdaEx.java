package lamdaPrac;

interface StringEx{
	String showInfo(String str);
}

public class LamdaEx {
	public static void main(String[] args) {
		//익명 이너클래스
		//파라미터의 길이, 맨 앞자리 글자만 반환
		StringEx se1 = new StringEx() {
			@Override
			public String showInfo(String str) {
				return (str.length()+ "" +str.charAt(0));
			}
		};
		System.out.println(se1.showInfo("김치피자탕수육"));
		//람다식
		StringEx se2 = str -> str.length()+""+str.charAt(0);
		System.out.println(se2.showInfo("포테이토피자"));		
		
		

	}
}
