package com.javacode.qspider_assignment.day12_Scanner_Assignment;

import java.util.Scanner;
public class RunwayLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter speed and acceleration : ");
        float speed = sc.nextFloat();
//        System.out.print(" ");
        float acceleration = sc.nextFloat();
        float runwayLength = (float) ((Math.pow(speed, 2)) / (2 * acceleration));
        System.out.println("the minimum runway length for this airplane is : " + runwayLength);
    }

}
