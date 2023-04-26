package day06_NestedIfElseStatements_TernaryOperators;

import java.util.Scanner;

public class C11_Soru3_NestedIf {
    /*
             Soru 3- Kullanicidan bir sayi alin sayi tek ise negatif veya pozitif tek sayi
             oldugunu yazdirin, sayi cift sayi ise 10’un tam kati olup olmadigini
             yazdirin
   */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen bir sayi giriniz.");

        int sayi = scan.nextInt();

        if (sayi % 2 != 0) {
            if (sayi > 0) System.out.println("pozitif tek sayi");
            else System.out.println("negatif tek sayi");

        }
        else if (sayi % 2 == 0) {
            if (sayi % 10 == 0) System.out.println(sayi + " 10'un tam katidir.");
            else System.out.println(sayi + " 10'a tam bolunemez");
        }
        else System.out.println(sayi + "negatif bir sayidir.");
    }
}