package com.company;
import java.util.Scanner;
public class solution15 {
    public static void main(String args[]) {
        System.out.println("Сколько всего элементов будет в массиве?");
        Scanner st = new Scanner(System.in);
        int n = st.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Введите " + (i + 1) + "-й элемент массива");
            array[i] = st.nextInt();
        }
        for (int i = 0; i < n - 1; i++) {
            if (array[i] > array[i + 1]) {
                int x = array[i + 1];
                array[i + 1] = array[i];
                int y = i;
                while (y > 0 && x < array[y - 1]) {
                    array[y] = array[y - 1];
                    y--;
                }
                array[y] = x;
            }
        }
        System.out.println("Отсортированный массив:");
        for (int i = 0; i < n; i++) {
            System.out.println(array[i]);
        }
    }
}
