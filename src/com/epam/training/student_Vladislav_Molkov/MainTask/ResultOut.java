package com.epam.training.student_Vladislav_Molkov.MainTask;

import java.util.Scanner;

public class ResultOut {
    public static void main(String[] args) {
        int i = 0;
        do {
            System.out.println("Вы запустили задание: 4.Ввести целые числа как аргументы командной строки, подсчитать их сумму (произведение) и вывести результат на консоль.");
            System.out.println("Пожалуйста Введите число номер 1! Если хотите завершить задание введите: \"стоп\"");
            Scanner firstScan = new Scanner(System.in);
            String firstInt = firstScan.nextLine().toLowerCase();
            if (!firstInt.equals("стоп")) {
                System.out.println("Пожалуйста Введите число номер 2! Если хотите завершить задание введите: \"стоп\"");
                Scanner secondScan = new Scanner(System.in);
                String secondInt = firstScan.nextLine();
                if (!secondInt.equals("стоп")) {
                    int x = Integer.parseInt(firstInt.trim());
                    int y = Integer.parseInt(secondInt.trim());
                    System.out.println("Вы ввели число 1 равное: " + x);
                    System.out.println("Вы ввели число 2 равное: " + y);
                    System.out.println("Сумма указанных чисел составит: " + (x + y));
                    System.out.println("Произведение указанных чисел составит: " + (x * y) + "\n");
                    i++;
                } else {
                    break;
                }
            } else {
                break;
            }
        }
        while (i > 0);
    }
}
