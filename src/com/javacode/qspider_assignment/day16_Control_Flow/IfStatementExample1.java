package com.javacode.qspider_assignment.day16_Control_Flow;

@SuppressWarnings("ALL")
public class IfStatementExample1 {
    public static void main(String[] args) {

        System.out.println("Execution Starts");
        if (true)
        {
            System.out.println("Hello from \"if\" Block");
        }
        System.out.println("Execution Ends");
        System.out.println("*******************************************************************************");



        System.out.println("Execution Starts");
        if (false)
        {
            System.out.println("Hello from \"if\" Block");
        }
        System.out.println("Execution Ends");
        System.out.println("*******************************************************************************");



        System.out.println("Execution Starts");
        final boolean b = false;
        if(b){
            System.out.println("Hello from \"if\" Block");
        }
        System.out.println("Execution Ends");
        System.out.println("*******************************************************************************");



        System.out.println("Execution Starts");
        if(false)
            System.out.println("Hello from \"if\" Block");
        System.out.println("Execution Ends");
        System.out.println("*******************************************************************************");


/*
        System.out.println("Execution Starts");
        int a;
        if(false)
            a = 10;
        System.out.println("Hello from \"if\" Block");
        System.out.println("Value of a is : " + a);
        System.out.println("*******************************************************************************");
*/


        System.out.println("Execution Starts");
        int c;
        if(true)
            c = 10;
            System.out.println("Hello from \"if\" Block");
        System.out.println("Value of a is : " + c);
        System.out.println("*******************************************************************************");



        if(b){
            System.out.println("Hello from \"if\" Block");
        }

        if(b){

            int ab = 10;
        }
        System.out.println("Hello from \"if\" Block");

//        if(false)
//            int localVariable = 10;
//            System.out.println(localVariable);

        System.out.println("Execution Ends");
    }

}
