package collectionFrameworkPrac;

public class Member implements Comparable<Member> {
	private Integer memberID;
	private String name;
	private Integer age;

	Member(int id, String name, int age) {
		this.memberID = id;
		this.name = name;
		this.age = age;
	}

	public Integer hashCode(Object obj) {
		return memberID.hashCode();
	}

	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			Member mem = (Member) obj;
			return mem.memberID == memberID;
		} else
			return false;
	}

	public int compareTo(Member mem) {
		return (this.memberID.compareTo(mem.getMemberID()));
//		return (this.name.compareTo(mem.getName()));
//		return (this.age.compareTo(mem.getAge()));
	}

	public Integer getMemberID() {
		return memberID;
	}

	public String getName() {
		return name;
	}

	public Integer getAge() {
		return age;
	}

	public void setMemberID(Integer memberID) {
		this.memberID = memberID;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
}