package com.javacode.qspider_assignment.day18_If_else_if_ladder;

@SuppressWarnings("ALL")
public class IfElseIfLadder {
    public static void main(String[] args) {

        if(false){
            System.out.println("Hi from if block");
        }
        else if(!true){
            System.out.println("Hi from else if block 1");
        }
        else if(false){
            System.out.println("Hi from else if block 2");
        }
        else {
            System.out.println("HI FROM ELSE BLOCK");
        }
        System.out.println("*******************************************************************************");


        if(false){
            System.out.println("Hi from if block");
        }
        else if(!true){
            System.out.println("Hi from else if block 1");
        }
        else if(false){
            System.out.println("Hi from else if block 2");
        }
        System.out.println("*******************************************************************************");


        if(true){
            System.out.println("Hi from if block");
        }
        else if(true){
            System.out.println("Hi from else if block 1");
        }
        else if(true){
            System.out.println("Hi from else if block 2");
        }
        System.out.println("*******************************************************************************");


        if(true)
            System.out.println("Hi from if block");
        else if(true)
            System.out.println("Hi from else if block 1");
        else if(true)
            System.out.println("Hi from else if block 2");
        else
            System.out.println("HELLO FROM ELSE BLOCK");
    }
}
