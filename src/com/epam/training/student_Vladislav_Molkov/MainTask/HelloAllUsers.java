package com.epam.training.student_Vladislav_Molkov.MainTask;

import java.util.Scanner;

public class HelloAllUsers {
    public static void main(String[] args) {
        int i = 0;
        do {
            System.out.println("Вы запустили задание: 1.Приветствовать любого пользователя при вводе его имени через командную строку.");
            System.out.println("Пожалуйста представьтесь! Если хотите завершить задание введите: \"стоп\"");
            Scanner userName = new Scanner(System.in);
            String name = userName.nextLine();
            if (!name.equals("стоп")) {
                System.out.println("Привет, " + name + "!");
                i++;
            }
            else {
                break;
            }
        }
        while (i > 0);
    }
}
