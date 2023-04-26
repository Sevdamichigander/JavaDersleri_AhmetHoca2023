package day02_DataTurleriveScanner;

import java.util.Scanner;

public class C10_ScannerSwap3uncuDegiskenOlmadan {

        public static void main(String[] args) {
            //Kullanicidan iki sayi alip ucuncu bir degisken kullanmadan ikisinin degerlerini degistirin(swap).

            Scanner scanner = new Scanner(System.in);
            System.out.println("Lutfen ilk sayiyi giriniz");
            int sayi1 = scanner.nextInt();

            System.out.println("Lutfen ikinci sayiyi giriniz");
            int sayi2 = scanner.nextInt();

            // sayi 1 = 10;      sayi2 = 20;

          /* BIRINCI YONTEM

           sayi1 = sayi1 ^ sayi2 ^ (sayi2 = sayi1);

            System.out.println("Sayilarin degerlerini degistirdim" +
                    "\nartik sayi1 : " + sayi1 + ", sayi2 : " + sayi2);*/

            sayi1 = sayi1+sayi2;
            sayi2 = sayi1 - sayi2;
            sayi1 = sayi1-sayi2;

            System.out.println("Sayilarin degerlerini degistirdim" +
                    "\nartik sayi1 : " + sayi1 + ", sayi2 : " + sayi2);

           /* x = x + y;
            y = x - y;
            x = x - y;
            System.out.println("After swapping: "+x +"  " + y);*/



        }
}

