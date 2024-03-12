package com.javacode.qspider_assignment.day14;

import java.util.Scanner;

public class ConditionalEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println((num % 2 == 0) ? num + " Number is even": num + "Number is odd");
    }
}
