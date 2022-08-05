package com.company;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Check your number is Leap year or not :");
        int a = sc.nextInt();
        if(a%4==0 && a%100!=0 || a%400==0)
        {
            System.out.println("leap Year");
        }
        else{
            System.out.println("not leap year");
        }
    }
}
