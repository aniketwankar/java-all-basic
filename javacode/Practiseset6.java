package com.company;

public class Practiseset6 {
    public static void main(String[] args) {
//        int [] mark = new int[5];
//        mark [0]=100;
//        mark [1]=200;
//        mark[3]=300;
//        mark[2]=52;
//        mark[4]=87;

//        int [] mark = {44, 55,77,99,77    };

//            System.out.println(mark[2]);


        //multi dimension array

//        int [] marks= new int[4];
        int[][] sub;
        sub = new int[2][3];

        sub[0][0] = 101;

        sub[0][1] = 102;

        sub[0][2] =103;

        sub[1][0] = 203;

        sub[1][1] = 202;

        sub[1][2] = 201;
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

