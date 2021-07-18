package com.section5;

import java.util.Scanner;

public class ReadFromConsole {

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Please, enter any word: ");
//        String word = sc.next();
//        System.out.println("You entered this word: " + word);
//        System.out.print("Please, enter any integer number: ");
//        int i = sc.nextInt();
//        System.out.println("You entered this integer number: " + i);

        Scanner sc = new Scanner(System.in);

        System.out.println("Name? ");
        String Name = sc.next();

        System.out.println("Age? ");
        int Age = sc.nextInt();

        System.out.println("Name is : "+Name + "\nAge is: "+Age);





    }
}
