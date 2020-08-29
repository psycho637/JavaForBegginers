package com.company;
import java.util.Scanner;
public class solution14 {
    public static void main(String args[]) {
        Scanner st = new Scanner(System.in);
        int chislo = st.nextInt();
        String S = Integer.toString(chislo);
        int X = Integer.valueOf(S);
        double Y = (double) X;
        System.out.println("S= " + S);
        System.out.println("X= " + X);
        System.out.println("Y= " + Y);
    }
}
