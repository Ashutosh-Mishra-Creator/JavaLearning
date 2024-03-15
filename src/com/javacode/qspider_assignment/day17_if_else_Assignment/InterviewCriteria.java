package com.javacode.qspider_assignment.day17_if_else_Assignment;
import java.util.Scanner;
public class InterviewCriteria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your college cgpa (percentage) : ");
        float percentage = sc.nextFloat();
        if (percentage > 60 && percentage < 101) {
            System.out.println("You are eligible");
        } else {
            System.out.println("You are not eligible");
        }
    }
}
