package com.pb.vizir.hw2;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;

        System.out.print("Введите число: ");
        num = scan.nextInt();

        if (num >= 0 && num <= 14) {
                    System.out.print("Число входит в промежуток [0-14]");
                } else {
            if (num >= 15 && num <= 35) {
                System.out.print("Число входит в промежуток [15-35]");
                } else {
                  if (num >= 36 && num <= 50) {
                  System.out.print("Число входит в промежуток [36-50]");
                    } else {
                      if (num >= 51 && num <= 100) {
                          System.out.print("Число входит в промежуток [51-100]");
                      } else {
                          System.out.print("Число " + num + " не входит ни в один из промежутков [0-14], [15-35], [36-50], [51-100]");
                      }
                  }
            }
        }



    }
}
