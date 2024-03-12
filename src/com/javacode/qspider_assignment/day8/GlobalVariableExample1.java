package com.javacode.qspider_assignment.day8;

public class GlobalVariableExample1 {
    static int a = 10;
    public static void main(String[] args) {
        System.out.println("(main method) a : " + a);

        if(true){
            System.out.println("(first if) a : " + a);
        }

        if(true){
            System.out.println("(second if) a : " + a);
        }
        method1();
    }

    public static void method1() {
        System.out.println("(second method) a : " + a);
    }

}
