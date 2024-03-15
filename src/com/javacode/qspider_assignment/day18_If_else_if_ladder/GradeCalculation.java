package com.javacode.qspider_assignment.day18_If_else_if_ladder;

import java.util.Scanner;
public class GradeCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your percentage : ");
        byte percentage = sc.nextByte();
        if(percentage >= 0 && percentage <= 35){
            System.out.println("Abe! nalle jake padhai likhai kar, IAS - IPS ban!");
        } else if (percentage > 35 && percentage <= 60) {
            System.out.println("Grade : B");
        } else if (percentage > 60 && percentage <= 75) {
            System.out.println("Grade : A");
        } else if (percentage > 75 && percentage <= 90) {
            System.out.println("Grade : A+");
        } else if (percentage > 90 && percentage <= 100) {
            System.out.println("Grade : O (Outstanding!, adbhud, avishvasniya, akalpaniya)");
        }
    }
}
