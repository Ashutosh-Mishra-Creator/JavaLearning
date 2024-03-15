package com.javacode.qspider_assignment.day14_Conditional_Operator;
import java.util.Scanner;
public class LargestAmongTwo {
    public static void main(String[] args) {
        System.out.print("Enter first number: ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        // System.out.println((num1 > num2)? num1 + " is biggest value": num2 + " is biggest value ");
        int max = (num1 > num2)? num1 : num2;
//		int min = Math.max(num1, num2);
        System.out.println(num1 +" , "+ num2 + " biggest among 2 number is "+ max);

    }
}
