package com.company;
import java.util.Scanner;
public class solution7 {
    public static void main(String args[]) {
        int x = 1;
        int y = 2;
        int z = 3;
        Scanner str = new Scanner(System.in);
        int number = str.nextInt();
        if (number == x || number == y || number == z) {
            System.out.println("Данное значение имеется в константах");
        } else  {
            System.out.println("Такой константы нет!");
        }
    }
}
