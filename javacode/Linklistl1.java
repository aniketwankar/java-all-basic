package com.company;

import java.util.*;


public class Linklistl1 {
    public static void main(String[] args) {

       LinkedList<Integer> aniket = new LinkedList<>();


        aniket.add(2);
        aniket.add(9);
        aniket.add(3);
        aniket.add(5);
        aniket.add(7);
        aniket.add(8);
        aniket.add(4);
        aniket.add(4);
        System.out.println("l1 list : " +aniket);
        aniket.pop();
        aniket.push(15);
        System.out.println("l1 list updated : " +aniket);
    }
}
