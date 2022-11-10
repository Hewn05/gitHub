package control;

import java.time.LocalDate;

public class ConditionalPrac {

	public static void main(String[] args) {
		LocalDate now = LocalDate.now();
		String dayOfWeek = now.getDayOfWeek().toString();
		int dayOfWeekValue = now.getDayOfWeek().getValue();
		System.out.println(dayOfWeek);
		System.out.println(dayOfWeekValue);

		String str = "";
		
		
		
		switch (dayOfWeekValue) {

			case 1:
			case 2:
			case 3:
			case 4:
				str = "주말X평일";
				break;
	
			case 5:
				str = "불금";
				break;
	
			case 6:
			case 7:
				str = "주말";
				break;
	
			default:
				str = "에러";
				break;
		}

		System.out.println(str + "입니다.");

	}

}