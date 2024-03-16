package com.javacode.qspider_assignment.day19_Switch;
import java.util.Scanner;
public class SwitchCalculator2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the expression (a +/-/*/% b) : ");
        String expression = sc.nextLine();
        char char1 = expression.charAt(0);
        int num1 = (int) char1;
        char op = expression.charAt(2);
        double num2 = expression.charAt(4);
        boolean flag = true;
        double output = 0;

        switch (op){
            case '+': output = num1 + num2; break;
            case '-': output = num1 - num2; break;
            case '*': output = num1 * num2; break;
            case '/': output = num1 / num2; break;
            case '%': output = num1 % num2; break;
        }

        if (flag){
            System.out.println(num1 + " " + op + " " + num2 + " = " + output);
        }
    }
}
