package com.javacode.qspider_assignment.day17_if_else_Assignment;

import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        if (num % 2 == 0){
            System.out.println("It is even number");
        } else {
            System.out.println("It is odd number");
        }
    }
}
