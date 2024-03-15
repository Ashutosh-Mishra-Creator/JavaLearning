package com.javacode.qspider_assignment.day17_if_else_Assignment;

import java.util.Scanner;

public class TargetSalaryHike {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your salary : ");
        int salary = sc.nextInt();
        System.out.print("Enter your monthly target score : ");
        byte targetScore = sc.nextByte();
        if (targetScore > 90) {
            System.out.println("Rs " + (salary + salary*0.03) + " has been credited into your account");
        } else {
            System.out.println("Rs " + (salary + salary*0.01) + " has been credited into your account");
        }
    }
}