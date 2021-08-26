package com.section7;

public class SwitchDemo {

    public static void main(String[] args) {
        String name = "Allen";

        switch(name){
            case "Ben":
                System.out.println("123");
                break;

            case "Allen":
                System.out.println("223");
                System.out.println("456");
                break;

            default:
                System.out.println("In default block");
                System.out.println("Where are you?");
        }
    }
}
