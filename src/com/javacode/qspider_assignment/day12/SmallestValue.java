package com.javacode.qspider_assignment.day12;

import java.util.Scanner;

class SmallestValue{
	public static void main(String[] args) {
		System.out.print("Enter first number: ");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		System.out.print("Enter second number: ");
		int num2 = sc.nextInt();
		// System.out.println((num1 > num2)? num2 + " is smallest value": num1 + " is smallest value ");
		int min = (num1 > num2)? num2 : num1;
		System.out.println(num1 +" , "+ num2 + " smallest among 2 number is "+ min);

	}
}