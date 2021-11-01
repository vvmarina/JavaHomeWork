package com.pb.vizir.hw5;

public class Book {
   private String nameBook;
   private String author;
   private int yearPublishing;

    public Book(String nameBook, String author, int yearPublishing){
        this.nameBook = nameBook;
        this.author = author;
        if (yearPublishing > 0) {
        this.yearPublishing = yearPublishing;
        }
    }

    //Book book1 = new Book("Загадка 622 номера", "Діккер Жоель", 2012);
    //Book book2 = new Book("Зелене світло", "Метью Макконагі", 2019);
    //Book book3 = new Book("Джуді Муді та список бажань", "Меґан МакДоналд", 1998);


    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearPublishing() {
        return yearPublishing;
    }

    public void setYearPublishing(int yearPublishing) {
        this.yearPublishing = yearPublishing;
    }

}
