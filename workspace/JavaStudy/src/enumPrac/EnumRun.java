package enumPrac;

import java.util.*;

enum DayOfWeek {
	Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday
}

enum CoffeeType {
	Americano, IcedAmericano, CafeLatte
}

enum Week {
	Sunday("sun", 11), Monday("mon", 22), Tuesday("tue", 33), Wednesday("wed", 44), Thursday("thu", 55),
	Friday("fri", 66), Saturday("sat", 77);

	private final String name;
	private final int ord;

	private Week(String name, int ord) {
		this.name = name;
		this.ord = ord;
	}

	public String getName() {
		return this.name;
	}

	public int getOrd() {
		return this.ord;
	}
}

public class EnumRun {
	enum Season {
		봄, 여름, 가을, 겨울
	};

	public DayOfWeek today;

	static void printCoffeePrice(CoffeeType type) {
		HashMap<CoffeeType, Integer> priceMap = new HashMap<>();
		priceMap.put(CoffeeType.Americano, 3000);
		priceMap.put(CoffeeType.IcedAmericano, 4000);
		priceMap.put(CoffeeType.CafeLatte, 5000);
		int price = priceMap.get(type);
		System.out.println(String.format("%s의 가격은 %d원 입니다.", type, price));
	}

	public static void main(String[] args) {
		System.out.println(DayOfWeek.Sunday);
		Calendar cal = Calendar.getInstance();
		int weeks = cal.get(Calendar.DAY_OF_WEEK);
		Season season = Season.가을;
		System.out.println(weeks);

		EnumRun er = new EnumRun();
		er.today = DayOfWeek.Friday;

		System.out.println(er.today);

		for (DayOfWeek day : DayOfWeek.values()) {
			System.out.print(day);
		}
		System.out.println();

		System.out.println(season.ordinal());
		System.out.println(Season.valueOf("가을"));
		System.out.println(season.name());

		Season season2 = Season.겨울;
		System.out.println(season.compareTo(season2));
		System.out.println(season2.compareTo(season));

		for (Week week : Week.values()) {
			System.out.println(week);
			System.out.println(week.getName());
			System.out.println(week.getOrd());
			System.out.println(week.ordinal());
		}
		System.out.println(Week.valueOf("Friday"));

		printCoffeePrice(CoffeeType.Americano);
	}

}
