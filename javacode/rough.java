package com.company;

import java.util.Scanner;

public class rough {
    public static void main(String[] args) {

        /*
         * * * * *
         * * * *
         * * *
         * *
         *

         */


//        int n=5;
//        for(int i=n;i>0;i--){
//
//            for(int j=i;j>0;j--){
//
//
//                System.out.print("* ");
//
//            }
//            System.out.println(" ");
//        }
        /*

         *
         * *
         * * *
         * * * *


         */

//        int n=5;
//        for(int i=0;i<n;i++){
//
//
//            for(int j = 0; j<i; j++){
//
//
//                System.out.print("* ");
//
//            }
//            System.out.println(" ");
//        }

        /*
        ---------------------------------------
                                *
                               **
                              ***
                             ****
                            *****





*/

//        int n=5;
//        for(int i=0;i<n;i++){
//
//            for(int j=0;j<n;j++){
//         if(i+j>=(n-1)){
//             System.out.print("*");
//         }else {
//             System.out.print(" ");
//         }
//            }
//            System.out.println("");
//
//        }


        /*

         *****
         ****
         ***
         **
         *



         */
//        int n=5;
//        for(int i=0;i<n;i++){
//
//            for(int j=0;j<n;j++){
//         if(i+j<=(n-1)){
//             System.out.print("*");
//         }else {
//             System.out.print(" ");
//         }
//            }
//            System.out.println("");
//
//        }


        /*
         *****
         *   *
         *   *
         *   *
         *****
         */

//        int n=5;
//        for(int i=0;i<n;i++){
//
//            for(int j=0;j<n;j++){
//                if(i==0 || j==0 || i==n-1 || j==n-1){
//                    System.out.print("*");
//                }else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println("");
//
//        }


//        int n=5;
//        for(int i=n;i>0;i--){
//
//            for(int j=n;j>0;j--){
//         if(i+j>=(n-1)){
//             System.out.print("*");
//         }else {
//             System.out.print(" ");
//         }
//            }
//            System.out.println("");
//
//        }


//print the n  prime    number

//        System.out.println("Enter the number : ");
//        Scanner sc =new Scanner(System.in);
//        int n = sc.nextInt();
//
//        int a,b;
//        for(a=2;a<=n;a++){
//            for(b=2;b<=a;b++){
//                if(a%b==0){
//
//                    break;
//                }
//            }
//            if(a==b){
//                System.out.println(b);
//            }
//        }


        //print the prime number or not

//        int n=9;
//        int a;
//        boolean num =true;
//        for(a=2;a<n;a++){
//            if(n%a==0){
//                num = false;
//                break;
//            }
//        }
//        System.out.println(num);


//        int a;
//
//        int prime = 1;


//        while (true) {
//            System.out.println("enter the number whcih you want to execute : ");
//            Scanner sc = new Scanner(System.in);
//            int n = sc.nextInt();
//
//            for (a = 2; a < n; a++) {
//                if (n % a == 0) {
//                    prime = 0;
//
//                }
//            }
//            if (prime == 0) {
//                System.out.println("number is not prime " + n);
//            } else {
//                System.out.println("number is prime " + n);
//            }
//
//
//        }

        int marks[] =new int[3];
        marks[0]=35;
        marks[1]=37;
        marks[2]=36;
        for(int i=0;i>3;i++){
            System.out.print(marks[i]);
        }






    }

}
