package com.javacode.qspider_assignment.day8;

public class ResultantOperandDataType {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = a+b;

        byte d = 1;
        byte e = 2;
        System.out.println("d (byte) = " + d);
        System.out.println("e (byte) = " + e);
//        byte f = d + e;
        int f = d + e;
        long l = a + b;
        System.out.println("f (int) = d + e : "+ f);
        System.out.println("l (long) = a + b : "+ l);
        System.out.println("************************");

        int i = 2147483647;
        int j = 2147483647;
        System.out.println("i (int) = " + i);
        System.out.println("j (int) = " + j);
//        byte k = i + j;
        int m = i + j;
//        int j += 2147483645 ;
//        System.out.println("j (int) = " + j);
//        long n = i + j;
//        float o = i + j;
        long n = (long) i + j;
        float o = (float) i + j;
        System.out.println("m (int) = i + j : "+ m);
        System.out.println("n (long) = i + j : "+ n);
        System.out.println("o (float) = i + j : "+ o);
    }
}
