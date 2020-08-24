package com.company;
import java.util.Scanner;
public class solution10 {
    public static void main(String args[]) {
        Scanner str = new Scanner(System.in);
        int n = str.nextInt();
        int m = str.nextInt();
        int[][] matrix = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = str.nextInt();
            }
        }
        for (int j = 0; j < m; j++) {
            System.out.print(matrix[0][j] * 3 + " ");
    }
}
}
