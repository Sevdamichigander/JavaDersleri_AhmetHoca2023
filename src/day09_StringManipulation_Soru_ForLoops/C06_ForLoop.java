package day09_StringManipulation_Soru_ForLoops;

import java.util.Scanner;

public class C06_ForLoop {
    public static void main(String[] args) {
        // Kullanicidan 2 sayi alin ve
        // bu sayilar dahil olarak aralarindaki 3 ile bolunebilen sayilari yazdirin
        //ilk girilen sayi ikinci girilen sayidan buyuk ise hata mesaji yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen iki tane sayi giriniz");
        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();

        /*
        int sayi1 = 15;
        int sayi2 = 25;

        bu sekilde de int a atama yapabiliriz. Scanner kullanmadan.

         */


        if (sayi1 > sayi2) System.out.println("Ilk sayi daha kucuk olmalidir");
        else {
            for (int i = sayi1; i <= sayi2; i++) {
                if (i % 3 == 0) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}