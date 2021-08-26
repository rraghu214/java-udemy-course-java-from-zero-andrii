package com.section9;

public class doWhileLoop {

    public static void main(String[] args) {
        System.out.println("=== Do While Loop ===");

        int counter = 0;

        do {
            System.out.println("counter: " + counter++);
        } while (counter < 5);

        do {
            System.out.println("counter is already five " + counter);
        } while (counter < 5);
    }
}
