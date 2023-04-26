package day15_MDA_arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C14_Soru5_ArrayLists_belirlenenSayidanKucukFibonacciSayilariniDondurenMethod {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen pozitif bir tamsayi giriniz: ");
        int sayi = scan.nextInt();


        List<Integer> fibonacciList = fibonacciSayiListesi(sayi);
        /*
        fibonacciSayiListesi methodu, girilen sayıdan küçük Fibonacci sayılarını hesaplamak
         için çağrılır. Hesaplanan Fibonacci sayılarını içeren bir List döndürür.
          Bu listeyi yazdırmak için toString() metodu kullanılır.
         */
        System.out.println("Fibonacci sayilari: " + fibonacciList.toString());

    }

    public static List<Integer> fibonacciSayiListesi(int sayi) {

        List<Integer> fibonacciList = new ArrayList<>(); // Bir ArrayList objesi oluşturarak,
                                                        // Fibonacci sayılarını içeren bir liste oluşturuyoruz.

        int oncekiSayi1 = 0, oncekiSayi2 = 1, toplam = 0;

        fibonacciList.add(oncekiSayi1);
        fibonacciList.add(oncekiSayi2);

        while (toplam < sayi) {
            toplam = oncekiSayi1 + oncekiSayi2;
            oncekiSayi1 = oncekiSayi2;
            oncekiSayi2 = toplam;
            if (toplam < sayi) {
                fibonacciList.add(toplam);
            }
        }

        return fibonacciList;

    }


}
