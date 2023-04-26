package day06_NestedIfElseStatements_TernaryOperators;

import java.util.Scanner;

public class C13_Soru2_Ternary_EskenarUcgen {
    public static void main(String[] args) {
        /*
        Soru 2- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin, ucgen eskenar ise
        “Eskenar ucgen” yazdirin, degilse “Eskenar degil” yazdirin.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen ucgenin uc kenar uzunlugunu sirasiyla giriniz");

        int k1 = scan.nextInt();
        int k2 = scan.nextInt();
        int k3 = scan.nextInt();

        System.out.println((k1 == k2 && k2 == k3 ? "Eskenar ucgen" : "Eskenar degil"));


    }
}
