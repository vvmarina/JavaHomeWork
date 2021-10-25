package com.pb.vizir.hw4;

import java.util.Scanner;

public class CapitalLetter
   {   // метод, который меняет для символа регистр на верхний регистр
        static Character function(Character firstLetter) {
            Character  upperLetter = Character.toUpperCase(firstLetter);
            return upperLetter;
        }

        public static void main(String[] args)
     {
    Scanner in = new Scanner(System.in);

    System.out.println("Введите строку, состоящую из слов и пробелов");
    String str = in.nextLine();

    //преобразовываем строку в массив
    char[] chArray = str.toCharArray();

    //заменяем первые символы слов на заглавную букву
    chArray[0] = Character.toUpperCase(chArray[0]);
    for (int i=0;i<str.length();i++)
   {
     if(chArray[i] == ' ')
    {
        Character modifyLetter = function (chArray[i+1]);
        chArray[i+1] = modifyLetter;
      }
      System.out.print(chArray[i]);
  }
  }
}
