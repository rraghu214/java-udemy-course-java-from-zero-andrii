package com.section10;

public class MethodsOverview {
    public static void main(String[] args) {
        int sum = sum(1,4);
        System.out.println(sum(1,5));

        printToConsole(sum(3.5,1.5));
        printToConsole("My name is Raghu");

    }

    // private --> we can access this method only within the scope of this class.
    // static --> this method is NOT connected with the instances of this class, but class itself.
    // int --> method return type.
    // method name --> usually verbs. Starting with a lower case letter and written in camel case.
    // Method name + method parameters == method signature.
    // Why return type or access modifier is not part of the signature -  Reason is to just emphasize on the overloading.
    // Overloading is the ability to write methods with same name but accept diff arguments.
    private static int sum(int i1, int i2){
        int result = i1+i2;
        return result;
    }

    private static double sum(double d1, double d2){
        return d1+d2;
    }

    public static void printToConsole(String text) {
        System.out.println(text);
    }

    public static void printToConsole(int i1) {
        System.out.println(i1);
    }

    public static void printToConsole(double d1) {
        System.out.println(d1);
    }
}
