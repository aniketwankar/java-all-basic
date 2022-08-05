package com.company;
import jdk.jfr.Percentage;

import java.util.Scanner;

public class percentage {
    public static void main(String[] args) {
        System.out.println("Enter marks of subject");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Marathi Mark :");
        int a = sc.nextInt();
        System.out.println("Enter Math Mark :");
        int b = sc.nextInt();
        System.out.println("Enter English Mark :");
        int c = sc.nextInt();
        System.out.println("Enter History Mark :");
        int d = sc.nextInt();
        System.out.println("Enter It Mark :");
        int e =sc.nextInt();
        float Total = a+b+c+d+e;
         float Percentage = (Total/500)*100;
        System.out.println("Percentage of these subject is "+ Percentage);
    }
}
