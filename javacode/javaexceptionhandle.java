package com.company;

import java.util.Scanner;

public class javaexceptionhandle {

    public static void main(String[] args) {
      while(true){
            int[] marks = new int[3];
            marks[0] = 7;
            marks[1] = 56;
            marks[2] = 8;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the index");
            int m = sc.nextInt();


            System.out.println("Enter the number you want to divide the value with");
            int n = sc.nextInt();

            try {
                System.out.println("the value at array index entered is :" + marks[m]);
                System.out.println("the value at array index entered is :" + marks[m] / n);



            }catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("ArrayIndexOutOfBoundsException  occoured");
                System.out.println(e);
            }catch (ArithmeticException e) {
                System.out.println("ArithmeticException occoured");
                System.out.println(e);
            }


            catch (Exception e) {
                System.out.println("some exception occoured");
                System.out.println(e);
            }
      }







    }
}
