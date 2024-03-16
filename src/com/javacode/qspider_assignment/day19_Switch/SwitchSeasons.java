package com.javacode.qspider_assignment.day19_Switch;
import java.util.Scanner;
public class SwitchSeasons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a month : ");
        String month = sc.next().toUpperCase();
        switch (month){
            case "OCT":
            case "NOV":
            case "DEC":
            case "JAN":
                System.out.println(month + " it's winter.");break;
            case "FEB":
            case "MAR":
            case "APR":
            case "MAY":
                System.out.println(month + " it's summer.");break;
            case "JUN":
            case "JUL":
            case "AUG":
            case "SEP":
                System.out.println(month + " it's rainy.");break;
            default:
                System.out.println("Invalid Input");
        }
    }
}
