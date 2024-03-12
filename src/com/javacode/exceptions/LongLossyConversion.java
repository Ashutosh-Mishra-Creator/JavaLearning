package com.javacode.exceptions;

public class LongLossyConversion {
    public static void main(String[] args) {
        int a = 12345678901; // error: integer number too large
        int b = 12345678901l; // error: incompatible types: possible lossy conversion from long to int
        long c = 1234567890;
        long d = 12345678901L;
        long e = 9223372036854775807L;
        long f = -9223372036854775808L;
        long g = 1234567890123456789L;
        long h = 12345678901234567890L; // error: integer number too large
    }
}