package day05_IfElseStatements;

import java.util.Scanner;

public class C04_IfStatementSoru_Sayac {
    public static void main(String[] args) {
        //Verilen bir sayinin 2,3,5,7,11 ve 23 sayilarindan kac tanesine
        // kalansiz olarak bolunebildigini yazdirin.
        //ornegin kullanici 30 dediginde output : 3 olmali

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz");
        int girilensayi= scanner.nextInt();
        int sayac=0;
        if (girilensayi%2==0) sayac++ ;
        if (girilensayi%3==0) sayac++ ;
        if (girilensayi%5==0) sayac++ ;
        if (girilensayi%7==0) sayac++ ;
        if (girilensayi%11==0) sayac++ ;
        if (girilensayi%23==0) sayac++ ;
        System.out.println("Girilen sayi, istenen sayilardan "+ sayac + " tanesine tam bolunebiliyor." );

    // sart saglama ile ilgili testlerde bunu uyguluyoruz.
        // 5 sarti saglayan basvurulari kabul edin gibi. Herbir sartta sayaci arttiriyoruz.


    }
}
