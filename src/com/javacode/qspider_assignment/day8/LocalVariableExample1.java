package com.javacode.qspider_assignment.day8;

public class LocalVariableExample1 {
    public static void main(String[] args) {
        String a = "LOCAL VARIABLE FROM METHOD BLOCK";

        if(true){
            String b = "LOCAL VARIABLE FROM 1st IF BLOCK";
            System.out.println("a : " + b);
            System.out.println("b : " + b);
        }

        if(true){
            int c = 10;
            System.out.println("c : " + c);
            System.out.println("a : " + a);
//            System.out.println("b : " + b); // java: cannot find symbol: variable b
        }
    }
}
