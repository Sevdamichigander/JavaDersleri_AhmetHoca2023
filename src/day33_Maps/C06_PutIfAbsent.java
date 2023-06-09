package day33_Maps;

import java.util.Map;
import java.util.TreeMap;

public class C06_PutIfAbsent {
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

        // 1. Yontem

        Map<String, Integer> harfKullanimMapi = new TreeMap<>();

        // herbir harfi ele alalim
        //harf map te yoksa key harf==> value=1 olarak ekleyelim
        //harf map te varsa==>kullanim sayisi olarak tuttugumuz value u 1 artiralim


        for (String eachHarf:harfler
             ) {
            if(!harfKullanimMapi.containsKey(eachHarf)){
                harfKullanimMapi.put(eachHarf, 1);
            }else{
                int mevcutKullanimSayisi = harfKullanimMapi.get(eachHarf);// alip kaydettik
                harfKullanimMapi.put(eachHarf, mevcutKullanimSayisi+1);

            }

        }

        System.out.println(harfKullanimMapi);// {a=4, b=2, c=2, d=1, k=1, s=3, z=1}

        // 2. Yontem

        Map<String, Integer> harfKullanimMapi2 = new TreeMap<>();
        for (String eachHarf:harfler
             ) {
            if (harfKullanimMapi2.putIfAbsent(eachHarf, 1)!=null){
                int mevcutKullanimSayisi = harfKullanimMapi2.get(eachHarf);// alip kaydettik

                harfKullanimMapi2.put(eachHarf, mevcutKullanimSayisi+1);
            }

            // null sa zaten ekliyor.
            // null degilse varsa ekelemiyo eski degeri donduruyor
        }
        System.out.println(harfKullanimMapi2);// {a=4, b=2, c=2, d=1, k=1, s=3, z=1}
    }

}
