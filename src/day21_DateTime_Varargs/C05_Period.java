package day21_DateTime_Varargs;

import java.time.LocalDate;
import java.time.Period;

public class C05_Period {
    public static void main(String[] args) {

        LocalDate dogumTarihi = LocalDate.of(1995,6,8);
        LocalDate dogumTarihi2 = LocalDate.of(1982,10,13);

        LocalDate bugun = LocalDate.now();

        Period yasEnes = Period.between(dogumTarihi,bugun);

        System.out.println(yasEnes);//P 27Y 10M 17D

        System.out.println("Enes'in yasi " + yasEnes.getYears());//Enes'in yasi 27

        Period yasSevda = Period.between(dogumTarihi2,bugun);

        System.out.println(yasSevda);//P 40Y 6M 12D


    }
}
