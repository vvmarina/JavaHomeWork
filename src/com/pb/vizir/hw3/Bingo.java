package com.pb.vizir.hw3;

import java.util.Random;
import java.util.Scanner;

public class Bingo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        int x = random.nextInt(101);
        int num =101;
        int attempt = 0;
        System.out.println("Давайте сыграем в Bingo! Угадайте число от 0 до 100. Если игра наскучит, введите 999");

            while (num != x) {
            attempt++;
            System.out.println("Введите число");
            num = in.nextInt();

            if (num == 999) {
                    break;
                }

            if (num == x) {
                System.out.println("Поздравляем, Вы угадали число.");
                System.out.println("Произведено " + attempt + " попыток.");
                break;
                 }

            if (num > x) {
                System.out.println("Задуманное число меньше " + num);
                    continue;
                }

            if (num < x) {
                System.out.println("Задуманное число больше " + num);
                continue;
                }

                System.out.println("Поздравляем, Вы угадали число.");
                System.out.println("Произведено " + attempt + " попыток.");
                break;

           }

    }
}
