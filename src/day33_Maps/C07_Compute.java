package day33_Maps;

import java.util.Map;
import java.util.TreeMap;

public class C07_Compute {
    public static void main(String[] args) {
        Map<String, Integer> harfKullanimSayilar = new TreeMap<>();
        harfKullanimSayilar.put("A", 20);
        harfKullanimSayilar.put("K", 10);
        harfKullanimSayilar.put("C", 25);
        harfKullanimSayilar.put("M", 23);
        harfKullanimSayilar.put("Z", 32);

        System.out.println(harfKullanimSayilar); //{A=20, C=25, K=10, M=23, Z=32}

        //A nin degerini 2 katina cikarin

        int eskiDeger = harfKullanimSayilar.get("A"); // 20
        harfKullanimSayilar.put("A", 2*eskiDeger);
        System.out.println(harfKullanimSayilar);//{A=40, C=25, K=10, M=23, Z=32}

        // B varsa degerini 3 artirin
        if (harfKullanimSayilar.containsKey("B")){
            eskiDeger = harfKullanimSayilar.get("B");
            harfKullanimSayilar.put("B", eskiDeger + 3);
        }
        System.out.println(harfKullanimSayilar); // {A=40, C=25, K=10, M=23, Z=32} B olmadigi icin hic birsey degismedi

        /*
        Java var olan veya olmayan keylerin value leri uzerinde islem yapmak icin ozel iki method gelistirmis.
        Bu methodlar functional programming(Lambda) kullanarak calisir.
         */

        //A nin degerini 2 katina cikarin

        harfKullanimSayilar.compute("A", (k,v)-> 2*v); // {A=80, C=25, K=10, M=23, Z=32}
        System.out.println(harfKullanimSayilar); //


        // B varsa degerini 3 artirin

        harfKullanimSayilar.computeIfPresent("B", (k,v)->v+3);// {A=40, C=25, K=10, M=23, Z=32}
        harfKullanimSayilar.computeIfPresent("M", (k,v)->v+3);// {A=80, C=25, K=10, M=23, Z=32}
        System.out.println(harfKullanimSayilar); //{A=80, C=25, K=10, M=26, Z=32}

        //Eger B yoksa degeri 5 olarak ekleyin
        System.out.println(harfKullanimSayilar.putIfAbsent("B", 5)); //null

        harfKullanimSayilar.put("A", 5);
        System.out.println(harfKullanimSayilar);// {A=5, B=5, C=25, K=10, M=26, Z=32}

        // Eger D yoksa degeri 5 olarak ekleyin

        harfKullanimSayilar.computeIfAbsent("D", v->5); //{A=5, B=5, C=25, D=5, K=10, M=26, Z=32}

        harfKullanimSayilar.computeIfAbsent("C", v->5);// degisiklik yapmadi

        System.out.println(harfKullanimSayilar);


    }





}
