package com.company;
import java.util.Scanner;
public class solution6 {
    public static void main(String args[]) {
        Scanner str = new Scanner(System.in);
         int Average;
         int x = str.nextInt();
         int y = str.nextInt();
         int z = str.nextInt();
         Average = (x + y + z) / 2;
         System.out.println(Average);
        if ((Average / 2) > 3) {
            System.out.println("Программа выполнена корректно");
        }
    }
}