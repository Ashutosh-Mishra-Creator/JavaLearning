package com.javacode.qspider_assignment.day18_If_else_if_ladder;

import java.util.Scanner;
public class BloodDonation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age : ");
        byte age = sc.nextByte();
        if (age > 20){
            System.out.print("Have you consumed cigarette or alcohol in 24 hrs (yes/no) : ");
            String narcotics = sc.next().toLowerCase();
            if (narcotics.equals("no")){
                System.out.print("Enter your weight : ");
                byte weight = sc.nextByte();
                if ( weight > 50){
                    System.out.println("You are eligible for Blood Donation");
                }
            }
        }
    }
}
