package com.pluralsight;

import java.util.Scanner;

public class NeighborhoodLibrary {

    private static Book[] books = new Book[10];

    private static int numOfBooks = 5;

    public static void main(String[] args) {

        books[0] = new Book(false, "", "1AA", "12-12-12", "Diary of a Wimpy Kid");
        books[1] = new Book(false, "", "2BB", "34-34-34", "Hunger Games");
        books[2] = new Book(false, "", "3CC", "56-56-56", "Rich Dad Poor Dad");
        books[3] = new Book(false, "", "4DD", "78-78-78", "Maze Runner");
        books[4] = new Book(false, "", "5EE", "90-90-90", "Harry Potter");

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println(" ");
            System.out.println("==============");
            System.out.println(" ");
            System.out.println("Welcome to the Library, What do You Want to do Today?");

            System.out.println("Press 1 to Show Available Books");

            System.out.println("Press 2 to Show Checked Out Books");

            System.out.println("Press 3 to Exit Application");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    listAvailableBooksWithInfo();
                    break;
                case "2":
                    showCheckedOutBooks();
                    break;
                case "3":
                    System.out.println("Goodbye!");
                    return;
                case "4":
                    System.out.println("");
                default:
                    System.out.println("What are you trying to do?");
                    break;
            }

            System.out.println("Enter the ID of the book you want to check out");

        }
    }

    private static void listAllBooks() {
        System.out.println("Book Inventory:");

        for (int i = 0; i < numOfBooks; i++) {
            System.out.println(books[i].getTitle());
        }
    }

    private static void showCheckedOutBooks() {
        System.out.println("Here Are The Checked Out Books:");
        for (int i = 0; i < numOfBooks; i++) {
            if (books[i].isCheckedOut()) {
                System.out.println(books[i].getTitle());
            }
        }
    }
    private static void listAvailableBooksWithInfo() {
        System.out.println("Here Are The Books with Details:");

        for (int i = 0; i < numOfBooks; i++) {
            if (!books[i].isCheckedOut()) {
                System.out.println("ID: " + books[i].getId() + " | ISBN: " + books[i].getIsbn() + " | Title: " + books[i].getTitle());
            }
        }

    }
    }







