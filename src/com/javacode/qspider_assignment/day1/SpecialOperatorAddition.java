package com.javacode.qspider_assignment.day1;

public class SpecialOperatorAddition {
    public static void main(String[] args) {
        System.out.println("two" + 1);
        System.out.println(1 + 1 + "2");
        System.out.println(1 + "2" + 3);
        System.out.println(1 + 1 + "3" + 2 + 2);
        System.out.println(1 + 1 + "3" + 2 * 2);
        System.out.println(2 + 2 + "5" + (3 + 3));
//        System.out.println(2 -1 + "2" + 4 - 1);
        /*
        java: bad operand types for binary operator '-'
        first type:  java.lang.String
        second type: int
         */
    }
}
