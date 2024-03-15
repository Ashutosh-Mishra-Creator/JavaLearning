package com.javacode.qspider_assignment.day13_Operator;

public class LogicalOperatorExample2 {
    public static void main(String[] args) {
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);
        System.out.println(true || !false);
        System.out.println((true && false) || (true && true));
        System.out.println((true && false) || !false);

    }
}
