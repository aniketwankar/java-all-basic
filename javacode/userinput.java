package com.company;
import java.util.Scanner;

public class userinput {
    public static void main(String[] args) {

        System.out.println("Takking input from user");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number 1");
        int a = sc.nextInt();
        System.out.println("enter number 2");
        int b = sc.nextInt();
        int sum =a+b;
        System.out.println("sum of these number is "+sum);

    }
}
