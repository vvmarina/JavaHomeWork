package com.pb.vizir.hw5;

import java.util.Arrays;

public class Library {
    public static void main(String[] args) {
        Book[] book = new Book [3];
        book[0] = new Book ("Загадка 622 номера", "Діккер Жоель", 2012);
        book[1] = new Book ("Зелене світло", "Метью Макконагі", 2019);
        book[2] = new Book ("Джуді Муді та список бажань", "Меґан МакДоналд", 1998);

        Reader[] reader = new Reader [3];
        reader[0] = new Reader ("Пархоменко Илья Владиславович",2125,"Юридический", "13.09.2002", "0675649823");
        reader[1] = new Reader ("Любименко Богдан Леонтьевич",3178,"Физико-математический", "25.03.2001", "0735611123");
        reader[2] = new Reader ("Григорьев Алевтин Матвеевич",1196,"Экономический", "06.12.2004", "0665649222");

     //Выводим все книги
        System.out.println("Книги библиотеки:");
        for (int i = 0; i<3; i++){
            System.out.println(book[i].getNameBook()+". " + book[i].getAuthor()+ " "+ book[i].getYearPublishing()+ "p.");
        }
        System.out.println();

     //Выводим всех читателей
        System.out.println("Наши читатели:");
        for (int i = 0; i<3; i++){
            System.out.println(reader[i].getFio() + " " + reader[i].getDateBirthday()+ "р. Тел. "+ reader[i].getPhone()+". Номер чит.билета " + reader[i].getNumberTicket()+ ". Факультет: "+ reader[i].getFaculty());
        }
        System.out.println();

        reader[0].takeBook(1);
        reader[1].takeBook (book[1].getNameBook(), "Гарри Поттер", book[2].getNameBook());
        reader[2].takeBook(book[0], book[2]);

        System.out.println();

        reader[1].returnBook (2);
        reader[2].returnBook (book[1].getNameBook(), "Волшебная лампа Аладдина", book[2].getNameBook());
        reader[0].returnBook(book[1], book[0]);
    }


}
