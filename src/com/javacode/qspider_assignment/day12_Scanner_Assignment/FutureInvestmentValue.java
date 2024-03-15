package com.javacode.qspider_assignment.day12_Scanner_Assignment;

import java.util.Scanner;
public class FutureInvestmentValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter investment amount : ");
        float amount = sc.nextFloat();
        System.out.print("Enter annual interest rate in percentage : ");
        float interest = sc.nextFloat();
        System.out.print("Enter number of years : ");
        byte years = sc.nextByte();
//        float futureInvestmentValue = (float) (amount * Math.pow((1 + (interest/12)), years * 12));
        float futureInvestmentValue = amount + (amount * interest * years) / 100;
        System.out.println("Accumulated value is : $" + futureInvestmentValue);
    }
}
