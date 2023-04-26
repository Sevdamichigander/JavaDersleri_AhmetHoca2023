package day11_MethodOverloading_WhileLoop;

import java.util.Scanner;

public class C07_SifreKontrolu {
    /*
       Kullanicidan asagidaki sartlari saglayan bir sifre isteyin.
       Kullanici uygun sifre girinceye kadar yeniden sifre isteyin.

       sifrenin kontrolunu bir methodda yapip
       sifre uygunsa true
       degilse false dondurun

       - ilk harf kucuk harf olmali
     - son karakter rakam olmali
     - sifre bosluk icermemeli
     - uzunlugu en az 10 karakter olmali

        */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sifre = "";
        boolean sifreGecerliMi=false; // basta false olsun ki calissin
                                    // amac sifreGecerliMi de true yu yakalamak.

        while (!sifreGecerliMi){ // Ama burasi, while loop un calismasi icin loop parantezinin ici false olmali.
                                // Loop, ici true olana kadar calisacak
                                // sifreGecerliMi true oldugunda while loop sartinin false olmasi lazim ki loop bitsin?????
                            // sifreGecerliMi==> false, while loop calismali mi==>true yu istiyoruz

            System.out.println("Lutfen bir sifre girin");
            sifre= scanner.nextLine(); // sifreyi kullanicidan aliyorum
            sifreGecerliMi=sifreKontrolEt(sifre);//sifreKontrolEt methoduna sifreyi yolladik, gelen sonucu da
                                                 // sifreGecerliMi ye kaydettik
            /*
            sifreKontrolEt : Eger method call u kullanacagimiz yere once yazarsak(yukaridaki gibi),
            kirmizinin ustune gittigimizde intelij method u bizim icin olusturuyor.
            Sadece private i public e cevirdik
             */
        }
        System.out.println("Sifreniz basarili olarak kaydedildi");
    }




    public static boolean sifreKontrolEt(String sifre) {
        int sayac=0;
        //          - ilk harf kucuk harf olmali
        char ilkHarf=sifre.charAt(0);
        if (!(ilkHarf>='a' && ilkHarf<='z')){
            System.out.println("Ilk harf kucuk harf olmali");
            sayac++;
        }
        //          - son karakter rakam olmali
        char sonHarf= sifre.charAt(sifre.length()-1);
        if (!(sonHarf>='0' && sonHarf<='9')){
            System.out.println("Son karakter sayi olmali");
            sayac++;
        }
        //          - sifre bosluk icermemeli
        if (sifre.contains(" ")){
            System.out.println("Sifre bosluk icermemeli");
            sayac++;
        }
        //          - uzunlugu en az 10 karakter olmali
        if (sifre.length()<10){
            System.out.println("Sifrenin uzunlugu en az 10 karakter olmali");
            sayac++;
        }
        if (sayac==0){
            return true;
        }else{
            return false;
        }
    }
}
