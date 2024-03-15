package com.javacode.qspider_assignment.day8_Global_Local;

public class LocalVariableExample2 {
    public static void main(String[] args) {
        int a;
        int b;

        if(true){
            a = 10;
        }
        else {
            b = 20;
        }
//        System.out.println("b : " + b); // java: variable b might not have been initialized
        System.out.println("a : " + a);
    }
}
