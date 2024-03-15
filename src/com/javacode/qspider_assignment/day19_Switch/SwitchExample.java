package com.javacode.qspider_assignment.day19_Switch;

@SuppressWarnings("ALL")
public class SwitchExample {
    public static void main(String[] args) {
        /*
        switch (var/exp/literals){
            case label1: // statements
            case label1: // statements
            case label1: // statements
            default: // statements
        }
        */

        int a = 4;
        switch (a)
        {
            case 1 : System.out.println("Hi from case 1"); break;
            case 2 : System.out.println("Hi from case 2"); break;
            case 3 : System.out.println("Hi from case 3"); break;
            case 4 : System.out.println("Hi from case 4"); break;
            case 5 : System.out.println("Hi from case 5"); break;
            default: System.out.println("Hi from default block");
        }

        a = 10;
        switch (a)
        {
            case 1 : System.out.println("Hi from case 1"); break;
            case 2 : System.out.println("Hi from case 2"); break;
            case 3 : System.out.println("Hi from case 3"); break;
            case 4 : System.out.println("Hi from case 4"); break;
            case 5 : System.out.println("Hi from case 5"); break;
            default: System.out.println("Hi from default block");
        }

        a = 1;
        switch (a)
        {
            case 1 : System.out.println("Hi from case 1");
            case 2 : System.out.println("Hi from case 2");
            case 3 : System.out.println("Hi from case 3");
            case 4 : System.out.println("Hi from case 4");
            case 5 : System.out.println("Hi from case 5");
            default: System.out.println("Default Block");
        }
        /*
        byte b = 1;
        switch (b){
            case 1 : System.out.println("Hi from case 1");
            case 2 : System.out.println("Hi from case 2");
            case 3 : System.out.println("Hi from case 3");
            case 4 : System.out.println("Hi from case 4");
            case 128 : System.out.println("Hi from case 5"); // loosy conversion from int to byte
            default: System.out.println("Default Block");
        }
        */
        a = 1;
        switch (a + 0){ // byte + int = int
            case 1 : System.out.println("Hi from case 1"); break;
            case 2 : System.out.println("Hi from case 2"); break;
            case 3 : System.out.println("Hi from case 3"); break;
            case 4 : System.out.println("Hi from case 4"); break;
            case 128 : System.out.println("Hi from case 5"); break;
            default: System.out.println("Hi from default block"); break;
        }

        /*
        a = 1;
        switch (a + 0){
            case 1 : System.out.println("Hi from case 1"); break;
            case 2 : System.out.println("Hi from case 2"); break;
            case 'A' : System.out.println("Hi from case 3"); break;
            case 65 : System.out.println("Hi from case 4"); break;
            case 128 : System.out.println("Hi from case 5"); break;
            default: System.out.println("Hi from default block"); break;
        }
        */

        /*
        a = 1;
        switch (a + 0){
            case 1 : System.out.println("Hi from case 1"); break;
            case 'b' : System.out.println("Hi from case 2"); break;
            case "B" : System.out.println("Hi from case 3"); break;
            default: System.out.println("Hi from default block"); break;
        }
        */

        a = 1;
        switch (a + 1){
            case 1 : System.out.println("Hi from case 1"); break;
            case 'b' : System.out.println("Hi from case 2"); break;
            case 'c' : System.out.println("Hi from case 3"); break;
        }

        a = 1;
        switch (a){

        }
    }
}
