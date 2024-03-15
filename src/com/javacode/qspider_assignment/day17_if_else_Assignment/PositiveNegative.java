package com.javacode.qspider_assignment.day17_if_else_Assignment;

import java.util.Scanner;
public class PositiveNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        if(num > 0) {
            System.out.println("Positive Value");
        } else {
            System.out.println("Negative Value");
        }
    }
}
