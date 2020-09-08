package com.company;
import java.io.*;
public class solution16 {
    public static void main(String args[]) {
        String str;
        try (BufferedReader nf = new BufferedReader(new FileReader("test.txt")))
        {
            while ((str = nf.readLine()) !=null) {
                System.out.println(str);
        }
                }
        catch (IOException exc){
            System.out.println("Ошибка ввода-вывода: " + exc);
        }
    }
}
