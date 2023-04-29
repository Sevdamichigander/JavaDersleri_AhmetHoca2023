package day06_NestedIfElseStatements_TernaryOperators;

import java.util.Scanner;

public class C01_SayiKontrolu2 {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

         /*
            Kullanicidan bir sayi girmesini isteyin
            Sayi asagidaki 4 sarti sagliyorsa "Mukemmel Sayi" yazdirin
            Saglanmayan sartlarin tamamini kullaniciya soyleyin
            1- sayi 4 basamakli olmalidir
            2- sayi 3 ile bolunebilmelidir
            3- sayi 5 ile bolunememelidir
            4- sayinin birler basamagi tek sayi olmalidir
         */


        System.out.println("Lutfen bir sayi giriniz : ");
        int sayi = scan.nextInt();

        if (sayi >= 1000 && sayi <= 9999 && sayi % 3 == 0 && sayi % 5 != 0 && sayi % 10 % 2 == 1) {
            System.out.println("Mükemmel Sayı");
        }
        else {
            if ((sayi < 1000 || sayi > 9999)) {
                System.out.println("sayi 4 basamakli olmalidir");
            }
            if (sayi % 3 != 0) {
                System.out.println("sayi 3 ile bolunebilmelidir");

            }
            if (sayi % 5 == 0) {
                System.out.println("sayi 5 ile bolunememelidir");

            }
            if (sayi % 2 == 0) {
                System.out.println("sayinin birler basamagi tek sayi olmalidir");
            }
        }
    }
}
