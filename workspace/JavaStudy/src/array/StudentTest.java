package array;

public class StudentTest {

	public static void main(String[] args) {
        Student studentLee = new Student("이순신",2);
        studentLee.addSubject("국어", 100);
        studentLee.addSubject("영어", 50);
        
        Student studentKim = new Student("김구",3);
        studentKim.addSubject("국어", 100);
        studentKim.addSubject("수학", 85);
        studentKim.addSubject("과학", 80);
        System.out.println("================================");
        System.out.println("=           성적출력              =");
        System.out.println("================================");
        studentLee.showStudentInfo();
        System.out.println("================================");
        studentKim.showStudentInfo();
	}

}
