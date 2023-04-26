package day06_NestedIfElseStatements_TernaryOperators;

import java.util.Scanner;

public class C09_TernarySoru6_MutlakDeger {
    public static void main(String[] args) {
        // Soru 6- Kullanicidan bir sayi alin ve mutlak degerini yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");

        double sayi = scanner.nextDouble();

        System.out.println(sayi>0 ? sayi : (-1)*sayi);

        System.out.println(Math.abs(sayi));
    }
}
