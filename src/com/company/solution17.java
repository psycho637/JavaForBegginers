package com.company;
import java.io.*;
public class solution17 {
    public static void main(String args[]) {
        String str;
        BufferedReader nf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Признак конца ввода - строка 'stop' ");
        try (FileWriter fw = new FileWriter("test.txt"))
        {
            do {
                System.out.println(": ");
                str = nf.readLine();
                if (str.compareTo("stop") == 0) break;
                str = str + "\r\n";
                fw.write(str);
            }
            while (str.compareTo("stop") != 0);
        }
        catch (IOException exc){
            System.out.println("Ошибка ввода-вывода: " + exc);
        }
    }
}