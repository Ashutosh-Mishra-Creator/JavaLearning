package com.javacode.qspider_assignment.day14_Conditional_Operator;

import java.util.Scanner;

class ConditionalOperator{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the num: ");
		int num = sc.nextInt();
		System.out.println((num%2 == 0)? num + " Number is even": num + " Number is odd");
	}

	public static class ConditionalEvenOdd {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter a number: ");
			int num = sc.nextInt();
			System.out.println((num % 2 == 0) ? num + " Number is even": num + "Number is odd");
		}
	}
}