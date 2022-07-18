package com.day1.session2.ex7;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import java.util.Date;

public class DateTimeApiJava {

	public static void main(String[] args) {
		//joda data and time : open source sol :)
		//java 8 + joda data and time
		
		
		//Diff of days
		
		
		
		
		
		
		//Period
		
		String dateString="09/11/1975";
		DateTimeFormatter formate=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate date1=LocalDate.parse(dateString, formate);
		LocalDate date2=LocalDate.now();
		Period period=Period.between(date1, date2);
		System.out.println(period.getDays());
		System.out.println(period.getMonths());
		System.out.println(period.getYears());
		
		//System.out.println(period.get(TemporalUnit.));
		
		long days=ChronoUnit.DAYS.between(date1, date2);
		System.out.println(days);
		
		//diff bw 2 days
		LocalDate date=LocalDate.now();
		System.out.println(date);
		LocalDate date4=date.plus(1, ChronoUnit.DECADES);
		System.out.println(date4);
		
		
		//LocalDate
	
		
//		
//		String dateString="11/11/2011";
//		
//		DateTimeFormatter formate=DateTimeFormatter.ofPattern("dd/MM/yyyy");
//		
//		LocalDate date=LocalDate.parse(dateString, formate);
//	   	System.out.println(date);
	   	
	   	
//		
//		String dateString="2011-02-11";
//		
//		LocalDate date=LocalDate.parse(dateString);
//	   	System.out.println(date);
//	   	
		
//   	LocalDate date=LocalDate.of(2022, Month.JANUARY	, 10);
//   	System.out.println(date);
		
//		LocalDate date=LocalDate.now();
//		System.out.println(date);
//		System.out.println("getDayOfMonth: "+date.getDayOfMonth());
//		System.out.println("getDayOfYear: "+date.getDayOfYear());
//		System.out.println("getMonthValue: "+date.getMonthValue());
	
		
		//LocalDateTime
		//LocalTime
		
		
//		Date date=new Date(13, 11, 12);		mutable
//		System.out.println(date);
	}
}
