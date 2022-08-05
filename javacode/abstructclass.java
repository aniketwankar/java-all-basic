package com.company;



abstract  class Ani{

  public Ani(){
      System.out.println("this is abstruct class");

  }
    public void symbol(){
        System.out.println("this is abstruct class");

    }
    abstract public void great();


}

// class two inhert ani

  class ket extends  Ani{

    ket(){
        System.out.println("this is contructor");
    }

      @Override
      public void great() {
          System.out.println("this is great method");
      }
  }




public class abstructclass {

    public static void main(String[] args) {


        Ani A = new ket();
        A.great();
        A.great();


    }
}
