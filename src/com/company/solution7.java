package com.company;
import java.util.Scanner;
public class solution7 {
    public static void main(String args[]) {
        Scanner str = new Scanner(System.in);
        int x = str.nextInt();
        int y = str.nextInt();
        int z = str.nextInt();
        int number = str.nextInt();
        if (number == x || number == y || number == z) {
            System.out.println("Данное значение имеется в константах");
        } else  {
            System.out.println("Такой константы нет!");
        }
    }
}
