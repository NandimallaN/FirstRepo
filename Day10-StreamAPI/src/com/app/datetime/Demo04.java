package com.app.datetime;

import java.time.Duration;
import java.time.Instant;

public class Demo04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long i=0;
		Instant  start=Instant.now();
		for ( i= 0; i < 1000000; i++) {
		System.out.println(i);
		}
		System.out.println(i);
		Instant  end=Instant.now();
		long duration=Duration.between(start, end).toSeconds();
		
		System.out.println(duration+" Seconds");

	}

}
