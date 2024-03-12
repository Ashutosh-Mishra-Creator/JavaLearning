/*
Write a program that converts pounds into kilograms.
The program prompts the user to enter a number in pounds,
converts it into kilograms, and display the result. One pound is 0.454 kilograms.

Here is a sample run:

Enter a number in pounds: 55.5
55.5 pounds is 25.197 kilograms
*/
package com.javacode.qspider_assignment.day11;

import java.util.Scanner;

class PoundsIntoKilogram{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number into pounds :");
		float pounds = sc.nextFloat();
		float onePoundInKilogram = 0.454f;
		float poundInKilogram = pounds * onePoundInKilogram;
		System.out.println(pounds + " pounds is " + poundInKilogram + " kilograms");
	}
}