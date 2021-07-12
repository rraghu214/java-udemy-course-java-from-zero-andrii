package com.section5;

public class MathClassDemo {

    public static void main(String[] args) {

        System.out.println(Math.PI);
        System.out.println(5 / 0.0);		// Infinity
        System.out.println(-5 / 0.0);		// -Infinity

        System.out.println(Math.random());						// between 0.0 and 1.0
        System.out.println((int)(Math.random() * 100)); 		// between 0 and 100
        System.out.println((int)(Math.random() * 100) + 100); 	// between 100 and 200
        System.out.println((int)(Math.random() * 200));

    }
}
