package com.javacode.qspider_assignment.day17_if_else_Assignment;

import java.util.Objects;
import java.util.Scanner;
public class MarriageEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age : ");
        byte age = sc.nextByte();
        System.out.print("Enter yours property's worth : ");
        int wealth = sc.nextInt();
        System.out.print("Enter your surname : ");
        String surname = sc.next().toUpperCase();
        sc.nextLine();
        /*
        if (age > 20 && (wealth > 999999 || Objects.equals(surname, "AMBANI")) ){
            System.out.println("Yes, you are eligible");
        }else {
            System.out.println("Sorry, to say but you are not eligible");
        }
        */
        if ((age > 20 && wealth > 999999) || (surname.equals("AMBANI"))) {
            System.out.println("Yes, you are eligible");
        } else {
            System.out.println("Sorry, to say but you are not eligible");
        }
    }
}