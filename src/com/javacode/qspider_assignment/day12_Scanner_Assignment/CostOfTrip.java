package com.javacode.qspider_assignment.day12_Scanner_Assignment;

import java.util.Scanner;
public class CostOfTrip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the driving Distance : ");
        float miles = sc.nextFloat();
        System.out.print("Enter miles per gallon : ");
        float milesPerGallon = sc.nextFloat();
        System.out.print("Enter price per gallon : ");
        float pricePerGallon = sc.nextFloat();
        float cost = (miles / milesPerGallon) * pricePerGallon;
        System.out.print("The cost of driving is : $");
        System.out.printf("%.2f", cost);;
    }
}