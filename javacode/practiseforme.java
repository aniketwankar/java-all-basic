package com.company;

class Emplyo{

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
}

public class practiseforme {
    public static void main(String[] args) {
        Emplyo aniket = new Emplyo();

        aniket.setId(45);
        System.out.println(aniket.getId());

        aniket.setName("aniket getter setterr ");
        System.out.println(aniket.getName());

    }
}
