package com.javacode.qspider_assignment.day15;

import  java.util.Scanner;

public class CalculateInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter balance - ");
//        System.out.print(" ");
        int balance = sc.nextInt();
        System.out.print(" and interest rate (e.g. 3 for 3%) - ");
        float interestRate = sc.nextFloat();
        float interest = (float) (balance * (interestRate / 1200));
        System.out.println("The interest is " + interest);

    }
}
