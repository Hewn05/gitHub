package classPrac;

class Birthday {
	private int date;
	private int month;
	private int year;

	public Birthday() {
		this(1990, 1, 1);
	}

	public Birthday(int year, int month, int date) {
		this.year = year;
		this.month = month;
		this.date = date;
	}
	
	public int getDate() {
		return date;
	}
	
	public int getMonth() {
		return month;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setDate(int date) {
		this.date = date;
	}
	
	public void setMonth(int month) {
		this.month = month;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public String toString() {
		return year + "년" + month + "월" + date + "일";
	}

	public Birthday returnSelf() {
		return this;
	}
}

public class BirthExam {
	public static void main(String[] args) {
		Birthday bDay1 = new Birthday(1997, 1, 11);
		Birthday bDay2 = new Birthday();
		System.out.println(bDay1);
		System.out.println(bDay2);
	}
}
