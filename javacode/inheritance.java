package com.company;




      class base {
          int x;


          public int getX() {
              System.out.println("i am set x now");
              return x;
          }

          public void setX(int x) {
              this.x = x;
          }

          public void pritme() {
              System.out.println("i am a contrsuctor ");
          }
      }

          class derived extends base {
              int y;

              public int getY() {
                  return y;
              }

              public void setY(int y) {
                  this.y = y;
              }

          }

          public class inheritance {
              public static void main(String[] args) {
//                  base aniket = new base();
//                aniket.setX(4);
//                  System.out.println(aniket.getX());

                  derived aniket2 = new derived();
                  aniket2.setY(8);
                  aniket2.setX(64);
                  System.out.println(aniket2.getX());
                  System.out.println(aniket2.getY());

              }
          }

