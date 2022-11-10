package classPrac;

public class Student1 {
	int studentID;
	String studentName;
	String address;
	String gender;

	Subject1 korea;
	Subject1 math;
	Subject1 english;

	public Student1() {
		korea = new Subject1();
		math = new Subject1();
		english = new Subject1();
	}

	public Student1(int id, String name) {
		this();
		studentID = id;
		studentName = name;
	}

	public Student1(int id, String name, String address, String gender) {
		this();
		studentID = id;
		studentName = name;
		this.address = address;
		this.gender = gender;
	}

	public void showStudentInfo() {
		System.out.println(studentID + ", " + studentName + ", " + address + ", " + gender);
	}

	public int getStudentID() {
		return studentID;
	}

	public String getStudentName() {
		return studentName;
	}

	public String getAddress() {
		return address;
	}

	public String getGender() {
		return gender;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	

}
