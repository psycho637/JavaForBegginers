package com.company;
import java.util.Scanner;
public class solution6 {
    public static void main(String args[]) {
        Scanner str = new Scanner(System.in);
        double Average;
         int x = str.nextInt();
         int y = str.nextInt();
         int z = str.nextInt();
         Average = (double)(x + y + z) / 3;
         System.out.println(Average);
        if ((int)(Average / 2) > 3) {
            System.out.println("Программа выполнена корректно");
        }
    }
}