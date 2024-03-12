package com.javacode.qspider_assignment.day11;

import java.util.Scanner;
public class nextCharAt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st String - ");
        String a = sc.next(); // One word only.
        sc.nextLine();

        System.out.print("Enter 2nd String - ");
        String b = sc.nextLine(); // All the words passes as a sentence.

        System.out.print("Enter a Character - ");
        char ch = sc.next().charAt(5);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("ch = " + ch);
    }
}
