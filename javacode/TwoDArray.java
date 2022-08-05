package com.company;

public class TwoDArray {
    public static void main(String[] args) {


        int[][] sub;
        sub = new int[3][3];

        sub[0][0] = 101;

        sub[0][1] = 102;

        sub[0][2] = 103;

        sub[1][0] = 203;

        sub[1][1] = 202;

        sub[1][2] = 201;
        sub[2][0] = 201;
        sub[2][1] = 201;
        sub[2][2] = 201;


//        for(int[] i : sub){
//            System.out.println(i);
//

        for (int a = 0; a < sub.length; a++) {
            for (int b = 0; b < sub[a].length; b++) {

                System.out.print(sub[a][b]);
                System.out.print(" ");

            }
            System.out.println("\n");


        }


    }
}




