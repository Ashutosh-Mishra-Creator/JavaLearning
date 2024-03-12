package com.javacode.qspider_assignment.day14;

public class CompoundAssignmentOperator {
    public static void main(String[] args) {
        byte a = 1;
        a += 1;
//        a = a + 1; // java: incompatible types: possible lossy conversion from int to byte
        System.out.println(a);
    }
}
