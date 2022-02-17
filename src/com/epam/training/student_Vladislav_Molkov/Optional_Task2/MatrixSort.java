package com.epam.training.student_Vladislav_Molkov.Optional_Task2;

import java.util.Random;
import java.util.Scanner;

public class MatrixSort {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Укажите размерность матрицы: ");
        int n = in.nextInt();
        if (n <= 1) {
            System.err.println("Вы ввели некорректное значение (Обязательное условие: n > 1");
            System.exit(1);
        }
        Scanner interval = new Scanner(System.in);
        System.out.print("Укажите значение М, для определения границ интервала: ");
        int M = interval.nextInt();

        int[][] a = new int[n][n];
        Random rnd = new Random();

        System.out.println("Значения: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int temp = rnd.nextInt();
                a[i][j] = temp % (M + 1);
            }
        }
        int i;
        int j;
        int min;

        // bubble sort
        for (i = 0; i < n * n - 1; i++) {
            for (j = i; j < n * n; j++) {
                if (a[i / n][i % n] > a[j / n][j % n]) {
                    min = a[i / n][i % n];
                    a[ i / n][i % n] = a[j / n][j % n];
                    a[( j / n)][j % n] = min;
                }
            }
        }
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
