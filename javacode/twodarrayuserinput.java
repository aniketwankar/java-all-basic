package com.company;

import java.util.Scanner;

public class twodarrayuserinput {
    public static void main(String[] args) {

//taking input how many row and cols
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        //intitializing array

        int matrix[][] = new int[row][col];
        // input in for lop array
        for(int i=0;i<row;i++){
            for(int j=0;j< col;j++){
                matrix[i][j]=sc.nextInt();// store the value of i and j in i and j variable
            }
        }
        //output of array
        for(int i=0;i< row;i++){
            for(int j=0;j<col;j++){
                System.out.print(matrix[i][j]+ " ");// //print the valie of i in  i j variable
            }
            System.out.println();


        }

    }
}
