package day21_DateTime_Varargs;

import java.time.LocalTime;

public class C01_LocalTime {
    public static void main(String[] args) {
        LocalTime saat = LocalTime.now();  //LocalTime class indan now methodunu kullanip LocalTime donduruyoruz.
        // calistigi anda sistemde var olan zamani alip saat variable ina kaydeder.
        //kronometre gibi calismaz. 8. satirin calistigi zamani kaydeder.
        //eger fzrkli satirlarin calisma zamanlarini gormek istersek,
        //o satirlarda da yeni LocalTime objeleri olusturmaliyiz.

        System.out.println(saat);// zamani saat dakika saniye ve nano saniye olarak kaydeder.
                                //10:04:58.100125

        System.out.println(saat.getNano());//732159300
        System.out.println(saat.getHour());//10
        System.out.println(saat.getMinute());//7


        System.out.println(saat.withHour(14));// Diger bilgiler ayni, sadece saat kismini benim istedigim ile degistirdi.

        /*
        get methodlari bize saatin istedigimiz bolumunu getirir.
        with metodlari saatin istedigimiz bolumunu istedigimiz yeni bir deger ile degistirerrek zamani verir.
         */
        System.out.println(saat.withHour(11).withSecond(0).withNano(0));
        //11:10 - second ve nano yu almak istemiyorsak 0 degeri atayarak onlari iptal edebiliriz.

        System.out.println(saat.plusHours(100));// 100 saat sonra saat kac olur un cevabini veriyor
        //14:13:08

        System.out.println(saat.plusMinutes(10000));// 100000 dakika sonra saat kac?  08:53:44.153123700
        System.out.println(saat.minusHours(37).minusMinutes(22));//37 saat 22 dakika once saatin kac oldugunu gosterir

        /*
        plus ve minus methodlari saati istedigimiz miktarda ileri veya geri goturur.
         */

        // Istedigimiz saat, dakika, saniye ve nano saniye ile zaman variable i olusturmak istersek

        LocalTime istenenZaman = LocalTime.of(12,23,15,10);
        System.out.println(istenenZaman);// 12:23:15.000000010

        //iki zamani birbiriyle karsilastirmak istersek(once mi sonra mi)

        System.out.println(istenenZaman.isAfter(saat));// istenen zaman bizim olusturdugumuz su anki saat ten once mi sorusuna cevap verecek
                                                        // true

        System.out.println(istenenZaman.isBefore(saat));//false

        System.out.println(saat.compareTo(istenenZaman));//-1 geride
        System.out.println(istenenZaman.compareTo(saat));//1

        // Iki zamani karsilastirir.Kucukse -, buyukse + bilgi doner.

    }
}
