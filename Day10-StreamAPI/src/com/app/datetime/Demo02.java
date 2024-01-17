package com.app.datetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Demo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dateTime="18-01-2024 02:16";
		DateTimeFormatter format=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
		
		
		
		LocalDateTime parseDateTime=LocalDateTime.parse(dateTime,format);
		System.out.println(parseDateTime);

	}

}
