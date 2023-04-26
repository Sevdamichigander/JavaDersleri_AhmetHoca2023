package day15_MDA_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C10_set {
    public static void main(String[] args) {

        /*
        Java de get() methodlari bize bilgi GETirir
        set() methodlari ise update yapar. Var olan bir elementin degerini degistirir.
         */

        int[] sayilar = {3, 5, 6, 7, 8, 3, 4, 5, 9, 6, 4, 8, 7, 2, 3};

        List<Integer> sayiList = new ArrayList<>();

        for (int i = 0; i < sayilar.length; i++) {
            sayiList.add(sayilar[i]);
        }
        System.out.println(sayiList);//[3, 5, 6, 7, 8, 3, 4, 5, 9, 6, 4, 8, 7, 2, 3]


        // get ==> getirir  set==> update yapar

        System.out.println(sayiList.set(0, 10)); // 3 -- 0. indekstekini 10 yap diyoruz.
                                                // Yeni degeri atamama yapar.
                                                // Eski degeri de bize bilgi vermek icin consolda dondurur

        System.out.println(sayiList);//[10, 5, 6, 7, 8, 3, 4, 5, 9, 6, 4, 8, 7, 2, 3]

        System.out.println(sayiList.set(2, 0)); //6 yi bana dondurdu --2. indekstekini 0 yap diyoruz

        System.out.println(sayiList);//[10, 5, 0, 7, 8, 3, 4, 5, 9, 6, 4, 8, 7, 2, 3]
    }
}
