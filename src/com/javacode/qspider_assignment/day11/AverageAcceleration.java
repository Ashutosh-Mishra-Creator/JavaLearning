package com.javacode.qspider_assignment.day11;

import java.util.Scanner;

class AverageAcceleration{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter v0, v1, and t: ");
		float v0 = sc.nextFloat();
		// System.out.print(" ");
		float v1 = sc.nextFloat();
		// System.out.print(" ");
		float t = sc.nextFloat();
		float avgAcceleration = (v1 - v0) / t;
		System.out.println("The average acceleration is " + avgAcceleration);
	}
}