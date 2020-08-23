package com.company;

import java.util.Scanner;
public class solution4 {
    public static void main(String args[]) {
        Scanner str = new Scanner(System.in);
        System.out.println("Введите число в бинарном формате: ");
        String bin = str.nextLine();
        int binaryNumber = Integer.parseInt(bin, 2);
        System.out.println(binaryNumber);
    }
}





