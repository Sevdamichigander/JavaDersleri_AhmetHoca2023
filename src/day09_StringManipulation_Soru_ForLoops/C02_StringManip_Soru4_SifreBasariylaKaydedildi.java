package day09_StringManipulation_Soru_ForLoops;

import java.util.Scanner;

public class C02_StringManip_Soru4_SifreBasariylaKaydedildi {
    public static void main(String[] args) {
        /*

            Soru 4 : Kullanicidan bir sifre isteyip, asagidaki sartlari kontrol edin ve
            kullaniciya duzeltmesi gereken tum eksikleri soyleyin,
            eger tum sartlari saglarsa, “sifre basariyla kaydedildi” yazdirin

          - ilk harf kucuk harf olmali
          - son karakter rakam olmali
          - sifre bosluk icermemeli
          - uzunlugu en az 10 karakter olmali

         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir sifre giriniz.");
        String sifre = scanner.nextLine();

        // Tum hatalari raporlamam istendigi icin bagimsiz if cumlesi kullanmaliyim
        // tum sartlari sagladigini kontrol etmek icin sayac kullanalim

        int sayac = 0; // kactan basladiginin onemi yok. Onemli olan sonda olmasi gereken sayiyi karsilyip karsilamadigi
        char ilkHarf = sifre.charAt(0);

        // ilk harf kucuk harf olmali

        if(!(ilkHarf>='a' && ilkHarf<='z')){
            System.out.println("Ilk harf kucuk olmali");
            sayac++;
        }

        // son karakter rakam olmali

        char sonHarf = sifre.charAt(sifre.length()-1);

        if (!(sonHarf>='0' && sonHarf<='9')){
            System.out.println("Son karakter sayi olmali");
            sayac++;
        }

        // sifre bosluk icermemeli

        if(sifre.contains(" ")){
            System.out.println("Sifre bosluk icermemeli");
            sayac++;
        }
        // Uzunlugu en az 10 karakter olmali
        if(sifre.length()<10){
            System.out.println("Sifrenin uzunlugu en az 10 karakter olmali");
            sayac++;
        }
        if(sayac ==0 ) System.out.println("Sifre basariyla kaydedildi");
        // sayac 0 olursa islem basarili
    }
}
