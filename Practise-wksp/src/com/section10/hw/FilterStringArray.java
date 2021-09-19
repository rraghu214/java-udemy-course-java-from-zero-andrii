package com.section10.hw;

/**
 *  Implement console program which will meet the following requirements:
 * Program starts and asks user to enter random words separated by space
 * Program asks user to enter minimum length of string to filter words which were entered
 * Program creates array object from entered words
 * Program calls specific method which takes String[] as a parameter and returns array of strings which contains words that have length more or equal to value specified by user
 *
 * Method should look like this:
 * public static String[] filterWordsByLength(int minLength, String[] words) {
 * <write your code here>
 * }
 *
 *
 *
 * Program prints filtered array to the console output.
 */

import java.util.Arrays;
import java.util.Scanner;

public class FilterStringArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please, enter any words separated by space: ");
        String userInput = sc.nextLine();
        System.out.print("Please, enter minimum word length to filter words: ");
        int minLength = sc.nextInt();

        String[] words = userInput.split("\\s+");
        String[] filteredWords = filterWordsByLength(minLength, words);
        System.out.println(Arrays.toString(filteredWords));
    }



    public static String[] filterWordsByLength(int minLength, String[] words) {
		String[] new_words = new String[words.length];

        for (int i = 0; i < words.length; i++){
            if(words[i].length() >= minLength){
                new_words[i] = words[i];
            }
        }
        int newArraySize = 0;
        for (String word:new_words) {
            if (word != null) {
                newArraySize++;
            }
        }
//            System.out.println("newArraySize: " + newArraySize);

        String[] filtered_words = new String[newArraySize];
        int filteredArrayIndex=0;
        for (String word:new_words){
            if (word!=null){
                filtered_words[filteredArrayIndex++] = word;
            }
        }

        return filtered_words;
    }

}
