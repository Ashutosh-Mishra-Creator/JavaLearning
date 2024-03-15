package com.javacode.qspider_assignment.day16_Control_Flow;
@SuppressWarnings("All")
public class IfElseStatement {
    public static void main(String[] args) {

        System.out.println("Execution Starts");
        if(false){
            System.out.println("Hi from If Block");
        }else
        {
            System.out.println("Hello from Else Block");
        }
        System.out.println("Execution Ends");
        System.out.println("*******************************************************************************");



        System.out.println("Execution Starts");
        if(true){
            System.out.println("Hi from If Block");
        }else
        {
            System.out.println("Hello from Else Block");
        }
        System.out.println("Execution Ends");
        System.out.println("*******************************************************************************");



        System.out.println("Execution Starts");
        if(false)
            System.out.println("Hi from If Block");
        else
            System.out.println("Hello from Else Block");
        System.out.println("Execution Ends");
        System.out.println("*******************************************************************************");

/*
        System.out.println("Execution Starts");
        int a = 10;
        if(false)
            a = 20;
            System.out.println("Hi from If Block");
        else // here if block not found error will come
            System.out.println("Hello from Else Block");
        System.out.println("Execution Ends");
        System.out.println("*******************************************************************************");

*/
    }
}
