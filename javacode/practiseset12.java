package com.company;




class Practice1 extends Thread{
    public void run(){
        int i=0;
        while(i==4000){
            try {
                Thread.sleep(200);
            }
            catch (Exception e){
                System.out.println(e);
            }
            System.out.println("Good Morning!");
        }
    }
}
class Practice3 extends Thread{
    public void run(){
        while(true){
            System.out.println("Welcome!");
        }
    }
}

public class practiseset12 {
    public static void main(String[] args) {
        Practice1 a = new Practice1();
        Practice3 b = new Practice3();
        a.start();
        b.start();
        a.setPriority(5);
       b.setPriority(1);



    }
}
