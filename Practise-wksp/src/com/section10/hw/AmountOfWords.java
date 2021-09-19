package com.section10.hw;
/**
 * Implement console program which will meet the following requirements:
 * Program starts and asks the user to enter text.
 * Program calls a specific function which takes one parameter of String type and returns the amount of words in the text.
 *
 * Method should look like this:
 * public static int getWordsAmount(String text) {
 * 	<write your code here>
 * }
 *
 *
 * Program prints the amount of words to the console.
 */

import java.util.Scanner;

public class AmountOfWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please, enter any text: ");

        String text = sc.nextLine();
        int amountOfWords = getWordsAmount(text);
        System.out.println("Amount of words in your text: " + amountOfWords);
    }
    public static int getWordsAmount(String text){
        String[] splits = text.split("\\s+");
        return splits.length;

    }
}
