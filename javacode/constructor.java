package com.company;


class Myemplyoes{

    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Myemplyoes(int id, String name) { 
        this.id = id;
        this.name = name;
    }


}
public class constructor {
    public static void main(String[] args) {
        Myemplyoes aniket = new Myemplyoes(45,"aniket");
        System.out.println(aniket.getId());
        System.out.println(aniket.getName());

    }
}