package com.section7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CodingEx7 {

    public static void main(String[] args) {

        if (args[0].contains(".") || args[1].contains(".")){
            double val1= Double.parseDouble(args[0]);
            double val2= Double.parseDouble(args[1]);
            System.out.println(val1+val2);
        }
        else{
            Integer val1 = Integer.parseInt(args[0]);
            Integer val2 = Integer.parseInt(args[1]);
            System.out.println(val1+val2);
        }

    }
}
