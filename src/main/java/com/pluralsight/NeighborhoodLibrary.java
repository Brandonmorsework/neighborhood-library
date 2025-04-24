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

            System.out.println(" ");

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
                case "exit":
                    return;
                default:
                    System.out.println(" ");
                    System.out.println("What Are You Trying to do? \nReturning to Main Menu...");
                    System.out.println(" ");
                    break;
            }
        }
    }

    private static void showCheckedOutBooks() {
        Scanner scanner = new Scanner((System.in));
        boolean anyCheckedOut = false;
        System.out.println(" ");
        System.out.println("Here Are The Checked Out Books:");
        System.out.println(" ");

        for (int i = 0; i < numOfBooks; i++) {
            if (books[i].isCheckedOut()) {
                anyCheckedOut = true;
                System.out.println(books[i].getTitle() + " is currently checked out by " + books[i].getCheckedOutTo() + " (" + " | " + "ID: " + books[i].getId() + " | ISBN: " + books[i].getIsbn() + " )");
                System.out.println(" ");
            }
            }

            if (!anyCheckedOut) {
                System.out.println("There Are no Checked Out Books!");
                System.out.println(" ");
                return;
            }
            System.out.println(" ");
            System.out.println("Press 'C' to Check in a Book or Press 'X' to Return to The Home Screen");
            System.out.println(" ");
            String CheckInOrLeave = scanner.nextLine();

            if (CheckInOrLeave.equalsIgnoreCase("x")) {
                return;
            }

            if (CheckInOrLeave.equalsIgnoreCase("c")) {
                System.out.println(" ");
                System.out.println("Enter the ID of The Book You Want to Check In");
                System.out.println(" ");
                String id = scanner.nextLine();

                for (int i = 0; i < numOfBooks; i++) {
                    if (books[i].getId().equalsIgnoreCase(id) && books[i].isCheckedOut()) {

                        books[i].setCheckedOut(false);
                        books[i].setCheckedOutTo("");
                        System.out.println(" ");
                        System.out.println(books[i].getTitle() + " has been checked in!");
                        return;
                    }
                }
        }
    }



    private static void listAvailableBooksWithInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("Here Are The Available Books with Details:");
        System.out.println(" ");

        for (int i = 0; i < numOfBooks; i++) {
            if (!books[i].isCheckedOut()) {
                System.out.println("ID: " + books[i].getId() + " | ISBN: " + books[i].getIsbn() + " | Title: " + books[i].getTitle());
            }
        }
        System.out.println(" ");
        System.out.println("Enter the ID of the book you want to check out or type 'exit' to return to the main menu");
        System.out.println(" ");
        String bookId = scanner.nextLine();

        if (bookId.equalsIgnoreCase("exit")) {
            return;
        }

        boolean bookAvailable = false;
        for (int i = 0; i < numOfBooks; i++) {
            if (books[i].getId().equals(bookId) && !books[i].isCheckedOut()) {
                bookAvailable = true;
                System.out.println(" ");
                System.out.println("Enter Your Name to Check Out This Book:");
                System.out.println(" ");
                String userName = scanner.nextLine();

                books[i].setCheckedOut(true);
                books[i].setCheckedOutTo(userName);
                System.out.println(" ");
                System.out.println(userName + " Has Checked Out: " + books[i].getTitle());
            }
        }
    }

    private static void CheckInBook() {
        for (int i = 0; i < numOfBooks; i++) {
            if (!books[i].isCheckedOut()) {

            }
        }

    }
}







