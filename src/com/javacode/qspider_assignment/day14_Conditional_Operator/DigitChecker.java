package com.javacode.qspider_assignment.day14_Conditional_Operator;

import java.util.Scanner;
public class DigitChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character : ");
        char ch = sc.next().charAt(0);
        System.out.println((ch >= 48 && ch <= 57)? "It is digit" : "It is not a digit");
    }
}
