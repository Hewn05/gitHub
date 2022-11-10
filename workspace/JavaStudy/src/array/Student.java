package array;

import java.util.ArrayList;
	
public class Student {
	// 학번출력을 위한 공유값.
	private static int sequentialNum = 1000;    
	int studentID;  // 학번
    String studentName;   // 이름
    int grade; //학년
    ArrayList<Subject> subjectList; // ArrayList 선언하기
    
    public Student() {
    	sequentialNum++;
    	studentID = sequentialNum;
    	subjectList = new ArrayList<>();
    }
    // 매개변수로 이름과 학년을 받는 생성자
    public Student(String studentName, int grade) {
    	this();
    	this.studentName = studentName;
    	this.grade = grade;
    }
    // 학생이 수강하는 과목을 subjectList배열에 하나씩 추가하는 메서드
    public void addSubject(String name, int score) {
    	Subject subject = new Subject();//Subject 객체 생성
    	//과목 이름과 성적 입력
    	subject.setName(name);
    	subject.setScorePoint(score);
    	subjectList.add(subject);//subjectList 객체에 해당 객체 추가
    }
    // 배열 요소 값 출력
    public void showStudentInfo() {
        int total = 0;
        for(Subject s : subjectList) {
            total += s.getScorePoint();
            System.out.println(studentID+"학생 "+studentName+"의 "+s.getName()+" 과목 성적은 "+s.getScorePoint()+"입니다.");
        }
        System.out.println(studentID+"학생 "+studentName+"의 총점은 "+total+" 입니다.");
    }
    public static void showSequentialNumber() {
    	System.out.println(sequentialNum);
    }
}
