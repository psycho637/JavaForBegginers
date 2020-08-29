package com.company;
import java.util.Scanner;
public class solution13 {
    public static void main(String args[]) {
        String string1 = new Scanner(System.in).nextLine();
        String string2 = new Scanner(System.in).nextLine();
        int length1 = string1.length();
        int length2 = string2.length();
        if (length1 == length2) {
            System.out.print("Длины равны");
        }
        else if (length1>length2) {
            System.out.print(string1);
        }
        else if (length1<length2) {
            System.out.print(string2);
        }
    }
}
