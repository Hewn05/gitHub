package polymorphism;

import array.Book;

class People {
	String name;

	public void setName(String name) {
		this.name = name;
	}

	public void showInfo() {
		System.out.println(name + " 사람입니다.");
	}

	public void eatFood() {
		System.out.println("음식을 먹습니다.");
	}
}

class Male extends People {
	@Override

	public void showInfo() {
//		super.showInfo();
		System.out.println(name + " 남자입니다.");
	}
}

class Female extends People {
	public void showInfo() {
//		super.showInfo();
		System.out.println(name + " 여자입니다.");
	}
}

public class PersonRun {

	public static void main(String[] args) {
		Male m = new Male();
		Female f = new Female();
		m.showInfo();
		f.showInfo();

		People pp = new Male();
		pp.showInfo();
		pp = new Female();
		pp.showInfo();

		if (pp instanceof Female)
			System.out.println("Female instance");
		if (pp instanceof Male)
			System.out.println("male instance");
		if (pp instanceof People)
			System.out.println("People instance");
		if (pp instanceof Object)
			System.out.println("Object instance");

		People p1 = new People();
		People pm = new Male();
		People pf = new Female();
		p1.showInfo();
		pm.showInfo();
		pf.showInfo();

		People[] pArr = new People[3];
		pArr[0] = new People();
		pArr[1] = new Male();
		pArr[2] = new Female();

		for (int i = 0; i < pArr.length; i++) {
			pArr[i].showInfo();
		}
		
		whoAreYou(p1);
		whoAreYou(pm);
		whoAreYou(pf);
	
//		Male m1 = (Male) new People();
//		Female f1 = (Female) new Book();
//		m1.showInfo();
		People p2 = new Male();
		Male m2 = (Male)p2;
		m2.showInfo();
	
	}

	public static void whoAreYou(People p) {
		p.setName("ㅅㅁ");
		p.showInfo();
	}
}

