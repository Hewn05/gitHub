package calendarPrac;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class CalendarRun {

	public static void main(String[] args) {

		Calendar cal = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();
		Calendar cal3 = Calendar.getInstance();

		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH)); // 0-11
		System.out.println(cal.get(Calendar.JANUARY));
		System.out.println(cal.get(Calendar.DATE));
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		System.out.println(Calendar.DAY_OF_WEEK);
		System.out.println(Calendar.THURSDAY);
		System.out.print(cal.get(Calendar.HOUR) + "시 ");
		System.out.print(cal.get(Calendar.MINUTE) + "분 ");
		System.out.println(cal.get(Calendar.SECOND) + "초");
		System.out.println(cal.get(Calendar.AM_PM) + " adfadsf");
		System.out.println(cal.get(Calendar.AM));
		System.out.println(cal.get(Calendar.PM));
		System.out.println(Calendar.PM);

		System.out.println(cal.getTime());
		cal.add(Calendar.MINUTE, 5);
		System.out.println(cal.getTime());

		cal2.set(1997, 0, 11);
		System.out.println(cal2.getTime());

		cal3.set(2022, 7, 3);
		System.out.println(cal3.getTime());

		System.out.println(cal2.before(cal3));
		System.out.println(cal2.after(cal3));

		cal2.add(Calendar.HOUR, 24); // 나머지도 같이 변경
		System.out.println(cal2.getTime());

		cal2.roll(Calendar.HOUR, 24); // 지정 필드만 변경
		System.out.println(cal2.getTime());

		Calendar c = Calendar.getInstance();
		System.out.print(c.get(Calendar.YEAR) + "년 ");
//		System.out.print((c.get(Calendar.MONTH) + 1) + "월 ");
		System.out.printf("%02d월 ",(c.get(Calendar.MONTH)+1));
//		System.out.print(c.get(Calendar.DATE) + "일 ");
		System.out.printf("%02d일 ", c.get(Calendar.DATE));
		int day = c.get(Calendar.DAY_OF_WEEK); 	// String day = "";
		switch (day) {
		case 1:									// case Calendar.MONDAY:
			System.out.print("일요일");
			break;
		case 2:
			System.out.print("월요일");
			break;
		case 3:
			System.out.print("화요일");
			break;
		case 4:
			System.out.print("수요일");
			break;
		case 5:
			System.out.print("목요일");
			break;
		case 6:
			System.out.print("금요일");
			break;
		case 7:
			System.out.print("토요일");
			break;
		}
		if (c.get(Calendar.AM_PM) == 0) {
			System.out.print(" 오전 ");
		} else {
			System.out.print(" 오후 ");
		}
		int hour = c.get(Calendar.HOUR);
		int min = c.get(Calendar.MINUTE);
		int sec = c.get(Calendar.SECOND);

		System.out.printf("%02d:%02d:%02d\n", hour, min, sec);
		
		Date today = new Date();
		SimpleDateFormat format1 = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		SimpleDateFormat format2 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		SimpleDateFormat format3 = new SimpleDateFormat("오늘 날짜 : yy년도 MM월, 현재 시각 hh시 mm분 ss초");
		
		System.out.println("=======================================================");
		System.out.println(today);
		System.out.println(format1.format(today));
		System.out.println(format2.format(today));
		System.out.println(format3.format(today));
		
		Calendar calendar1 = Calendar.getInstance();
		SimpleDateFormat format = new SimpleDateFormat();
		
		format.applyPattern("yyyy-MM-dd");
		System.out.println(format.format(calendar1.getTime()));
		
		format.applyPattern("yyyy년 MM월 dd일 h시 m분 s초");
		System.out.println(format.format(calendar1.getTime()));
		
		SimpleDateFormat format5 = new SimpleDateFormat("EEE MMM dd E a HH:ss zzz yyyy", Locale.US);
		System.out.println(format5.format(calendar1.getTime()));
		SimpleDateFormat format6 = new SimpleDateFormat("EEE MMM dd E a HH:ss zzz yyyy", Locale.KOREA);
		System.out.println(format6.format(calendar1.getTime()));
		
	}
	
}
