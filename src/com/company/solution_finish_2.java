package com.company;
import java.util.Scanner;

public class solution_finish_2 {
    public static void main(String args[]) {
        System.out.println("Сколько всего элементов будет в массиве?");
        Scanner st = new Scanner(System.in);
        int n = st.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Введите " + (i + 1) + "-й элемент массива");
            array[i] = st.nextInt();
        }
        int h =1;
        while (h*3 < array.length) {
            h = h * 3 + 1;
        }

        while (h >= 1) {
            int length = array.length;
            for (int i = h; i < length; i++) {
                for (int j = i; j >= h; j = j - h) {
                    if (array[j] < array[j-h]) {
                        int x = array[j - h];
                        array[j - h] = array[j];
                        array[j] = x;
                    }
                    else
                        break;
                }
            }
            h = h/3;
        }

        System.out.println("Отсортированный массив:");
        for (int i = 0; i < n; i++) {
            System.out.println(array[i]);
        }
    }
}