package com.company;

public class practiseset8 {

//    problem1
// class   employess1{
//    int salary;
//    String name;
//    String getName;
//    String setName;
//    public int salary(){
//    return salary;
//    }
//    public String getName(){
//      return name;
//    }
//    public void SetName(String n){
//     name =n;
//    }
//
//  public void setName(String code_with_harry) {
//
//  }
//
//}


    /*static class cellphone{
        public  void vibrat(){
            System.out.println("vibration....");
        }
        public  void ringinging(){
            System.out.println("ringing .....");
        }
        public    void caputuring(){
            System.out.println("caputuring");

        }




    }
    public static void main(String[] args) {

       cellphone asus = new cellphone();
       asus.vibrat();
       asus.caputuring();
       asus.ringinging();

    }
*/

    static  class square{
        int side;
        int a;
        public  int area(){
            return side*side;
        }
        public  int peri(){
            return 4*a;
        }
    }

    static class tommy{
        public void hit(){
            System.out.println("hitting");
        }
        public  void run(){
            System.out.println("running");

        }
        public void fire(){
            System.out.println("firing...");
        }
    }

    public static void main(String[] args) {
        square sq =new  square();
        sq.side=4;
        sq.a=5;
        System.out.println(sq.area());
        System.out.println(sq.peri());
        tommy t = new tommy();
        t.fire();
        t.run();
        t.hit();
    }
}
