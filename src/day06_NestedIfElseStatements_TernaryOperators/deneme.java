package day06_NestedIfElseStatements_TernaryOperators;

import java.util.Scanner;

public class deneme {
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

       /* Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz");

        int sayi = scanner.nextInt();
        int sayac = 0;

        boolean sayiMukemmelMi = true;


        if(sayi<1000 || sayi>9999) System.out.println("Gecersiz sayi girisi");

        if(sayi>=1000 && sayi<=9999) sayac++;

        if (sayi % 3 == 0) sayac++;

        if (sayi % 5 != 0) sayac++;

        if(sayi % 2 !=0) sayac++;

        if(sayac == 4) System.out.println("Mukemmel sayi");

        else System.out.println("Sayi mukemmel degil");*/

       /* Kullanicidan cinsiyetini ve yasini alin,
        //         Kadin, 60 yas ve uzeri ,
        //         Erkek 65 yas ve uzeri emekli olabilir.
        //         Cinsiyet ve yasini dikkate alarak “Emekli olabilirsin”
        //         veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin*/

       /* Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen cinsiyetinizi giriniz. \nKadin icin K, Erkek icin E");
        char cinsiyet = scanner.next().toUpperCase().charAt(0);

        System.out.println("Lutfen yasinizi giriniz");
        int yas = scanner.nextInt();

        if(cinsiyet == 'K'){
            if (yas >= 60) System.out.println("Kadin, emekli olabilir");
            else System.out.println("Kadin emekli olmak icin " + (60-yas) + " yil daha calismalidir");

        }else if (cinsiyet == 'E'){
            if (yas >= 65) System.out.println("Erkek, emekli olabilir");
            else System.out.println("Erkek emekli olmak icin " + (65-yas) + " yil daha calismalidir");

        }else System.out.println("Cinsiyet girisi hatali");*/

        //Soru 2- Kullanicidan aldigi urun adedi ve ve liste fiyatini alin,
        // kullaniciya musteri karti olup olmadigini sorun.
        // Musteri karti varsa 10 urunden fazla alirsa %20, yoksa %15 indirim yapin,
        // Musteri karti yoksa 10 urunden fazla alirsa %15, yoksa %10 indirim yapin

        /*Scanner scanner = new Scanner(System.in);

        System.out.println("Aldiginiz urun adedini giriniz");
        int urun = scanner.nextInt();

        System.out.println("Aldiginiz urunlerin liste fiyatini giriniz");
        double urunFiyati = scanner.nextDouble();

        System.out.println("Eger musteri karti varsa 'E', yoksa 'H' yaziniz.");
        char musteriKarti = scanner.next().toUpperCase().charAt(0);

        if (musteriKarti == 'E'){
            if (urun>=10) System.out.println("Fiyat " + (urunFiyati - (urunFiyati*0.20)) + " TL dir");
            else System.out.println("Fiyat " + (urunFiyati - (urunFiyati*0.15)) + " TL dir");

        } else if (musteriKarti == 'H'){

            if (urun>=10) System.out.println("Fiyat " + (urunFiyati - (urunFiyati*0.15)) + " TL dir");
            else System.out.println("Fiyat " + (urunFiyati - (urunFiyati*0.10)) + " TL dir");

        } else System.out.println("Gecersiz giris yaptiniz");*/

       /*
        Scanner scanner = new Scanner(System.in);

        int sayi = scanner.nextInt();

        System.out.println(sayi % 2 == 0 ? "cift sayidir" : "tek sayidir");*/



    }
}
