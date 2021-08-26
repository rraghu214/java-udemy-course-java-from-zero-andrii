package com.section7;

import com.sun.scenario.effect.impl.sw.java.JSWBlend_SRC_OUTPeer;

import java.util.Arrays;

public class CodingEx6 {

    public static void main(String[] args) {
        String join_args = String.join(",",args);
        String admin_flag = "--admin";
        String guest_flag = "--guest";

        //System.out.println(join_args);

        if (join_args.contains(admin_flag) && join_args.contains(guest_flag) ){
            System.out.println("Please, select either 'ADMIN' or 'GUEST' mode for this program");
        }
        else if (join_args.contains(admin_flag)){
            System.out.println("Hello, Admin!");
        }
        else if (join_args.contains(guest_flag)){
            System.out.println("Hello, Guest!");
        }
    }
}
