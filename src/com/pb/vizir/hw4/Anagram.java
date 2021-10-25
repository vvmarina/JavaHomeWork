package com.pb.vizir.hw4;
import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static boolean checkAnagram(String str1, String str2) {
        str1 = str1.replaceAll("[^A-Za-zА-Яа-я0-9]", "");
        str2 = str2.replaceAll("[^A-Za-zА-Яа-я0-9]", "");
        //System.out.println("1:" + str1);
        //System.out.println("2:" + str2);

        if (str1.length() != str2.length()) {
            return false;
        } else {
            char[] strCharArray1 = str1.toLowerCase().toCharArray();
            char[] strCharArray2 = str2.toLowerCase().toCharArray();

            Arrays.sort(strCharArray1);
            Arrays.sort(strCharArray2);

            //System.out.println("Массив1:" + Arrays.toString(strCharArray1));
            //System.out.println("Массив2:" + Arrays.toString(strCharArray2));

            return (Arrays.equals(strCharArray1, strCharArray2));
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите первое предложение");
        String str1 = in.nextLine();

        System.out.println("Введите второе предложение");
        String str2 = in.nextLine();

        if (checkAnagram(str1, str2)) {
            System.out.println("Строки являются анаграммами!");
        } else {
            System.out.println("Строки не являются анаграммами!");
        }
    }
}
