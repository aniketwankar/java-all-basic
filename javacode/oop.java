package com.company;
class employee{
    int id;
    String name;
    float var;
    int sa;
    public void printdetail(){
        System.out.println("my id is "+ id);
        System.out.println(("my name is " +name));
    }


    public void getsalarry(){
        System.out.println("my sallary  is "+ sa);



    }
}
public class oop {
    public static void main(String[] args) {
        System.out.println();
        employee aniket = new employee();
        aniket.id=87;
        aniket.var= 727;
        aniket.name= "hello";


        employee niket = new employee();
        niket.name="nayan";
        niket.sa=65;

        niket.getsalarry();

        niket.id=78;


//        System.out.println(aniket.id);
//        System.out.println(aniket.var);
//        System.out.println(aniket.name);

       employee karan = new employee();
       karan.id=75;
       karan.var=45;
       karan.name="lokesh";
       karan.printdetail();

        aniket.printdetail();
        niket.printdetail();





    }

}
