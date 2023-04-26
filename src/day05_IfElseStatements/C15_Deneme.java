package day05_IfElseStatements;

import java.util.Scanner;

public class C15_Deneme {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);

        /*System.out.println("Lutfen bir sayi giriniz");

        If Statements Soru 1
        int sayi1 = scanner.nextInt();

        if(sayi1 % 5 == 0) System.out.println("Sayi 5 in tam kati");
        else System.out.println("Sayi 5 e tam bolunmez"); */

        // Soru 2
        /*System.out.println("Lutfen yazdirmak istediginiz ayin ilk harfini giriniz");

        char ilkHarf = scanner.next().toUpperCase().charAt(0);

        if(ilkHarf == 'O') System.out.println("Ocak");
        if(ilkHarf == 'S') System.out.println("Subat");
        if(ilkHarf == 'M') System.out.println("Mart veya Mayis");
        if(ilkHarf == 'N') System.out.println("Nisan");
        if(ilkHarf == 'H') System.out.println("Haziran");
        if(ilkHarf == 'T') System.out.println("Temmuz");
        if(ilkHarf == 'A') System.out.println("Agustos veya Aralik");
        if(ilkHarf == 'E') System.out.println("Eylul veya Ekim");
        if(ilkHarf == 'K') System.out.println("Kasim");

        //else System.out.println("Lutfen gecerli bir harf giriniz");*/


        /*Extra soru : Verilen bir sayinin 2,3,5,7,11 ve 23 sayilarindan kac tanesine
        // kalansiz olarak bolunebildigini yazdirin.
        //ornegin kullanici 30 dediginde output : 3 olmali

        System.out.println("Lutfen bir sayi giriniz");

        int sayi1 = scanner.nextInt();

        int sayac = 0;



        if (sayi1 % 2 == 0) sayac++;
        if (sayi1 % 3 == 0) sayac++;
        if (sayi1 % 5 == 0) sayac++;
        if (sayi1 % 7 == 0) sayac++;
        if (sayi1 % 11 == 0) sayac++;
        if (sayi1 % 23 == 0) sayac++;

        System.out.println("Kalansiz olarak " + sayac + " sayiya bolunebilir."); */

        /*Soru 4

         /*

        System.out.println("Lutfen sirasiyla ucgenin 3 kenar uzunlugunu yaziniz");

        double kenar1 = scanner.nextDouble();
        double kenar2 = scanner.nextDouble();
        double kenar3 = scanner.nextDouble();

        if(kenar1 == kenar2 && kenar2 == kenar3) System.out.println("Eskenar ucgen");*/

        /*If Else Soru 4



        System.out.println("Lutfen bir karakter giriniz");
        char karakter = scanner.next().charAt(0);

        if(karakter>'A' && karakter<'Z') System.out.println("Girilen karakter buyuk harftir");
        else System.out.println("Girilen karakter buyuk harf degildir");  */

        /*
        Soru 5



        System.out.println("Lutfen bir harf giriniz");

        char harf = scanner.next().charAt(0);

        if(harf>='a' && harf<='z') System.out.println("Girilen harfin yeni hali : " + Character.toUpperCase(harf));
        else System.out.println("Girilen harf : " + harf); */

        /*

        System.out.println("Lutfen notunuzu giriniz");

        double not = scanner.nextDouble();

        if(not<0 || not>100) System.out.println("Gecersiz not");
        else if(not>85) System.out.println("Bravo");
        else if(not>65) System.out.println("Hadi iyisin");
        else if(not>50) System.out.println("Biraz calis");
        else System.out.println("Yok artik"); */

        /*If Else _ Soru 2


        System.out.println("Lutfen kilonuzu kg cinsinden giriniz");
        double kilo = scanner.nextDouble();

        System.out.println("Lutfen boyunuzu cm cinsinden giriniz");
        double boy = scanner.nextDouble();

        double vke = kilo*10000/(boy*boy);

        if (vke>30) System.out.println("Obez");
        else if (vke>25) System.out.println("Kilolu");
        else if (vke>20) System.out.println("Normal");
        else System.out.println("Zayif");  */

        // System.out.println("===========================================")


        // Soru 1- Kullanicidan cinsiyetini ve yasini alin,
        //         Kadin, 60 yas ve uzeri ,
        //         Erkek 65 yas ve uzeri emekli olabilir.
        //         Cinsiyet ve yasini dikkate alarak “Emekli olabilirsin”
        //         veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin

/*
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen cinsiyetinizi giriniz. \nKadin icin : K, Erkek icin : E" );

        char cinsiyet = scanner.next().toUpperCase().charAt(0);

        System.out.println("Lutfen yasinizi giriniz");

        int yas = scanner.nextInt();

        if (cinsiyet == 'K' && yas >= 60){
            System.out.println("Emekli olabilirsin");
        } else if (cinsiyet == 'K' && yas< 60) {
            System.out.println("Kadin emekli olmak icin " + (60-yas) + " yil daha calismalidir.");
        }
        if (cinsiyet == 'E' && yas >= 65){
            System.out.println("Emekli olabilirsin");
        } else if (cinsiyet == 'E' && yas< 65) {
            System.out.println("Erkek emekli olmak icin " + (65-yas) + " yil daha calismalidir.");
        }*/



    }
}

