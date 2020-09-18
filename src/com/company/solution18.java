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
            for (int i=0; i < x; i++) {
                System.out.print(": ");
                str = nf.readLine();
                str = str + "\r\n";
                fw.write(str);
            }
        }
        catch (IOException exc){
            System.out.println("Ошибка ввода-вывода: " + exc);
        }
    }
}