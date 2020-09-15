package com.company;
import java.math.BigDecimal;
import java.util.Scanner;

public class solution_finish_3 {
    public static void main(String args[]) {
        Scanner st = new Scanner(System.in);
        System.out.println("Почём нынче доллар?");
        double kypc = st.nextDouble();
        System.out.println("Сколько рублёв имеется?");
        double pybli = st.nextDouble();
        BigDecimal x = new BigDecimal (pybli/kypc);
        x = x.setScale(2, BigDecimal.ROUND_DOWN);
        System.out.println("На " + pybli + " рублей можно купить " + x + " USD");
    }
}
