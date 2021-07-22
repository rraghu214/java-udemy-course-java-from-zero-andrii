package com.section6;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaRegex {

    public static void main(String[] args) {

        String gmailPattern = "[a-zA-Z-\\d]+@gmail\\.com"; // \d --> \\d to match numbers too.
        // The dot in .com is escaped with \\. Else dot in regex world means any character.

        Pattern p = Pattern.compile(gmailPattern);

        String sampleText ="Some random text that contains gmail addresses "
                + "like this one some-email123@gmail.com. And some other random text.";

        Matcher m = p.matcher(sampleText);

        m.find();

        String gmailAddress = m.group();
        System.out.println(gmailAddress);


        System.out.println("====================");

        String sampleText2="There are three sentences in this string. Are you sure? Yes!";
        String[] sentences = sampleText2.split("[\\.!?]");

        System.out.println(Arrays.toString(sentences));


    }
}
