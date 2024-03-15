/*
Assume a runner runs 14 kilometers in 45 minutes and 30 seconds. 
Write a program that displays the average speed in miles per hour.

Note: That 1 mile is 1.6 kilometers.
*/
package com.javacode.qspider_assignment.day10_Simple_Assignment;
class MilesPerHour {
	public static void main(String[] args){
		float hours = ((45 * 60) + 30f) / (60 * 60);
		int distance = 14;
		double avgSpeed = ((distance/1.6) / hours );
		System.out.println("Average Speed in miles per hour is " + avgSpeed + " mile/hr");
	}
}