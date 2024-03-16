package com.javacode.qspider_assignment.day19_Switch;
import java.util.Scanner;
public class SwitchCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num 1 : ");
        double num1 = sc.nextDouble();
        System.out.print("Enter the operator : ");
        char operator = sc.next().charAt(0);
        System.out.print("Enter num 2 : ");
        double num2 = sc.nextDouble();

        boolean flag = true;
        double output = 0;

        switch (operator){
            case '+': output = num1 + num2; break;
            case '-': output = num1 - num2; break;
            case '*': output = num1 * num2; break;
            case '/': output = num1 / num2; break;
            case '%': output = num1 % num2; break;
        }

        if (flag){
            System.out.println(num1 + " " + operator + " " + num2 + " = " + output);
        }
    }
}
