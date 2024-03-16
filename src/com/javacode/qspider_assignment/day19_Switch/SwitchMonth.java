package com.javacode.qspider_assignment.day19_Switch;
import java.util.Scanner;
public class SwitchMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a month number : ");
        int monthNum = sc.nextInt();
        String month = null;
        switch (monthNum){
            case 1: month = "January"; break;
            case 2: month = "February"; break;
            case 3: month = "March"; break;
            case 4: month = "April"; break;
            case 5: month = "May"; break;
            case 6: month = "June"; break;
            case 7: month = "July"; break;
            case 8: month = "August"; break;
            case 9: month = "September"; break;
            case 10: month = "October"; break;
            case 11: month = "November"; break;
            case 12: month = "december"; break;
            default:
                System.out.println("Invalid Input");
        }

        System.out.println((month != null)? (month + " is the " + monthNum + "th month"): "");

/*
        if( month != null){
            System.out.println(month + " is the " + monthNum + "th month");
        }
 */

    }
}
