package com.section5;

public class ExpressionTypeExample {
    public static void main(String[] args) {

        byte b =1;
        short s =1;
        int i = 1;
        long l = 1;

        float f = 1.0F;
        double d = 1.0;

        char c = 1;

        int intExpressionType = b+b;
        int intExpressionType2 = s+s;
        int intExpressionType3 = b+i+c;

        long longExpressionType = l+l;

        float floatExpressionType = f+l;

        double doubleExpressionType=d+f;

        System.out.println(10/3);

        System.out.println(10/3.0);

        System.out.println("Hello " + 1);
        System.out.println("Hello "+null);

    }

}
