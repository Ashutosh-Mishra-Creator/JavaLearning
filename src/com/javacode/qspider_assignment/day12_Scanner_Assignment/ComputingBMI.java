package com.javacode.qspider_assignment.day12_Scanner_Assignment;

import java.util.Scanner;
public class ComputingBMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter weight in pounds : ");
        float weightPound = sc.nextFloat();
        System.out.print("Enter height in inches : ");
        float heightInch = sc.nextFloat();
        float weightKilogram = (float) ( weightPound * 0.45359237);
        float heightMeter = (float) (heightInch * 0.0254);
        float bmi = (float)(weightKilogram / (Math.pow(heightMeter, 2)));
        System.out.println("BMI is " + bmi);
    }
}
