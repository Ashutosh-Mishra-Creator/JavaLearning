package com.javacode.qspider_assignment.day14_Conditional_Operator;
import java.util.Scanner;
public class ConditionalVowelConsonant {
    public static void main(String[] args) {
        System.out.println("Enter a character : ");
        Scanner sc = new Scanner(System.in);
        String name = sc.next().toLowerCase();
        char ch = name.charAt(0);
        System.out.println((ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')? "it is vowel": "it is consonant");
    }
}
