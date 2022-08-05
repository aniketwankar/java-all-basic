package com.company;

public class error {
    public static void main(String[] args) {
        int a = 0;
        int b = 100;

        try {
            int c= b/a;
            System.out.println(c);
        }
        catch (Exception e){
            System.out.println("we fail to divide");
            System.out.println(e);
        }
        System.out.println("End of the program");
    }
}
