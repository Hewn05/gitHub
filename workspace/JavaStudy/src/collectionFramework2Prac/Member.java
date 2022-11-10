package collectionFramework2Prac;

public class Member implements Comparable<Member> {
	private Integer memberID;
	private String memberName;
	private Integer memberAge;

	public Member(int memberID, String memberName, int memberAge) {
		this.memberID = memberID;
		this.memberName = memberName;
		this.memberAge = memberAge;
	}

	public int hashCode(Object obj) {
		return memberID.hashCode();
	}

	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			return ((Member) obj).getMemberID() == this.memberID;
		} else
			return false;
	}

	public int compareTo(Member mem) {
		return (this.memberID.compareTo(mem.getMemberID()));
//		return (this.name.compareTo(mem.getmemberName()));
//		return (this.age.compareTo(mem.getmemberAge()));
	}
	
	public String toString() {
		return String.format("||ID:%4s||이름:%4s||나이:%3s||", memberID, memberName, memberAge);
	}

	public Integer getMemberID() {
		return memberID;
	}

	public String getmemberName() {
		return memberName;
	}

	public Integer getmemberAge() {
		return memberAge;
	}

	public void setMemberID(Integer memberID) {
		this.memberID = memberID;
	}

	public void setmemberName(String memberName) {
		this.memberName = memberName;
	}

	public void setmemberAge(Integer memberAge) {
		this.memberAge = memberAge;
	}
}