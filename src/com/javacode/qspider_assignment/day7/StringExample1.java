package com.javacode.qspider_assignment.day7;

public class StringExample1 {
    public static void main(String[] args) {
//        Declaration and Initialization
        String a = "Hello";
        System.out.print("a = ");
        System.out.println(a);

        String b = "hello";
        System.out.print("b = ");
        System.out.println(b);

        String c = "hello";
        System.out.print("c = ");
        System.out.println(c);
        System.out.println();

        String d = new String("Hello");
        System.out.print("d (new) = ");
        System.out.println(d);

        String e = new String("Hello");
        System.out.print("e (new) = ");
        System.out.println(e);

        System.out.println("***************************");
//        Utilization
        System.out.print("a == b : ");
        System.out.println(a == b);
        System.out.println();

        System.out.print("b == c : ");
        System.out.println(b == c);
        System.out.println();

        System.out.print("a == d (new) : ");
        System.out.println(a == d);

        System.out.print("a.equals(d) : ");
        System.out.println(a.equals(d));
        System.out.println();

        System.out.print("d (new) == e (new) : ");
        System.out.println(d == e);

        System.out.print("d.equals(e) : ");
        System.out.println(d.equals(e));
    }
}
