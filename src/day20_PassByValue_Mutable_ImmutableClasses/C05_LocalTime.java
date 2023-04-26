package day20_PassByValue_Mutable_ImmutableClasses;

import java.time.LocalTime;
import java.time.ZoneId;

public class C05_LocalTime {
    public static void main(String[] args) {
            /*
            Java da zaman ve tarih ile ilgili pekcok class vardir.Biz 3 class gorecegiz.
            1- LocalTime class i saat ile ilgili methodlar icerir.

             */

        LocalTime saatBaslangic = LocalTime.now(); // baslangic anini kaydetti
        //LocalTime.now(); ==> bulundugu satir calistiginda bilgisayarin saatini alip
        // saat varible ina kaydeder.Ama bu canli bir kronometre degildir.
        //bulundugu satirin calistigi zamani kaydeden bir variable dir.

        System.out.println(saatBaslangic);//12:29:36.237284300
        int toplam = 0;

        for (int i = 0; i <=10000; i++) {

            toplam+=i;

        }
        System.out.println(toplam);

        LocalTime saatBitis = LocalTime.now();
        System.out.println(saatBitis);//12:29:36.240569900

        LocalTime saat = LocalTime.now(ZoneId.of("Japan"));
        LocalTime saat1 = LocalTime.now(ZoneId.of("Turkey"));
        System.out.println(saat); //19:39:07.868641900
        System.out.println(saat1); // 13:39:07.868641900

        LocalTime saat2 = LocalTime.of(11, 20, 25);
        System.out.println(saat2);//11:20:25
        LocalTime saat3 = LocalTime.ofSecondOfDay(10000);// 10000 inci saniyenin saat kacta oldugunu gosterir==> 02:46:40 ta imis

        System.out.println(saat3);
    }
}