package com.excelon.app;

import java.util.Scanner;

public class Condition2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Valid Marks........[0-100]");
		int subject1Marks = s.nextInt();

		if (subject1Marks > 0 && subject1Marks <= 100) {
			if (subject1Marks >= 35)
				if (subject1Marks >= 90) {
					System.out.println("Grade A");
				} else if (subject1Marks > 70 && subject1Marks <= 89) {
					System.out.println("Grade B");
				} else if (subject1Marks > 50 && subject1Marks <= 69) {
					System.out.println("Grade C");
				} else
					System.out.println("PASS");
			else
				System.out.println("FAIL");
		} else {
			System.out.println("Invalid Marks........");
		}
	}
}
