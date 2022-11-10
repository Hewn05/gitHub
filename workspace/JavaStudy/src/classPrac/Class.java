package classPrac;


public class Class {	
	
	static int a = 2;

	public static void main(String[] args) {
		Student1 studentA = new Student1();
		studentA.korea.getSubjectName();
		Student1 studentB = new Student1(100, "이순신");
		studentB.korea.getSubjectName();

		studentA.studentID = 100;
		studentA.studentName = "홍길동";
		studentA.address = "서울시 어딘가";
		studentA.gender = "남성";

		studentA.showStudentInfo();

		System.out.println(addInt(10, 20));
		
		printA(true);
		printA(false);
	}

	public static int addInt(int n1, int n2) {
		return n1 + n2;
	}

	public static void printA(boolean stop) {
		if (stop) {
			System.out.println("stop");
			return;
		}
		System.out.println("print:" + a);
	}
}
