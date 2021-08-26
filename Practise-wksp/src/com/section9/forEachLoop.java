package com.section9;

public class forEachLoop {
    public static void main(String[] args) {
        // This type of loop is used on arrays. This is also called enhanced for loops.
        int[] arr = {1,2,3};

        int sum = 0;

        for (int number: arr) {
            sum+=number;
            System.out.println("Current number: "+ number);
        }
        System.out.println("Total sum is : "+ sum);
    }
}
