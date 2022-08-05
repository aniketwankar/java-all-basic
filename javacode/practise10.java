package com.company;


//class 1
class circle{

    int radius;

//function 1 1    ||   container
   circle(int r){
        System.out.println("i am circle parameterized constructor");
    this.radius=r;
   }
//function 1 2
    public double area(){
        return (double) (Math.PI*this.radius*this.radius);

    }

}


//class two
class cylender extends  circle{


    int height;

    //function  2  1     || container
    cylender(int r,int h){
        super(r);
        System.out.println("i am cylender parameterzided contsructor");
        this.height=h;

    }
//function 2 2
    double volume(){
        return  Math.PI*this.radius*this.radius*this.height;
    }
}

//main method
public class practise10 {
    public static void main(String[] args) {
//
//        circle  a = new circle(5);
        cylender b =new cylender(55,88);
    }

}
