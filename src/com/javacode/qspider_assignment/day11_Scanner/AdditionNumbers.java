package com.javacode.qspider_assignment.day11_Scanner;

import java.util.Scanner;

class AdditionNumbers{
	public static void main(String[] args){
		System.out.print("Enter number 1: ");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();

		System.out.print("Enter number 2: ");
		int num2 = sc.nextInt();
		int addition = num1 + num2;

		System.out.print("Addition of num1 and num2 is: " + addition);
	}
}