package com.javacode.qspider_assignment.day15_Increment_Decrement;

public class IncrementOperator {
    public static void main(String[] args) {
        int c = 3;
        System.out.println(c + c++ + c++ + c);
//        3 + 3(4) + 4(5) + 5);
        System.out.println(c++ + c + c++);
//        3(4) + 4 + 4
        System.out.println(c++ + c++ + c++ + c - c++);
//        3(4) + 4(5) + 5(6) + 6 - 6(7) = 12
        int d = c++; // c = 3(4) --> Next time the value of c will be 4.
        System.out.println(c + d);
//        c = 4, d = 3
        int e = d++; // d = 3(4) and e = 3
        System.out.println(c++ + d++ + e++);
//        4 + 4 + 3(4) = 11
    }
}
