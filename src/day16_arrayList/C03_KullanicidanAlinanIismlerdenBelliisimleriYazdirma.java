package day16_arrayList;

import java.util.List;

public class C03_KullanicidanAlinanIismlerdenBelliisimleriYazdirma {
    public static void main(String[] args) {

        //Kullanicidan alinan isimlerden olusan listede 3 harften fazla olan isimleri yazdirin

        List<String> yeniIsimler = C02_KullaniciListeOlusturma.kullanicidanStringAlarakListeOlusturma();

        // Listenin elemanlarina ulasmak icin bir loop
        //listenin elemanlari eger 3 harf veya fazla ise yazdiran code

        for (int i = 0; i <yeniIsimler.size() ; i++) {

            if (yeniIsimler.get(i).length()>=3){
                System.out.println(yeniIsimler.get(i));
            }

        }

    }
}
