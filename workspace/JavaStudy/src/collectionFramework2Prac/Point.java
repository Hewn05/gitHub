package collectionFramework2Prac;

public class Point {
	private int point;
	
	public Point(int point) {
		this.point = point;
	}

	public String toString() {
		return String.format("포인트:%5s||", point);
	}
	
	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}
	
}
