//package com.javacode.exceptions;

class ByteLossyConversion {
    public static void main(String[] args) {
        byte c = 127;
        c = c + 1; // java: incompatible types: possible lossy conversion from int to byte
        c = (byte) (c + 1);
        System.out.println(c);
        c += 1;
        System.out.println(c);
    }
}
