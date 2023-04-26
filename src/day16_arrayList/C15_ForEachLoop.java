package day16_arrayList;

import java.util.List;
import java.util.Scanner;

public class C15_ForEachLoop {
    public static void main(String[] args) {
        /*
        Stringlerden olusan bir liste icinde ki kelimelerden a harfi iceren kelimeleri yazdirin
         */
        // daha onceden hazirladigimiz kullanici liste olusturma methodu ile listeyi olusturuyoruz

        List<String> liste = C02_KullaniciListeOlusturma.kullanicidanStringAlarakListeOlusturma();

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen aradiginiz harfi giriniz");
        String arananHarf = scan.next();

        for (String each:liste) {

            if(each.contains(arananHarf)){
                System.out.println(each);
            }
        }
    }
}
