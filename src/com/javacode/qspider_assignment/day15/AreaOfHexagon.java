package com.javacode.qspider_assignment.day15;

import java.util.Scanner;
public class AreaOfHexagon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side : ");
        float s = sc.nextFloat();
        float area = (float) (3 * (Math.pow(3, 0.5) / 2) * Math.pow(s, 2));
        System.out.println("The area of the hexagon is : " + area);
    }
}
