package com.pluralsight;

import java.util.Random;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Book[] books = new Book[20];


        String userName;

        for (int i = 0; i < 20; i++) {
            int Id = (int)(Math.random()) * 10000;

            books[i].setBookId(Id);
            books[i].setBookIsbn("");
            books[i].setBookTitle("");
            books[i].setCheckedOut(false);
            books[i].setCheckedOutTo("");

        }

    }

    public static void checkOut(String name) {
        //setcheckedOutTo = name;
        //isCheckedOut = true;

    }

    public static void checkIn() {


    }
}
