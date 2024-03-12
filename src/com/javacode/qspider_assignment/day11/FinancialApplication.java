/* Write a program that reads the subtotal and the gratuity rate, then computes the gratuity and total.
For example, if the user enters 10 for subtotal and 15 % for the gratuity rate,
the program displays dollar 1.5 as the gratuity and dollar 11.5 as total. Here is a sample run:

Enter the subtotal 10 and a tip rate 15

the tip is 1.5 and the total 11.5
*/
package com.javacode.qspider_assignment.day11;

import java.util.Scanner;
class FinancialApplication{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your subtotal value :");
		int subtotal = sc.nextInt();
		System.out.print("Enter your gratuity rate :");
		float tipRate = sc.nextInt() / 100f;
		System.out.println("Your tipRate :"+ tipRate);
		float tip = tipRate * subtotal;
		System.out.println("The tip is :" + tip);
		double total = subtotal + tip;
		System.out.print("In total you have to pay :" + total);
	}
}