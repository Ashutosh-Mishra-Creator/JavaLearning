/*
Write a program that reads an integer between 0 and 1000 
and adds all the digits in the integer. For example, if an integer is
932, the sum of all its digits is 14.

Here is a sample run:

Enter a number between 0 and 1000: 999
The sum of the digits is 27
*/
package com.javacode.qspider_assignment.day11_Scanner;
import java.util.Scanner;
public class SumTheDigits{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 1000: ");
        short num = sc.nextShort();
        short dub = num;
        byte sum = 0;
        while(num > 0){
            short digit = (short) (num % 10);
            sum += (byte) digit;
            num = (short) (num / 10);
        }
        num = dub;
        System.out.println("Sum of digits in " + num + " is " + sum);
    }
}