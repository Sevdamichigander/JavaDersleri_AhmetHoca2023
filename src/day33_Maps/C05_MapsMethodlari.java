package day33_Maps;

import day32_Maps.Map_Methodlar;

import java.util.Map;

public class C05_MapsMethodlari {

    public static void main(String[] args) {
        Map<Integer, String> ogrenciMap = Map_Methodlar.ogrenciMapOlustur();

        ogrenciMap.put(110, "Sevda-Fan-12-H-MF");
        ogrenciMap.put(101, "Ayse-Yan-10-M-MF");

        System.out.println(ogrenciMap);

        // map e element ekler
        //eklenen key zaten map de varsa eski value yu yeni value olarak pdate eder.


        ogrenciMap.replace(102,"Aysegul-Man-11-M-MF" );// 102=Veli-Cem-10-K-TM, ==>102=Aysegul-Man-11-M-MF,
        // Bu haliyle put ile ayni islevi gorur

        ogrenciMap.replace(103,"Ali-Cem-11-K-TM", "Kubra-Can-11-K-TM ");
        ogrenciMap.replace(104,"Ayse-Cem-10-H-MF", "Ilknur-Dan-9-H-F ");
        // verilen key in value su eski bilgiyi dogru vermeyince degistirmiyor
        System.out.println(ogrenciMap);

        // getOrDefault ==> if else gibi calisti
        // aranan key varsa value sunu dondurur.
        //aranan key yoksa tanimladigimiz default degeri dondurur
        //get() ten farki bulamadiginda null degil default degeri dondurmesidir.

        System.out.println(ogrenciMap.getOrDefault(105, "Bu ogrenci map te yok"));//Sevgi-Cem-11-M-TM
        System.out.println(ogrenciMap.getOrDefault(120, "Bu ogrenci map te yok")); //Bu ogrenci map te yok
        System.out.println(ogrenciMap.get(120)); // null


        // contains
        System.out.println(ogrenciMap.containsKey(105)); // true
        System.out.println(ogrenciMap.containsValue("Ayse"));// false

        // containsValue, bir butun olarak value lari kontrol eder
        // value icindeki string leri kontrol etmez
        // birebir map te ki value lerle eslesen varsa true doner
        System.out.println(ogrenciMap.containsValue("Aysegul-Man-11-M-MF"));// true

        System.out.println(ogrenciMap.size());// 7
        System.out.println(ogrenciMap.putIfAbsent(120, "Nurhayat-Zan-12-M-MF")); // map te yoktu, onu ekledi
        System.out.println(ogrenciMap.putIfAbsent(102, "Ahmet-Ban-12-M-MF"));// map te var oldugu icin "Ahmet-Ban-12-M-MF" i eklemedi.
        System.out.println(ogrenciMap);


    }




}
