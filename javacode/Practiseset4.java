package com.company;

import java.util.Scanner;



public class Practiseset4 {
    public static void main(String[] args) {
        System.out.println("Enter mark of 1 subject");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter mark of 2subject");
        int b = sc.nextInt();
        System.out.println("Enter mark of 3 subject");
        int c = sc.nextInt();

        boolean x = (a < 33);
        boolean y = (b < 33);
        boolean z = (c < 33);
        float p =a+b+c;
       float k = (p/300)*100;
        System.out.println(k);
        if (x) {

            if (y) {

                if (z) {





                        System.out.println("Your are fail");

                }
            }
            System.out.println("you are fail");

        } else {
            if(k>40){
            System.out.println("your are passed");

        }
            else {
                System.out.println("your fail");
            }
        }


    }
}