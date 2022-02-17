package com.epam.training.student_Vladislav_Molkov.MainTask;

import java.util.Random;
import java.util.Scanner;

public class TransferString {
    public static void main(String[] args) {
        int i = 0;
        do {
            System.out.println("Вы запустили задание: 3.Вывести заданное количество случайных чисел с переходом и без перехода на новую строку");
            System.out.println("Укажите, сколько символов случайных чисел Вы хотите сгенерировать!Если хотите завершить задание введите: \"стоп\"");
            Scanner b = new Scanner(System.in);
            String c = b.nextLine().toLowerCase();
            int result = 0;
            if (!c.equals("стоп")) {
                int y = Integer.parseInt(c.trim());
                Random r = new Random();
                System.out.println("Вывод в строку:");
                for (int x = 0; x < y; x++) {
                    result = r.nextInt(y);
                    System.out.print(result);
                }
                System.out.println("\nВывод c переходом на новую строку:");
                for (int x = 0; x < y; x++) {
                    result = r.nextInt(y);
                    System.out.println(result);
                }
                i++;
            }
            else {
                break;
            }

        }
        while (i > 0);
    }
}
