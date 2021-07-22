package com.section5.hw;

import java.util.Scanner;

public class CircleCircumference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter circle radius: ");
        double rad = sc.nextDouble();
        double circleCircumference = 2 * Math.PI * rad;
        System.out.println("Circle circumference is: " + circleCircumference);
    }
}
