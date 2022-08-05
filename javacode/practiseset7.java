package com.company;

public class practiseset7 {

//    static void mul(int a) {
//
//        for (int i = 1; i <= 10; i++) {
//            System.out.format("%d x %d = %d\n", + a, i, a * i);
//        }
//
//
//    }


    // patern
//    static void star(int n){
//        for(int i=0;i<n;i++){
//            for(int j=0;j<i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
////        System.out.println();
//    }
//
//
//    public static void main(String[] args) {
//   star(18);
//    }


//    Problem 3
//    static int sumrec(int n){
//        if(n ==1 ){
//            return 1;
//        }
//        else {
//            return n+ sumrec(n-1);
//        }
//
//    }
//public static void main(String[] args) {
//    System.out.println(sumrec(2));
//
//}


//    prob 4
//
//    static void star(int n) {
//        for (int i = n; i >=0; i--) {
//            for (int j = i; j >=0; j--) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//    }
//
//
//    public static void main(String[] args) {
//   star(5);
//    }



//    febinosi

//    static int fib (int n){
//
//        if(n==1){
//            return 0;
//        }
//        else if(n==2){
//            return 1;
//        }else {
//            return fib(n-1)+fib(n-2);
//        }
//    }
//    public static void main(String[] args) {
//        System.out.println(fib(7));
//    }
//8 problem
static void star(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }
    static void starrec(int n){
    starrec(n-1);
        for(int i=0;i<n;i++){
            starrec(n-1);

            System.out.println();
        }

    }





    public static void main(String[] args) {

}



}
