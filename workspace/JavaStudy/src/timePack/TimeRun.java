package timePack;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.Locale;

public class TimeRun {

	public static void main(String[] args) {
		// java.time
		// LoacalDate, LocalTime, LocalDateTime
		// ZonedDateTime
		// Period(날짜 차이), Duration(시간 차이)

		LocalDate date = LocalDate.now();
		LocalTime time = LocalTime.now();
		LocalDateTime dateTime = LocalDateTime.now();
		ZonedDateTime zonedDateTime = ZonedDateTime.now();
		date = LocalDate.of(2022, 8, 4);
//		time = LocalTime.of(12, 11, 30);
		dateTime = LocalDateTime.of(date, time);
		zonedDateTime = ZonedDateTime.of(dateTime, ZoneId.of("America/New_York"));

		System.out.println(date);
		System.out.println(time);
		System.out.println(dateTime);
		System.out.println(zonedDateTime);

		System.out.println(date.getYear());
		System.out.println(date.getMonthValue());
		System.out.println(date.getMonth());
		System.out.println(date.getDayOfMonth());
		System.out.println(date.getDayOfYear());
		System.out.println(date.getDayOfWeek());
		System.out.println(date.getDayOfWeek().getValue());
		System.out.println(date.lengthOfMonth());
		System.out.println(date.lengthOfYear());
		System.out.println(date.isLeapYear());

		System.out.println(time.getHour());
		System.out.println(time.getMinute());
		System.out.println(time.getSecond());
		System.out.println(time.getNano());

		System.out.println(date.withYear(2002));
		System.out.println(date.withMonth(12));
		System.out.println(date.withDayOfMonth(25));
		System.out.println(date.withDayOfYear(120));

		System.out.println(time.withHour(1));
		System.out.println(time.withMinute(30));
		System.out.println(time.withSecond(30));
		System.out.println(time.withNano(1234));

		LocalDate date2 = date.withYear(2002);
		System.out.println(date2);
		System.out.println(date2.plusYears(20));
		System.out.println(date2.plusWeeks(1));
		System.out.println(date2.plusMonths(5));
		System.out.println(date2.plusDays(7));
		System.out.println(date2.minusYears(2));
		System.out.println(date2.minusWeeks(1));
		System.out.println(date2.minusMonths(2));
		System.out.println(date2.minusDays(7));

		LocalTime time2 = LocalTime.now();
		String sAmpm;
		if (time2.get(ChronoField.AMPM_OF_DAY) == 0) {
			sAmpm = "오전";
		} else {
			sAmpm = "오후";
		}
		System.out.println(
				"지금은 " + sAmpm + " " + time2.getHour() + "시 / " + time2.get(ChronoField.HOUR_OF_AMPM) + "시 입니다.");

		System.out.println(dateTime.get(ChronoField.YEAR));
		System.out.println(dateTime.get(ChronoField.MONTH_OF_YEAR));
		System.out.println(dateTime.get(ChronoField.DAY_OF_MONTH));
		System.out.println(dateTime.get(ChronoField.DAY_OF_WEEK)); // 월 1 ~ 일 7
		System.out.println(dateTime.get(ChronoField.AMPM_OF_DAY));
		System.out.println(dateTime.get(ChronoField.HOUR_OF_DAY)); // 24
		System.out.println(dateTime.get(ChronoField.CLOCK_HOUR_OF_DAY));// 12
		System.out.println(dateTime.get(ChronoField.HOUR_OF_AMPM));
		System.out.println(dateTime.get(ChronoField.CLOCK_HOUR_OF_AMPM));
		System.out.println(dateTime.get(ChronoField.MINUTE_OF_HOUR));
		System.out.println(dateTime.get(ChronoField.SECOND_OF_MINUTE));
		System.out.println(dateTime.get(ChronoField.DAY_OF_YEAR));

		// isAfter() isBefore() isEqual();
		LocalDate date3 = LocalDate.of(2015, 05, 15);
		LocalDate date4 = LocalDate.of(2015, 05, 15);

		System.out.println(date3.isAfter(date4));
		System.out.println(date3.isBefore(date4));
		System.out.println(date3.isEqual(date4));

		LocalTime time3 = LocalTime.of(15, 30, 30);
		LocalDateTime dateTime2 = LocalDateTime.of(date3, time3);
		System.out.println(dateTime2);
		LocalDateTime dateTime3 = date3.atTime(time3);
		System.out.println(dateTime3);
		LocalDateTime dateTime4 = time3.atDate(date3);
		System.out.println(dateTime4);

		LocalDate date5 = dateTime4.toLocalDate();
		LocalTime time5 = dateTime4.toLocalTime();
		System.out.println(date5);
		System.out.println(time5);

		LocalDate d = LocalDate.now();
		System.out.println(d);
		LocalDate nextYear = d.with(TemporalAdjusters.firstDayOfNextYear());
		System.out.println(nextYear);
		LocalDate nextMon = d.with(TemporalAdjusters.firstDayOfNextMonth());
		System.out.println(nextMon);
		LocalDate nextMon2 = d.with(TemporalAdjusters.lastDayOfMonth());
		System.out.println(nextMon2);
		LocalDate dow = d.with(TemporalAdjusters.firstInMonth(DayOfWeek.THURSDAY));
		System.out.println(dow);
		LocalDate dow2 = d.with(TemporalAdjusters.lastInMonth(DayOfWeek.THURSDAY));
		System.out.println(dow2);
		LocalDate dow3 = d.with(TemporalAdjusters.previous(DayOfWeek.THURSDAY));
		System.out.println(dow3);
		LocalDate dow4 = d.with(TemporalAdjusters.previousOrSame(DayOfWeek.THURSDAY));
		System.out.println(dow4);
		LocalDate dow5 = d.with(TemporalAdjusters.next(DayOfWeek.THURSDAY));
		System.out.println(dow5);
		LocalDate dow6 = d.with(TemporalAdjusters.dayOfWeekInMonth(3, DayOfWeek.THURSDAY));
		System.out.println(dow6);

		LocalDate lDate1 = LocalDate.of(2002, 7, 6);
		LocalDate lDate2 = LocalDate.of(2018, 7, 7);
		LocalTime lTime1 = LocalTime.of(8, 30, 12);
		LocalTime lTime2 = LocalTime.of(12, 16, 22);

		Period pe = Period.between(lDate1, lDate2);
		Duration du = Duration.between(lTime1, lTime2);

		System.out.println(pe.getYears());
		System.out.println(pe.getMonths());
		System.out.println(pe.getDays());

		System.out.println(du.getSeconds());
		LocalTime se = LocalTime.of(0, 0).plusSeconds(du.getSeconds());
		System.out.println(se);

		System.out.println(se.getHour());
		System.out.println(se.getMinute());
		System.out.println(se.getSecond());

		Period pe2 = lDate1.until(lDate2);
		System.out.println(pe2.getYears());
		System.out.println(pe2.getMonths());
		System.out.println(pe2.getDays());
		System.out.println(lDate1.until(lDate2, ChronoUnit.YEARS));
		System.out.println(lTime1.until(lTime2, ChronoUnit.HOURS));
	
		System.out.println(pe);
		
		LocalDateTime ldt = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 E요일 a HH시mm분").withLocale(Locale.forLanguageTag("fr"));
		System.out.println(ldt.format(formatter));
		
		
	}
}

