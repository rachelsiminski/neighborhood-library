package com.pluralsight;

import java.util.Random;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Book[] books = new Book[20];

        System.out.println("Please enter your name: ");
        String userName = scanner.nextLine();

        for (int i = 0; i < 20; i++) {
            int Id = i + 1;

            Book book = new Book(Id, "", "", false, "");
            books[i] = book;

            System.out.println(book.getBookId());
        }

        for (Book book : books) {
            System.out.println(book.getBookId());
        }



    }

    public static void checkOut(String name) {
        //book.setcheckedOutTo = name;
        //book.isCheckedOut = true;

    }

    public static void checkIn() {


    }
}
