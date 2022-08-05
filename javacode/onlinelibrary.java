package com.company;


class library{
    String [] book;
    int no_of_book =0;
    library(){
        book=new String[100];
        no_of_book=0;

    }
    void addbook(String book){
       this.book[no_of_book]=book;
       no_of_book++;
        System.out.println(book+" hass been added");

    }
    void showAvailablebook(){
        System.out.println("available book are");
        for (String book : this.book){
            if(book==null){
                break;
            }
            System.out.println("* "+ book);
        }

    }



        }

public class onlinelibrary {

    public static void main(String[] args) {
        library centrallibrary = new library();
        centrallibrary.addbook("think an grow rich");
        centrallibrary.addbook("think an grow rich1");
        centrallibrary.addbook("think an grow rich2");
        centrallibrary.addbook("think an grow rich3");
        centrallibrary.showAvailablebook();

    }
}
