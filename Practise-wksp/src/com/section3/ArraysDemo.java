package com.section3;

import java.util.Arrays;

public class ArraysDemo {

    public static void main(String[] args) {

        int[] arr;

        arr = new int[10];

//        System.out.println(arr.length);
//System.out.println(arr[0]); // Though no values are declared, the elements in an array default to 0.

        double[] arr3 = new double[5];
//        System.out.println(arr3[0]);//default value is 0.0

        boolean[] arr4 = new boolean[2];

//        System.out.println(arr4[0]);//default value is false!

//        System.out.println(arr4[3]); // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 3
        //at com.section3.ArraysDemo.main(ArraysDemo.java:21)


        //Array Literals.. If you already know the size of an array

        int[] arr5 = {3, 2, 1};

        int[][] arr6 = {
                {1, 2, 3},
                {4, 5, 6}
        };

//        System.out.println(arr6[0][2]);

        //System.out.println(arr6.length);

        int[][] matrix2 = new int[10][10];
//        System.out.println(matrix2[0]); //[I@75b84c92 --> Lets see in OOPs lesson

        //Printing arrays to console
        System.out.println(Arrays.toString(arr5));
        // Arrays is the class in JDK to manipulate arrays such as sorting and searching. This is located in Java Util package.
        Arrays.sort(arr5);

        System.out.println(Arrays.toString(arr5));

        int sum = 10 + 5;
        System.out.println(sum);
        System.out.println(sum);


    }
}
