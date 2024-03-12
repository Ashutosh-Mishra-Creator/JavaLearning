package com.javacode.exceptions;

class ShortLossyConversion {
    public static void main(String[] args) {
        short a = 127;
        short b = 32767;
        short c = -32768;
        short d = 32768; // java: incompatible types: possible lossy conversion from int to short
        c = c + 1; // java: incompatible types: possible lossy conversion from int to short
        b += 1;
        System.out.println(a);
        System.out.println(b);
    }
}
