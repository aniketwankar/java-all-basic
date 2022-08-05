package com.company;

import java.util.Scanner;

public class arraytakinguserinput {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int store =sc.nextInt();

        int marks[]=new int[store];
        for(int i =0;i< marks.length;i++){
            marks[i] = sc.nextInt();// store the value of array in i variable
        }

        for(int i=0;i< marks.length;i++){
            System.out.print(marks[i]+" ");//print the value of i variable
        }
    }
}
