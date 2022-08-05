package com.company;
class base1{

    base1(){
        System.out.println("mai ak constructor hu");
    }
    base1(int a){
        System.out.println("mari ak value hai " +a);
    }



    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}
class derived1 extends base1{
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    derived1 (){
//        super(0);
        System.out.println("mai derived class ka constructor hu");
    }

    derived1(int a , int b){
        super(a);
        System.out.println("mai derived class ki value hu" +b);


    }
    class childofderive extends derived1{
        childofderive(int a,int b ,int c){
            System.out.println("mai derived class ki value hu" +c);
        }


    }
}

public class inhertitanceConstructor {
    public static void main(String[] args) {
//        base1 b= new base1();





    }
}
