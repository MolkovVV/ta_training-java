package com.epam.training.student_Vladislav_Molkov.MainTask;

import java.util.Scanner;

public class MonthName {
    public static void main(String[] args) {
        int i = 0;
        do {
            System.out.println("Вы запустили подпункт: 5.Ввести число от 1 до 12. Вывести на консоль название месяца, соответствующего данному числу. Осуществить проверку корректности");
            System.out.println("Пожалуйста введите число от 1 до 12 чтобы узнать название месяца, которому оно соответствует:");
            Scanner monthInt = new Scanner(System.in);
            String numbMonth = monthInt.nextLine().toLowerCase();
            if (!numbMonth.equals("стоп")) {
                int month = Integer.parseInt(numbMonth.trim());
                switch (month) {
                    case 1:
                        System.out.println("Январь \n");
                        break;
                    case 2:
                        System.out.println("Февраль \n");
                        break;
                    case 3:
                        System.out.println("Март \n");
                        break;
                    case 4:
                        System.out.println("Апрель \n");
                        break;
                    case 5:
                        System.out.println("Май \n");
                        break;
                    case 6:
                        System.out.println("Июнь \n");
                        break;
                    case 7:
                        System.out.println("Июль \n");
                        break;
                    case 8:
                        System.out.println("Август \n");
                        break;
                    case 9:
                        System.out.println("Сентябрь \n");
                        break;
                    case 10:
                        System.out.println("Октябрь \n");
                        break;
                    case 11:
                        System.out.println("Ноябрь \n");
                        break;
                    case 12:
                        System.out.println("Декабрь \n");
                        break;
                    default:
                        System.out.println("В году 12 месяцев!) \n");
                }
                i++;
            } else {
                break;
            }
        }
        while (i > 0);
    }
}
