package com.company;
import java.util.Scanner;
public class solution_finish_1 {
    public static void main(String args[]) {
        System.out.println("Введите число в бинарнорм формате");
        Scanner str = new Scanner(System.in);
        String bin = str.nextLine();
        double y = 0;
        for (int x = 0; x <= bin.length() - 1; x++) {
            char c = bin.charAt(x);
            int i = Character.getNumericValue(c);
            y += i * Math.pow(2, bin.length() - 1 - x);
        }
        System.out.println("Число " + bin + " в десятичном формате = " + (int) y);
    }
}