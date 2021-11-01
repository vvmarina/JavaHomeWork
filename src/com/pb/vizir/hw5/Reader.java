package com.pb.vizir.hw5;


public class Reader {
    private String fio;
    private int numberTicket;
    private String faculty;
    private String dateBirthday;
    private String phone;
    private int countBookTaken;
    private int countBookReturn;

    public Reader(String fio, int numberTicket, String faculty, String dateBirthday, String phone){
        this.fio = fio;
        this.numberTicket = numberTicket;
        this.faculty= faculty;
        this.dateBirthday = dateBirthday;
        this.phone= phone;
        }

    // метод,  который будет принимать количество взятых книг (книги взяли)
     public void takeBook (int countBookTaken) {
        System.out.println(getFio()+" взял "+ countBookTaken + " книгу(-ги)");
    }

    // метод,  который будет принимать переменное количество названий книг (книги взяли)
    public void takeBook (String... nameBooks) {
        System.out.print(getFio()+" взял книги:");
        for (String nameBook : nameBooks) {
            System.out.print(" "+ nameBook+",");
        }
        System.out.println("\b"+".");
    }

    // метод,  который будет принимать переменное количество объектов класса Book (книги взяли)

    public void takeBook (Book... books) {
        System.out.print(getFio()+" взял книги:");
        for (Book book: books) {
             System.out.print(" "+ book.getNameBook() +" ("+ book.getAuthor()+ " " + book.getYearPublishing()+ "р.),");
          }
        System.out.println("\b"+".");
    }

    // метод принимает количество книг, которые вернули
    public void returnBook (int countBookReturn) {
        System.out.println(getFio()+" вернул "+ countBookReturn + " книгу(-ги)");
    }

    // метод принимает переменное количество названий книг, которые вернули
    public void returnBook (String... nameBooks) {
        System.out.print(getFio()+" вернул книги:");
        for (String nameBook : nameBooks) {
            System.out.print(" "+ nameBook+",");
        }
        System.out.println("\b"+".");
    }
    // метод принимает переменное количество объектов класса Book, которые вернули

    public void returnBook (Book... books) {
        System.out.print(getFio()+" вернул книги:");
        for (Book book: books) {
            System.out.print(" "+ book.getNameBook() +" ("+ book.getAuthor()+ " " + book.getYearPublishing()+ "р.),");
        }
        System.out.println("\b"+".");
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getNumberTicket() {
        return numberTicket;
    }

    public void setNumberTicket(int numberTicket) {
        this.numberTicket = numberTicket;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getDateBirthday() {
        return dateBirthday;
    }

    public void setDateBirthday(String dateBirthday) {
        this.dateBirthday = dateBirthday;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
