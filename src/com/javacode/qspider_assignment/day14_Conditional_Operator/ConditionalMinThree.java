package com.javacode.qspider_assignment.day14_Conditional_Operator;
import java.util.Scanner;
public class ConditionalMinThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter third number: ");
        int num3 = sc.nextInt();
        System.out.println("Min value among the three is: " + ((num1<num2)? (num1 < num3? num1: num3): (num2 < num3? num2: num3)));
    }
}
