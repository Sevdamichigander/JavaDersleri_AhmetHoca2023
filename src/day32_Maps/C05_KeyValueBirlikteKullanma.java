package day32_Maps;

import java.util.Map;

public class C05_KeyValueBirlikteKullanma {
    public static void main(String[] args) {

        Map<Integer, String> ogrenciMap = Map_Methodlar.ogrenciMapOlustur();

        // ogrenci numarasi verilen iki deger arasinda olan (sinir degerleri dahil)
        // tum ogrencilerin numara, isim, soyisim ve bolumlerini yazdirin

        int basNo= 90;
        int bitNo= 103;

        Map_Methodlar.numaraAraligindakiOgrencileriyazdir(ogrenciMap,basNo,bitNo);







    }

}
