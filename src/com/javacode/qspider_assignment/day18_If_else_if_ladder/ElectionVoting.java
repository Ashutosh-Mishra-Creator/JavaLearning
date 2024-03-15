package com.javacode.qspider_assignment.day18_If_else_if_ladder;

import java.util.Scanner;
public class ElectionVoting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age : ");
        byte age = sc.nextByte();
        if( age > 11 && age < 18){
            System.out.println("You are not eligible, come after " + (18-age) + " years.");
        } else if (age >= 18 && age < 81) {
            System.out.println("Do you have voter id (yes/no) : ");
            String voterId = sc.next().toLowerCase();
            if(voterId.equals("yes")){
                System.out.println("********* WELCOME *********");
                System.out.println("1. BJP");
                System.out.println("2. Congress");
                System.out.println("3. AAP");
                System.out.println("4. MNS");
                System.out.println("5. ShivSena");
                System.out.println("6. NCP");
                System.out.println("7. NOTA");

                System.out.println("Enter the option to vote for your favorite party : ");
                String vote = sc.next().toUpperCase();
                if (vote.equals("BJP")){
                    System.out.println("You have voted for "+ vote);
                } else if (vote.equals("CONGRESS")) {
                    System.out.println("You have voted for "+ vote);
                } else if (vote.equals("AAP")) {
                    System.out.println("You have voted for "+ vote);
                } else if (vote.equals("MNS")) {
                    System.out.println("You have voted for "+ vote);
                } else if (vote.equals("SHIVSENA")) {
                    System.out.println("You have voted for "+ vote);
                } else if (vote.equals("NCP")) {
                    System.out.println("You have voted for "+ vote);
                } else if (vote.equals("NOTA")) {
                    System.out.println("Thank you for wasting your vote");
                } else {
                    System.out.println("Invalid Input");
                }
            } else {
                System.out.println("Jaldi yaha se hato");
            }

        } else if (age > 80 && age < 101) {
            System.out.println("You are not eligible to vote");
        } else {
            System.out.println("You are out of this world");
        }

    }
}
