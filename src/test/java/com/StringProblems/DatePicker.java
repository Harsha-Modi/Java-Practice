package com.StringProblems;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class DatePicker {

	public static void main(String[] args) {
		
		long today = System.currentTimeMillis();
		System.out.println(today);

		Calendar c = Calendar.getInstance(TimeZone.getDefault());
		System.out.println(c);
		
		int date = c.get(Calendar.DAY_OF_MONTH);
		System.out.println(date);
		int day = c.get(Calendar.DAY_OF_WEEK);
		System.out.println(day);
		
		Date time = c.getTime();
		System.out.println(time);
		
	}

}
