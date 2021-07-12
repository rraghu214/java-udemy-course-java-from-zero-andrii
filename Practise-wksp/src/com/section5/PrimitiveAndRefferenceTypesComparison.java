package com.section5;

import java.util.Arrays;

public class PrimitiveAndRefferenceTypesComparison {

    public static void main(String[] args) {

        int int1 = 128;
        int int2 = 128;

        System.out.println("int1==int2 is " + (int1==int2));
        System.out.println("1==2 is "+ (1==2));
        System.out.println("65=='A' is "+ (65=='A'));

        Integer i1=128;
        Integer i2=128;

        System.out.println("i1==i2 is " + (i1==i2)); // 128 is out of int range of -128 to 127. Hence false

        Integer i3=127;
        Integer i4=127;
        System.out.println("i3==i4 is " + (i3==i4));//true

        Integer i5 = new Integer(127);
        Integer i6 = new Integer(127);

        System.out.println("i5==i6 is " + (i5==i6));//false because it is pointing to diff memory objects.

        Integer i7 = Integer.valueOf(127);
        Integer i8 = Integer.valueOf(127);

        System.out.println("i7==i8 is " + (i7==i8));//true as they are pointing to same int value of 127 within the range

        Integer i9 = Integer.valueOf(129);
        Integer i10 = Integer.valueOf(129);

        System.out.println("i9==i10 is " + (i9==i10));//false as they are outside the range of -128 to 127

        System.out.println("i.equals(i2): " + i1.equals(i2));//true

        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};

        System.out.println("arr1 == arr2: " + (arr1 == arr2));			// false
        System.out.println("arr1.equals(arr2): " + arr1.equals(arr2)); 	// false .equals works with Integers not with arrays
        System.out.println("Arrays.equals(arr1, arr2): " + Arrays.equals(arr1, arr2));	// true  Need to use array objects to compare

        arr1 = arr2;
        System.out.println(arr1 == arr2);				// true since they are referring to the same memory address.


    }
}
