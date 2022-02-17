package com.epam.training.student_Vladislav_Molkov;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;


public class MainTaskAll {
        public static void main(String[] args) {
        int v=0;
             do {
                     System.out.println("Пожалуйста введи номер подпункта задания Main Task, например: 1");
                     System.out.println("Вот перечень подпунктов, содержащихся в подзадании:");
                     System.out.println("1.Приветствовать любого пользователя при вводе его имени через командную строку.");
                     System.out.println("2.Отобразить в окне консоли аргументы командной строки в обратном порядке.");
                     System.out.println("3.Вывести заданное количество случайных чисел с переходом и без перехода на новую строку");
                     System.out.println("4.Ввести целые числа как аргументы командной строки, подсчитать их сумму (произведение) и вывести результат на консоль.");
                     System.out.println("5.Ввести число от 1 до 12. Вывести на консоль название месяца, соответствующего данному числу. Осуществить проверку корректности ввода чисел.");
                     Scanner userEnter = new Scanner(System.in);
                     String enter = userEnter.nextLine();

                     //запускается подпункт задания 1
                     if (enter.equals("1")) {
                             int i = 0;
                             do {
                                     System.out.println("Вы запустили подпункт: 1.Приветствовать любого пользователя при вводе его имени через командную строку.");
                                     System.out.println("Пожалуйста представьтесь! Если хотите завершить задание введите: \"стоп\"");
                                     Scanner userName = new Scanner(System.in);
                                     String name = userName.nextLine().toLowerCase();
                                     if (!name.equals("стоп")) {
                                             System.out.println("Привет, " + name + "!");
                                             i++;
                                     } else {
                                             v++;
                                             break;
                                     }
                             }
                             while (i > 0);
                     }
                     //запускаем подпункт задания 2
                     else if (enter.equals("2")) {
                             int i = 0;
                             do {
                                     System.out.println("Вы запустили подпункт: 2.Отобразить в окне консоли аргументы командной строки в обратном порядке.");
                                     System.out.println("Пожалуйста, введите произвольное значение которое хотите отобраззить зеркально!Если хотите завершить задание введите: \"стоп\"");
                                     Scanner userRand = new Scanner(System.in);
                                     String rand = userRand.nextLine().toLowerCase();
                                     if (!rand.equals("стоп")) {
                                             String rev = new StringBuilder(rand).reverse().toString();
                                             System.out.println("Реверсивный ввод Вашей строки: " + rev);
                                             i++;
                                     } else {
                                             v++;
                                             break;
                                     }
                             }
                             while (i > 0);
                     }
                     //запускаем подпункт задания 3
                     else if (enter.equals("3")) {
                             int i = 0;
                             do {
                                     System.out.println("Вы запустили подпункт: 3.Вывести заданное количество случайных чисел с переходом и без перехода на новую строку");
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

                                                     System.out.print(+result);
                                             }
                                             System.out.println("\nВывод c переходом на новую строку:");
                                             for (int x = 0; x < y; x++) {
                                                     result = r.nextInt(y);
                                                     System.out.println(result);
                                             }
                                             i++;
                                     } else {
                                             v++;
                                             break;
                                     }

                             }
                             while (i > 0);
                     }
                     //запускаем подпункт задания 4
                     else if (enter.equals("4")) {
                             int i = 0;
                             do {
                                     System.out.println("Вы запустили подпункт: 4.Ввести целые числа как аргументы командной строки, подсчитать их сумму (произведение) и вывести результат на консоль.");
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
                                             v++;
                                             break;
                                     }
                             }
                             while (i > 0);
                     }
                     //запускаем подпункт задания 5
                     else if (enter.equals("5")) {
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
                                             v++;
                                             break;
                                     }
                             }
                             while (i > 0);
                     }
                     else {
                             break;
                     }
             }
             while (v>0);
        }
}