package com.pluralsight;

public class Book {

private String id;
private String isbn;
private String title;
private boolean isCheckedOut;
private String checkedOutTo;

    public Book(String checkedOutTo, boolean isCheckedOut, String title, String isbn, String id) {
        this.checkedOutTo = checkedOutTo;
        this.isCheckedOut = isCheckedOut;
        this.title = title;
        this.isbn = isbn;
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public void setCheckedOut(boolean checkedOut) {
        isCheckedOut = checkedOut;
    }

    public String getCheckedOutTo() {
        return checkedOutTo;
    }

    public void setCheckedOutTo(String checkedOutTo) {
        this.checkedOutTo = checkedOutTo;
    }
}
