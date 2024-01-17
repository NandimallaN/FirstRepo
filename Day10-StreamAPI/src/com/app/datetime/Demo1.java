package com.app.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Demo1 {

	public static void main(String[] args) {
		
		LocalDate  date=LocalDate.now();
		System.out.println(date.getYear());
		System.out.println(date.now());
		System.out.println(date.getDayOfMonth());
		System.out.println(date.getDayOfYear());
		System.out.println(date.getMonthValue());
		System.out.println(date.plusDays(15));
		
		System.out.println("----------"+date.minusDays(15));
		
	
		
		
		
		
		LocalTime time=LocalTime.now();
		System.out.println(time);
		System.out.println(time.getHour());
		System.out.println(time.getMinute());
		System.out.println(time.getSecond());
		//System.out.println(time.get(null));
		time.plusHours(15);
		
		
		LocalDateTime dateTime=LocalDateTime.now();
		System.out.println(dateTime);
	}

}
