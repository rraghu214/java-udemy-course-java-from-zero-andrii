package com.section10;

/**
 * When you don't know the number of input arguments.
 * Varargs are denoted by <data type>... <var name>
 * Varargs should be the last variable in the method parameters.
 */

public class VarargsDemo {

    public static void main(String[] args) {
        System.out.println(demoVarargs("Raghu", 1,2,3));
    }

    private static String demoVarargs(String s, int... ints){
        int sum = 0;
        for(int i:ints){
            sum+=i;
        }
        return "Hi " + s+" Sum is, "+sum;
    }
}