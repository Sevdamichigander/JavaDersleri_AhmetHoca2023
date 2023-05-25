package day33_Maps;

import day32_Maps.Map_Methodlar;

import java.util.Map;

public class C01_Tekrar {
    public static void main(String[] args) {

        Map<Integer, String> ogrenciMap = Map_Methodlar.ogrenciMapOlustur();

        System.out.println(ogrenciMap);//{101=Ali-Can-11-H-MF, 102=Veli-Cem-10-K-TM, 103=Ali-Cem-11-K-TM, 104=Ayse-Can-10-H-MF, 105=Sevgi-Cem-11-M-TM, 106=Sevgi-Can-10-K-MF}

        // tum ogrenci listesini yazdir

        Map_Methodlar.tumOgrenciListesiYazdir(ogrenciMap); //1- Ali Can
        //2- Veli Cem
        //3- Ali Cem
        //4- Ayse Can
        //5- Sevgi Cem
        //6- Sevgi Can

        // Numarasi verilen bir ogrencinin soyismini update edin

        Map_Methodlar.numaraIleSoyisimUpdateEt(ogrenciMap,102, "Janjan");


        // 110 dan kucuk olan numaralardaki ogrencileri listele

        Map_Methodlar.numaraAraligindakiOgrencileriyazdir(ogrenciMap, 1, 103);

        // istenen siniftaki ogrencileri yazdirin

        Map_Methodlar.istenenSiniftakiOgrencileriYazdir(ogrenciMap,10);

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


    }
}
