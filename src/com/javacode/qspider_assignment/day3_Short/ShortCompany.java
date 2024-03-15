package com.javacode.qspider_assignment.day3_Short;

public class ShortCompany {
    public static void main(String[] args) {
        short employee = 10_000; // _ is ignored by the compiler during compilation
        short laptops = 20_212;
        short cabins = 12_000;
        short minSalary = 25_000;
        short plantation = 15000;
        System.out.println("No. of employees currently working in our organisation: " + employee);
        System.out.println("No. of laptops collectively: " + laptops);
        System.out.println("No. of cabins for employees: " + cabins);
        System.out.println("The minimum salary of an employee is: " + minSalary);
        System.out.println("No. of trees in our compound: " + plantation);
    }
}
