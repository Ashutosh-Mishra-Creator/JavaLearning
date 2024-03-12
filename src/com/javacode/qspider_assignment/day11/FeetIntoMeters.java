/* 
Write a program that reads a number in feet, converts it to
meters, and displays the result. One foot is 0.3048 meters.

Here is a sample run.

Enter a value for feet: 16.5
16.5 feet is 5.0292 meters
*/
package com.javacode.qspider_assignment.day11;

import java.util.Scanner;
class FeetIntoMeters{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a value for feet: "); 
		float feet = sc.nextFloat();
		System.out.println(feet);
		float oneFeetInMeters = 0.3048f;
		System.out.println(oneFeetInMeters);
		float FeetInMeters = feet * oneFeetInMeters;
		System.out.print(feet + " feet is " + FeetInMeters + " meters");
	}
}