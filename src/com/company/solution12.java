package com.company;
import java.util.Scanner;
public class solution12 {
    public static void main(String args[]) {
        String string = new Scanner(System.in).nextLine();
        String finstr = "";
        String[] stringparts = string.split(" ");
        for (int i = 0; i < stringparts.length; i++)         {
          finstr = finstr + stringparts[i];
        }
        System.out.print(finstr);
    }
}