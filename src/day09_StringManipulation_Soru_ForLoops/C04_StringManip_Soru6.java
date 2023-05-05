package day09_StringManipulation_Soru_ForLoops;

import java.util.Scanner;

public class C04_StringManip_Soru6 {
    public static void main(String[] args) {
        /*
            Soru 6 : Kullanicidan bir String alin,
            String’in uzunlugu cift sayi ise tam ortasina :) ekleyin,
            String’in uzunlugu tek sayi ise ortadaki harfi silin ve yerine :( yazdirin
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz");
        String metin = scan.nextLine();

        if(metin.length() % 2== 0){    //uzunluk ciftse
            metin = metin.substring(0,metin.length()/2) + ";)" + metin.substring(metin.length()/2);


        }else{    //uzunluk tek ise
            metin = metin.substring(0,metin.length()/2) + ":(" + metin.substring(1 + metin.length()/2);
            // 5/2 sonucu, int alir = 2

            //1 + metin.length()/2 ifadesi ise, 1 karakter ileri gitmek için kullanılmaktadır.
            // Eğer sadece metin.length()/2 ifadesi kullanılsaydı,
            // ortadaki karakter de dahil olmak üzere tüm karakterler :( ifadesinden sonrasına kaydırılacaktı.
            // Ancak 1 + metin.length()/2 ifadesi kullanılarak, sadece ortadaki karakterin yerine :( ifadesi eklenmesi sağlanmıştır.
        }
        System.out.println(metin);
    }
}
