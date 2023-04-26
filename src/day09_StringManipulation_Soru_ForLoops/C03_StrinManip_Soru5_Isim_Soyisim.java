package day09_StringManipulation_Soru_ForLoops;

import java.util.Scanner;

public class C03_StrinManip_Soru5_Isim_Soyisim {
    public static void main(String[] args) {
                /*
                Soru 5 : Kullanicidan isim ve soyismini ayri ayri alin.
                - ismi daha uzun ise, isim ve soyismi ilk harf buyuk kalanlar kucuk seklinde
                     yazdirin
                - soyisim daha uzun ise ismi ilk harf buyuk digerleri kucuk, soyismi buyuk
                harflerle yazdirin

                 */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz");
        String isim = scan.nextLine();
        System.out.println("Lutfen soyisminizi giriniz");
        String soyisim = scan.nextLine();

        if(isim.length()>soyisim.length()){
            isim = isim.toUpperCase().charAt(0) + isim.substring(1).toLowerCase();
            soyisim = soyisim.toUpperCase().charAt(0) + soyisim.substring(1).toLowerCase();

            // Once hepsini buyuk harfe cevirip sonra 1. den itibaren kucuk harfe ceviriyoruz
        }else{
            isim = isim.toUpperCase().charAt(0) + isim.substring(1).toLowerCase();
            soyisim = soyisim.toUpperCase();

        }
            System.out.println(isim + " " + soyisim);
    }
}
