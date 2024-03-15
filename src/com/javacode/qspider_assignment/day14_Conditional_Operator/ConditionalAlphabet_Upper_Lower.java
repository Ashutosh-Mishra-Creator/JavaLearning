package com.javacode.qspider_assignment.day14_Conditional_Operator;
import java.util.Scanner;
public class ConditionalAlphabet_Upper_Lower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        System.out.println(((ch >='A'&& ch <= 'Z') || (ch >= 'a' && ch <= 'z'))? ((ch >= 'A' && ch <= 'Z'))?
                "Uppercase Alphabet":"Lowercase Alphabet":"Not an Alphabet");

    }
}
