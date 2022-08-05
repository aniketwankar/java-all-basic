package com.company;

import java.util.Scanner;

public class nestedtrycatch {
    public static void main(String[] args) {
        int mark[]=new int[5];
        mark[0]=54;
        mark[1]=54;
        mark[2]=56;
        mark[3]=51;
        mark[4]=52;
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the value of array");

        int a= sc.nextInt();
        try {
            System.out.println("welcome ");
                 try {
                   System.out.println(mark[a]);
                 }catch (Exception e){
                     System.out.println("some exception occured");
                     System.out.println(e);
                 }

        }catch (Exception e){
            System.out.println("some exception in level 2");
            System.out.println(e);
        }
    }
}
