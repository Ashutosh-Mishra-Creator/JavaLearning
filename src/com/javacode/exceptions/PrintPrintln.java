package com.javacode.exceptions;

class PrintPrintln {
    public static void main(String[] args) {
        System.out.print("1 ");
        System.out.print("2");
        System.out.println();
        System.out.println("one");
        System.out.println("two");
        System.out.print(); // error: no suitable method found for print(no arguments)
    }
}
