package com.epam.training.student_Vladislav_Molkov.Optional_Task1;

import java.util.Scanner;

public class MiddleSort {
    public static void main(String[] args) {
        //3.Вывести на консоль те числа, длина которых меньше (больше) средней длины по всем числам, а также длину.
        System.out.println("Пожалуйста, укажите количество чисел для сравнения");
        Scanner countForArray = new Scanner(System.in);
        int arrCount = countForArray.nextInt();
        int[] arrNubmers = new int[arrCount];
        int i;
        for (i = 0; i < arrNubmers.length; i++) {
            System.out.println("Введите пожалуйста число " + (i + 1) + " из " + arrCount);
            Scanner userEnter = new Scanner(System.in);
            int userEnterInt = userEnter.nextInt();
            arrNubmers[i] = userEnterInt;
        }
        int sum = 0;
        for (i = 0; i < arrNubmers.length; i++) {
            String numberToString = String.valueOf(arrNubmers[i]);
            int lengthElement = numberToString.length();
            sum += lengthElement;
        }
        int middleLength = sum / arrCount;
        for (i = 0; i < arrNubmers.length; i++) {
            String memberToString = String.valueOf(arrNubmers[i]);
            int memberLength = memberToString.length();
            if (memberLength < middleLength) {
                int number = arrNubmers[i];
                System.out.println("Число удовлетворяющее критериям " + number + " состоящее из " + memberLength + " символа(-ов)");
            }
        }
    }
}
