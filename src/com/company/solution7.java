package com.company;
import java.util.Scanner;
public class solution7 {
    public static void main(String args[]) {
        Scanner str = new Scanner(System.in);
        final int X = 1;
        final int Y = 2;
        final int Z = 3;
        int number = str.nextInt();
        if (number == X || number == Y || number == Z) {
            System.out.println("Данное значение имеется в константах");
        } else  {
            System.out.println("Такой константы нет!");
        }
    }
}
