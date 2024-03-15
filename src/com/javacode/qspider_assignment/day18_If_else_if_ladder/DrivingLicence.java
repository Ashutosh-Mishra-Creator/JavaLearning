package com.javacode.qspider_assignment.day18_If_else_if_ladder;

import java.util.Scanner;
public class DrivingLicence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = sc.nextInt();

        if ( age >= 18 ){

            System.out.println("How many marks you got in RTO test : ");
            int marks = sc.nextInt();

            if( marks >= 60){
                System.out.println("You are eligible for driving licence");
            } else {
                System.out.println("Re appear for the test again");
            }

        }
        else if ( age < 18 ) {
            System.out.println("You are not eligible, come after " + (18-age) + " years.");
        }
    }
}