package cooperation;

public class TakeTrans {

	public static void main(String[] args) {
		Passenger kim = new Passenger("김범수", 9000);
		Passenger na = new Passenger("나얼", 12000);
		Bus bus122 = new Bus(122);
		Subway subway2 = new Subway(2);
		Bus bus233 = new Bus(233);
		
		kim.takeBus(bus122);
		na.takeSubway(subway2);
		kim.takeTrans(bus233,1200);
		na.takeTrans(subway2,1500);
		
		kim.showInfo();
		na.showInfo();
		bus122.showInfo();
		subway2.showInfo();
		bus233.showInfo();
	}

}
