/*
Write a program to find the number is even or odd, without using % operator.
 */
package com.javacode.qspider_assignment.day12;
import java.util.Scanner;
class ConditionalEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println((num / 2) * 2 == num ? "even": "odd");
        System.out.println((num / 2.0) == (num / 2) ? "even": "odd");
    }
}
