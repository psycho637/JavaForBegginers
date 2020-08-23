package com.company;
import java.util.Scanner;
public class solution9 {
    public static void main(String args[]) {
        Scanner str = new Scanner(System.in);
        int n = str.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = str.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.println(array[i] * 2);
        }
    }
}