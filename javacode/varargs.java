package com.company;

public class varargs {


//    static int sum(int a , int b){
//        return a+b;
//    }
//
//    static  int mul(int c, int d) {
//
//        return c*d;
//    }
//
//    public static void main(String[] args) {
//        System.out.println("the is varargs code");
//        System.out.println(sum(4,5));
//        System.out.println(sum(5,6));
//        System.out.println(mul(7,9));
//
//


    static  int sum( int...arr) {
        int result = 0;
        for (int a : arr) {
            result += a;
        }
        return result;
    }
        public static void main(String[] args) {
        System.out.println("the is varargs code");
        System.out.println(sum(4,5));
        System.out.println(sum(5,6));
        System.out.println(sum(5,6,5,8));
            System.out.println(sum());





    }
}
