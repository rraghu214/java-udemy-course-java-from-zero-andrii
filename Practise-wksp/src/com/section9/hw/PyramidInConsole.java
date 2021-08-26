package com.section9.hw;



import java.util.Scanner;

public class PyramidInConsole {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please, enter height of the pyramid: ");
        int val = sc.nextInt();

        for (int i=1; i<=val;i++){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i=val-1;i>=0;i--){
            for (int j =i; j>=1;j--){

                System.out.print("*");
            }
            System.out.println();
        }

    }
}
