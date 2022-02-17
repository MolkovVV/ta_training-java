package com.epam.training.student_Vladislav_Molkov.Optional_Task1;

import java.util.Scanner;

public class MaxLengthSort {
    public static void main(String[] args) {
        //1.     Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.
        int i;
        System.out.println("Пожалуйста, укажите размерность ряда чисел");
        Scanner arrLeng = new Scanner(System.in);
        int arrLengInt = arrLeng.nextInt();
        int[] arrSort = new int[arrLengInt];

        for (i = 0; i < arrSort.length; i++) {
            System.out.println("Пожалуйста, введите число: " + (i + 1) + " из " + arrLengInt);
            Scanner memberArr = new Scanner(System.in);
            int memberArrStr = memberArr.nextInt();
            arrSort[i] = memberArrStr;
        }
        int min = arrSort[0];
        for (i=0; i < arrSort.length; i++){
            String minLengthStr = String.valueOf(min);
            int minLength = minLengthStr.length();
            String nextLengthStr = String.valueOf(arrSort[i]);
            int nextLength = nextLengthStr.length();
            if (minLength>nextLength){
                min = arrSort[i];
            }
        }
        String minLengthStr = String.valueOf(min);
        int minLength = minLengthStr.length();
        System.out.println("Самое короткое число: " + min + " из " + minLength + " символов!");
    }
}