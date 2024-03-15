package com.javacode.qspider_assignment.day12_Scanner_Assignment;
import java.util.Scanner;
public class CalculatingEnergy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount of water in kilogram : ");
        float water = sc.nextFloat();
        System.out.print("Enter the initial temperature : ");
        float initTemp = sc.nextFloat();
        System.out.print("Enter the final temperature : ");
        float finalTemp = sc.nextFloat();
        float energy = water * (finalTemp - initTemp) * 4184;
        System.out.print("The energy needed is : " + energy);
    }
    }
