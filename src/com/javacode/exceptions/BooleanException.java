package com.javacode.exceptions;

public class BooleanException {
    public static void main(String[] args) {
        boolean a = true;
        System.out.println(a);
        boolean b = "true"; // error: incompatible types: String cannot be converted to boolean
        System.out.println(b);
        boolean c = 'true'; // error: unclosed character literal, can't store string literals into single quotes.
        System.out.println(c);
        boolean d = 0; // error: incompatible types: int cannot be converted to boolean
        boolean e = '0'; // error: incompatible types: char cannot be converted to boolean
        System.out.println(d);
        System.out.println(e);
    }
}
