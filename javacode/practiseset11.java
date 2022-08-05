package com.company;
  abstract  class  pen{

      abstract void write();
      abstract void drow();
      abstract void ink();
  }

  abstract class monkey {

      abstract  void jump();
      abstract  void climb();
      abstract  void eat();
      abstract  void bite();

  }

  interface  BasiAnimal{

      void eat1();
      void sleep1();
      void jump1();
  }



  class humanbeeing extends  monkey implements  BasiAnimal {

    public   void eat1(){
        System.out.println("eat1");

      }
    public   void sleep1(){
        System.out.println("sleep1");

      }
      public void jump1(){
          System.out.println("jump1");

      }


      @Override
      void jump() {
          System.out.println("jump ");
      }

      @Override
      void climb() {
          System.out.println("climb by human");

      }

      @Override
      void eat() {
          System.out.println("eat by human");

      }

      @Override
      void bite() {
          System.out.println("bite is human");

      }
  }


  class foauntainpen extends  pen{
      void write(){
          System.out.println("write");
      }
      void drow(){
          System.out.println("drow");

      }
     void ink(){
         System.out.println("ink");

     }
  }




public class practiseset11 {
    public static void main(String[] args) {
//        foauntainpen f = new foauntainpen();
//        f.drow();
//        f.write();
//        f.ink();
//



        //question 3


        humanbeeing h = new humanbeeing();
        h.bite();
        h.sleep1();
        h.climb();



    }
}
