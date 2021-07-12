package com.section3;

public class PrimitiveTypes {

    public static void main(String[] args) {
        byte b =1;
        short s;
        s=2;
        int i =3;
        long l =4;
        char c ='a';
        boolean bool = true;

        float f = 1.2f;

        long l2=2_000_000_000;
        long l3=2_000_000_000_000L;

        double d = 1.2;

        int i3=s;

        char c2 = 100;

        System.out.println(c2);

        double d2 = i3;

        System.out.println("Value of d2 is " + d2);

        int j = (int) l3;

        System.out.println("Value of l3 is "+ l3 +  " which is assigned to j is "+j);
        System.out.println("This is an example of overflow which is dangerous when narrowing the data type, " +
                "where the info might be lost");

        /*
        Auto Boxing and Un-boxing

        Automatic conversion that the java compiler makes between the primitive types and its corresponding wrapper classes

         */

        Integer i5=12; //Auto Boxing. Int was auto boxed to Integer.

        int i6 = i5; // Unboxing

        System.out.println(i5);



    }
}
