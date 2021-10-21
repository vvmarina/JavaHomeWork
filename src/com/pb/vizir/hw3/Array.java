package com.pb.vizir.hw3;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array = new int[10];
        int sum = 0;
        int count = 0;
        System.out.println("Введите 10 чисел массива");

          for  (int i = 0; i < array.length; i++) {
            System.out.println("Введите число " + (i+1) +": ");
            int x = scan.nextInt();
            array[i] = x;
            }
        // Отобразить исходный массив
        System.out.println("Массив:" + Arrays.toString(array));

        // Посчитать сумму элементов массива
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println("Сумма элементов массива: " + sum);

        // Посчитать кол-во положительных элементов массива
        for (int i = 0; i<array.length; i++)
            if (array[i] > 0)
                count++;
        System.out.println("Количество положительных элементов массива: " + count);

        // Пузырьковая сортировка

        int temp;                                               // переменная для замены
        for (int i = array.length - 1; i > 0; i--) {            // внешний цикл
            for (int j = 0; j < i; j++) {                       // внутренний цикл
                if (array[j] > array[j + 1]) {                  // сравнение
                    temp = array[j];                            // если истино, то меняем
                    array[j] = array[j + 1];                    // местами элементы
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println("Результат сортировки пузырьком: " + Arrays.toString(array));

    }
}

