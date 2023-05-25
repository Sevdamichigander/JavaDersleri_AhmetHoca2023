package day33_Maps;

import day32_Maps.Map_Methodlar;

import java.util.Map;

public class C02_EntrySet {

    /* Su ana kadar bize bir map verildiginde
        key lere ogrenciMap.keySet() ile,
        value lere ogrenciMap.values() ile ulasabiliyoruz.

        eger hem key hem de value ile islem yapmamiz gerekirse
        mecburen key lerin bulundugu Set
        ve value larin bulundugu Collection
        objelerini beraber yonetmemiz gerekiyordu.

        Java key ve ve value lari birlikte barindirmasi icin
        Entry isimli bir class olusturmustur.

        Entry ile key ve value yu birlikte kullanabilir,
        entry uzerinde yapilan updateleri otomatik olarak map e isleyebiliriz.


         */
    public static void main(String[] args) {
        // ogrenci listesini numara-isim-soyisim ve sinif seklinde yazdirin

        Map<Integer, String> ogrenciMap = Map_Methodlar.ogrenciMapOlustur();

        Map_Methodlar.numaraliTumOgrenciListesiYazdir(ogrenciMap);
    }



}
