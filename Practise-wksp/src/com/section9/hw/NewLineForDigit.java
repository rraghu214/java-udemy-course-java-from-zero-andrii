package com.section9.hw;

import java.util.Scanner;

public class NewLineForDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        String value = sc.next();

        for (char t : value.toCharArray()){
            System.out.println(t);
        }

    }
}
