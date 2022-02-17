package com.epam.training.student_Vladislav_Molkov.Optional_Task1;

import java.util.Scanner;

public class SortNumByLength {
    public static void main(String[] args) {
        //2.     Вывести числа в порядке возрастания (убывания) значений их длины.
        //ввести n чисел с клавиатуры
        int arrayMembers;
        int i;
        int[] arrayForSort;
        System.out.println("Пожалуйста, укажите количество чисел для сравнения");
        Scanner keys = new Scanner(System.in);
        arrayMembers = keys.nextInt();
        arrayForSort = new int[arrayMembers];
        //Запросить у пользователя ввести кол-во заданных чисел и записать в массив поочередно
        for (i = 0; i < arrayForSort.length; i++) {
            System.out.println("Пожалуйста, введите число: " + (i + 1) + " из " + arrayMembers);
            Scanner userEnter = new Scanner(System.in);
            int meaning = userEnter.nextInt();
            arrayForSort[i] = meaning;
        }
        //Взять длину строки первого элемента массива и сравнить с длинной следующего, если строка длиннее то поменять местами

        for (i = 0; i < arrayForSort.length - 1; i++) {
            int j;
            for (j = 0; j < arrayForSort.length - 1; j++) {
                int firstKey = arrayForSort[i];
                int secondKey = arrayForSort[i + 1];
                int nullKey = arrayForSort[0];
                int nextKey = arrayForSort[1];
                String nullKeyStr = String.valueOf(nullKey);
                String nextKeyStr = String.valueOf(nextKey);
                int nullKeyStrLength = nullKeyStr.length();
                int nextKeyStrLength = nextKeyStr.length();
                String firstKeyStr = String.valueOf(firstKey);
                String secondKeyStr = String.valueOf(secondKey);
                int firstKeyLength = firstKeyStr.length();
                int secondKeyLength = secondKeyStr.length();
                if (firstKeyLength > secondKeyLength) {
                    arrayForSort[i] = secondKey;
                    arrayForSort[i + 1] = firstKey;
                    if (nullKeyStrLength < nextKeyStrLength) {
                        i--;
                    }
                }
            }
        }
        for (i = 0; i < arrayForSort.length; i++) {
            System.out.println("Элемент " + i + " равен " + arrayForSort[i]);
        }
    }
}