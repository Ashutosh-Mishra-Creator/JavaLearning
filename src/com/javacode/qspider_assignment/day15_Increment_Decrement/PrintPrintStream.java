package com.javacode.qspider_assignment.day15_Increment_Decrement;
import java.io.PrintStream;
public class PrintPrintStream {
    public static void main(String[] args) {
        PrintStream out = new PrintStream(System.out);
        out.println("Hello World!");
        byte a = 102;
        out.println(a);
        out.close();
    }
}
