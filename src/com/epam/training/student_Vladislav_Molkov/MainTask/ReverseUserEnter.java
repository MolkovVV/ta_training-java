package com.epam.training.student_Vladislav_Molkov.MainTask;
import java.util.Scanner;

public class ReverseUserEnter {
    public static void main(String[] args) {
        int i = 0;
        do {
            System.out.println("Вы запустили задание: 2.Отобразить в окне консоли аргументы командной строки в обратном порядке.");
            System.out.println("Пожалуйста, введите произвольное значение которое хотите отобраззить зеркально!Если хотите завершить задание введите: \"стоп\"");
            Scanner userRand = new Scanner(System.in);
            String rand = userRand.nextLine().toLowerCase();
            if (!rand.equals("стоп")) {
                String rev = new StringBuilder(rand).reverse().toString();
                System.out.println("Реверсивный ввод Вашей строки: " + rev);
                i++;
            } else {
                break;
            }
        }
        while (i > 0);
    }
}
