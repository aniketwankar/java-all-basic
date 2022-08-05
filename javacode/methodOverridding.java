package com.company;
class A{
    int a;
    int aniket(){
        return 4;
    }
    public void meth2(){
        System.out.println("i am method 2 of class A");
    }
}
class B extends A {
    @Override
    public void meth2(){
        System.out.println("i am method 2 of class B");
    }
    public void Meth3(){
        System.out.println(" ia ma method 3 of class B");
    }
}
public class methodOverridding {
    public static void main(String[] args) {
        A a = new A();
        a.meth2();

        B b = new B();
        b.meth2();

    }
}
