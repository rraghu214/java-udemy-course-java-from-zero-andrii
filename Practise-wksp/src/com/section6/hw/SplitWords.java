package com.section6.hw;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Implement console program which meet the following requirements:
 *  1. Program starts and asks user to input any text
 *  2. Program prints array of words entered by user without any spaces or punctuation marks.
 */

public class SplitWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please, enter any text: ");
        String userInput = sc.nextLine();
        System.out.print("You entered these words: ");
        //String[] sentences = sampleText2.split("[\\.!?]");
        System.out.println(Arrays.toString(userInput.split("[\\p{P}\\s]+")));
    }
}
