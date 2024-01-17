package com.app.datetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Demo03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDateTime mydatetime=LocalDateTime.now();
		System.out.println(mydatetime);
		
		System.out.println("==================");
		DateTimeFormatter format=DateTimeFormatter.ofPattern("dd-MMM-yyyy HH:mm");
		
	String formatDate=mydatetime.format(format);
	System.out.println(formatDate);

	}

}
