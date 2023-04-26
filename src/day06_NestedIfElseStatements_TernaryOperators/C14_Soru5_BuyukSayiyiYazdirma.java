package day06_NestedIfElseStatements_TernaryOperators;

import java.util.Scanner;

public class C14_Soru5_BuyukSayiyiYazdirma {
    public static void main(String[] args) {
        /*
        Soru 5- Kullanicidan iki sayi alin ve buyuk olmayan sayiyi yazdirin

         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen iki tamsayi giriniz");
        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();

        System.out.println((sayi1 > sayi2 ? sayi2 : sayi1));

    }
}
