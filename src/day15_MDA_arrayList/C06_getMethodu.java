package day15_MDA_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C06_getMethodu {
    public static void main(String[] args) {

        // eger uzun bir liste olusturmak istiyorsak,
        //istersek tek tek ekleyebilecegimiz gibi (.add ile)
        // bir array olusturup loop ile tum elementleri olusturdugumuz list e de ekleyebiliriz

        int[] sayilar = {3, 5, 6, 7, 8, 3, 4, 5, 9, 6, 4, 8, 7, 2, 3};

        List<Integer> sayiList = new ArrayList<>();

        for (int i = 0; i < sayilar.length; i++) {
            sayiList.add(sayilar[i]);
        }

        System.out.println(sayiList);// [3, 5, 6, 7, 8, 3, 4, 5, 9, 6, 4, 8, 7, 2, 3]


        String[] harfler = {"a", "b", "k", "g", "p"}; // harfler array i

        List<String> harfList = new ArrayList<>(); // String lerden olusan bir list

        for (int i = 0; i <harfler.length ; i++) {
            harfList.add(harfler[i]);

        }

        System.out.println(harfList);//[a, b, k, g, p]

        // get Methodu

        System.out.println(harfList.get(3));// g
        System.out.println(harfList.get(0));// a
        System.out.println(harfList.get(harfList.size()-1));// p ----- array de length var burda size methodu


        System.out.println(sayiList.get(1));//5

        System.out.println(sayiList.get(0));//3

    }
}
