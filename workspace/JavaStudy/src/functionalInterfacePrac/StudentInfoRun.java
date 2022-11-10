package functionalInterfacePrac;

import java.util.function.*;

class Student {
	private String name;
	private String city;
	private Integer age;

	public Student(String name) {
		this.name = name;
	}

	public Student(String name, String city) {
		this(name);
		this.city = city;
	}

	public Student(String name, String city, int age) {
		this(name, city);
		this.age = age;
	}

	public String toString() {
		return String.format("%5s (%6s,%4d) ", name,city,age);
	}

	public String getName() {
		return name;
	}

	public String getCity() {
		return city;
	}

	public Integer getAge() {
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

}

public class StudentInfoRun {

	public static void main(String[] args) {

		Function<String, Student> func1 = Student::new;
		Student stu1 = func1.apply("Sojoo");

		BiFunction<String, String, Student> func2 = Student::new;
		Student stu2 = func2.apply("Makgulri", "Seoul");

		System.out.println(stu1.toString() + "|| " + stu2.toString());

		stu1.setCity("Seoul");
		stu1.setAge(25);
		stu2.setAge(21);
		
		System.out.println(stu1.toString() + "|| " + stu2.toString());

		IntBinaryOperator oper;
		oper = StudentInfoRun::staticSum;
		int nextyearAge = oper.applyAsInt(stu1.getAge(), 1);
		System.out.println(stu1.getName() + "'s next year age:" + nextyearAge);

		StudentInfoRun run = new StudentInfoRun();
		oper = run::instanceSum;
		nextyearAge = oper.applyAsInt(stu2.getAge(), 1);
		System.out.println(stu2.getName() + "'s next year age:" + nextyearAge);

		ToIntBiFunction<String, String> func3 = String::compareTo;
		compareResult(func3.applyAsInt(stu1.getCity(), stu2.getCity()));
	}

	public static int staticSum(int x, int y) {
		return x + y;
	}

	public int instanceSum(int x, int y) {
		return x + y;
	}

	public static void compareResult(int result) {
		if (result == 0) {
			System.out.println("동일한 문자열입니다.");
			return;
		}
		System.out.println("동일하지 않은 문자열입니다.");
	}
}
