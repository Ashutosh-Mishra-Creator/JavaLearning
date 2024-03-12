package com.javacode.exceptions;

public class FloatLossyConversion {
    public static void main(String[] args) {
        float a = 1234567890;
        float b = 12345678901; // error: integer number too large
        float c = 1234567890123L;
        float d = 12345678901234567890L; // error: integer number too large
        float e = 12345678901234567890f;
        float f = 123456789012345678901234567890123456739f;
        float g = 1234567890123456789012345678901234567840f; // error: floating-point number too large
        float h = 1234567890123456789012345678901234567840d; // error: incompatible types: possible lossy conversion from double to float
        float i = 1.5; // error: incompatible types: possible lossy conversion from double to float
        float j = 1.5f;
    }
}
