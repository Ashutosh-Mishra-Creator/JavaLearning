package com.javacode.qspider_assignment.day13;

public class IncrementOperator3 {
    public static void main(String[] args) {
//        int a = 2; // a = 2
//        int b = ++a; // b = 3, a = 3
//        int c = b++; // c = 3, b = 3(4)
//        System.out.println(a + b + c);
        // 3 + 4 + 3 = 10
//        int a = 2;
//        int b = a--; // a = 2(1), b = 2
//        int c = ++a; // a = 1 + 1 = 2, c = 2
//        System.out.println(a + b + c);
        // 2 + 2 + 2 = 6
//        int a = 4;
//        System.out.println(++a + a-- + a++ + --a);
        // (4 + 1)5 + 5(4) + 4(5) + (5-1)4 = 18
//        int a = 3;
//        int b = ++a; // b = 4, a = 4
//        int c = --b; // c = 3, b = 3
//        System.out.println(++a + a-- + b-- + --c);
        // (4+1)5 + 5(4) + 3(2) + 2(3-1) = 15
//        int a = 'a';// a = 97
//        int b = --a;// b = 96, a = 96
//        int c = 'a';// c = 97
//        System.out.println(a++ + 'a' + --b + --c);
        // 96(97) + 97 + 95 + 96 = 384
        char ch = 'a'; // a
        int a = ++ch;// a = 98, ch = 98
        int b = --ch;// b = 97, ch = 97
        int c = ch++;// c = 97, ch = 97(98)
        System.out.println(ch++ + ++a + b-- + --c + c);
        // 98(99) + 99 + 97 + 96 + 96 = 486
    }
}
