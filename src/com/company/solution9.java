package com.company;
import java.util.Scanner;
public class solution9 {
    public static void main(String args[]) {
        Scanner st = new Scanner(System.in);
        int n = st.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = st.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.println(array[i] * 2);
        }
    }
}