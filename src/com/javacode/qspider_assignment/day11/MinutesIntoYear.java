/*
Write a program to the user to enter the minutes
(e.g., 1 billion), and display the number of years 
and days for the minutes. For simplicity, assume a year has 365 days.

Here is a sample run:

Enter a number of minutes: 1000000000
1000000000 minutes is approximately 1902 years and 214 days.
*/
package com.javacode.qspider_assignment.day11;

import java.util.Scanner;

class MinutesIntoYear{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number in minutes: ");
		float minutes = sc.nextFloat();
		float noOfDays = minutes / 1440;
		int noOfDaysWhole = (int) noOfDays;
		int noOfYears = noOfDaysWhole / 365;
		int noOfDaysLeft = noOfDaysWhole - (noOfYears * 365);
		System.out.println(minutes + " minutes is approximately " + noOfYears + " years " + noOfDaysLeft + " days");
	}
}
