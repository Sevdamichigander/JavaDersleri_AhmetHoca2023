package day33_Maps;

import java.util.Map;
import java.util.TreeMap;

public class C08_Compute {
    public static void main(String[] args) {
        /*
        Soru : Verilen bir array’de kullanilan harfleri ve kacar defa kullanildigini yazdirin.
                Input : {"a","b","s","a","s","c","d","b","c","a","a","s","z","k"}
                output : 1 kullanimi : 3 adet
                 a kullanimi : 4 adet
                 b kullanimi : 2 adet
                 c kullanimi : 2 adet
                 d kullanimi : 1 adet
                 k kullanimi : 1 adet
                 s kullanimi : 3 adet
                 z kullanimi : 1 adet


         */

        String[] harfler = {"a","b","s","a","s","c","d","b","c","a","a","s","z","k"};

        Map<String, Integer> harfKullanimMapi = new TreeMap<>();
        for (String eachHarf:harfler
             ) {
            harfKullanimMapi.computeIfPresent(eachHarf, (k,v)->v+1);
            harfKullanimMapi.putIfAbsent(eachHarf, 1);

        }
        System.out.println(harfKullanimMapi);//{a=4, b=2, c=2, d=1, k=1, s=3, z=1}
    }
}
