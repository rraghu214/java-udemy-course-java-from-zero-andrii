package com.section10.hw;

/**
 * Implement console program which will meet the following requirements:
 * Program starts and asks user to input height of the rectangle
 * After the user inputs heights of the rectangle, the program asks to input the width of the rectangle.
 * Program calls specific method which takes two parameters of int type which prints rectangle to the console:
 * ++++++
 * +         +
 * ++++++
 *
 * Method should look like this:
 * public static void drawRectangle(int height, int width) {
 * 	<write your code here>
 * }
 *
 *
 * In the example above height of the rectangle is 3, the width of the rectangle is 6
 *
 * N.B.: rectangle is empty inside
 */

import java.util.Scanner;

public class EmptyRectangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Please, enter height of rectangle: ");
        int height = sc.nextInt();
        System.out.print("Please, enter width of rectangle: ");
        int width = sc.nextInt();

//        int height = 5;
//        int width = 4;

        drawRectangle(height,width);
    }

    public static void drawRectangle(int height, int width){
        for (int i =0; i < height; i++){
            for (int j = 0;j < width;j++){
                if (i==0 || i== height-1 || j ==0 || j == width-1){
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }

            }
            System.out.println();
        }

    }
}
