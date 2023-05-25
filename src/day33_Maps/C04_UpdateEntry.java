package day33_Maps;

import day32_Maps.Map_Methodlar;

import java.util.Map;

public class C04_UpdateEntry {
    public static void main(String[] args) {
        // ogrenci map inde ki tum soyisimleri buyuk harfe cevirin

        Map<Integer, String> ogrenciMap = Map_Methodlar.ogrenciMapOlustur();
        System.out.println(ogrenciMap);

        ogrenciMap = Map_Methodlar.soyisimleriBuyukHarfYap(ogrenciMap);
        System.out.println(ogrenciMap);

    }
}
