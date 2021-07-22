package com.section6;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class StringDemo {
    public static void main(String[] args) {

        String s = " hello ";
        System.out.println("s.length(): "+ s.length());
        System.out.println("s.contains(\"he\"): "+ s.contains("he"));
        System.out.println("s.isEmpty(): "+ s.isEmpty());
        System.out.println("s.toUpperCase(): "+ s.toUpperCase());
        System.out.println("s.startsWith(\"h\"): "+ s.startsWith("h"));
        System.out.println("s.endsWith(\" \"): "+ s.endsWith(" "));
        System.out.println("s.replaceAll(\"l\",\"L\"): "+ s.replaceAll("l","L"));
        System.out.println("s.trim(): "+ s.trim());
        System.out.println("s.substring(0,3): "+ s.substring(0,3));
        //Convert each string into Array of Bytes
        System.out.println("Arrays.toString(s.getBytes()): "+ Arrays.toString(s.getBytes()));
        // Convert each string into Array of Characters
        System.out.println("Arrays.toString(s.toCharArray()): "+ Arrays.toString(s.toCharArray()));

        //To get characters from a specific index
        System.out.println("s.charAt(1): "+ s.charAt(1));
        System.out.println("Arrays.toString(s.split(\"e\")): "+Arrays.toString(s.split("e")));

        //STRING OBJECTS ARE IMMUTABLE. No matter how many ever times you call the initial String object will not be changed.

        System.out.println(s);

        System.out.println("\n============String Comparison============\n");
        String s2 = " hello ";
        System.out.println("s==s2: "+ s==s2);
        System.out.println("s  is: "+ s);
        System.out.println("s2 is: "+ s2);

        String s3 = new String(" hello ");
        System.out.println("s3 is: "+ s3);
        System.out.println("s == s3: "+ s == s3);
        System.out.println("s == s3: "+ s == s3.intern());

        System.out.println("s.equals(s2): "+ s.equals(s2));

        // String Formatting

        String greetingTemplate = "Hello %s. How are you? Today is %s!";
        String name = "Raghu";
        String day = "Monday";

        String formattedString = String.format(greetingTemplate,name,day);

        System.out.println(formattedString);

        System.out.println("Your age is %d years!"+ 20);


    }
}
