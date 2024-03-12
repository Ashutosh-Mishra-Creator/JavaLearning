package com.javacode.exceptions;

public class DoubleLossyConversion {
    public static void main(String[] args) {
        double a = 127;
        double b = 32767;
        double c = 2147483647;
        double d = 12345678901; // error: integer number too large
        double e = 12345678901L;
        double f = 1234f;
        double g = 1.23f;
        double h = 1.0;
    }
}
