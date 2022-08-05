package com.company;



interface  Bicycle{
    void applyBreak(int decrement);
    void seepUp(int decrement);
}
interface  Bicycle2{
    void applyBreak(int decrement);
    void seepUp(int decrement);
}



class AvonCycle implements  Bicycle,Bicycle2{

    void blow(){
        System.out.println("horn..........");
    }
    public void applyBreak(int decrement){
        System.out.println("Applying break");
    }
    public void seepUp(int decrement){
        System.out.println("Applying speed up");
    }
}
public class interfaces {
    public static void main(String[] args) {

        AvonCycle c = new AvonCycle();
        c.applyBreak(1);
        c.blow();

    }
}
