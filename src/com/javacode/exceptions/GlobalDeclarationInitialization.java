package com.javacode.exceptions;

public class GlobalDeclarationInitialization {
    static byte a;
    a = 10; // error: <identifier> expected
    // We cannot initialize a global variable (at next line), exactly were it has been declared.
}