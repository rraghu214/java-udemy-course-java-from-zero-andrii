package com.section5;

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please, enter A side of a triangle: ");
		double sideA = sc.nextInt();

        System.out.print("Please, enter B side of a triangle: ");
        double sideB = sc.nextInt();

        System.out.print("Please, enter C side of a triangle: ");
        double sideC = sc.nextInt();

        double perimeter = (sideA+sideB+sideC)/2;
        double val = perimeter*(perimeter-sideA)*(perimeter-sideB)*(perimeter-sideC);

		double triangleArea = Math.sqrt(val);

        System.out.println("Triangle area is: " + triangleArea);
    }
}
