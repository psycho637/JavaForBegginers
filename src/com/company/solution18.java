package com.company;
import java.io.*;
public class solution18 {
    public static void main(String args[]) {
        String str;
        int y = 0;
        int x = 0;
        BufferedReader nf = new BufferedReader(new InputStreamReader(System.in));
        try (BufferedReader bf = new BufferedReader(new FileReader("test.txt")))

        {
            while ((str = bf.readLine()) !=null) {
                x++;
                System.out.println(str);
            }
        }
        catch (IOException exc){
            System.out.println("Ошибка ввода-вывода: " + exc);
}
        try (FileWriter fw = new FileWriter("test.txt"))
        {
            do {
                System.out.print(": ");
                str = nf.readLine();
                if (y == x) break;
                str = str + "\r\n";
                y++;
                fw.write(str);
            }
            while (y != x);
        }
        catch (IOException exc){
            System.out.println("Ошибка ввода-вывода: " + exc);
        }
    }
}