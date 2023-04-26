package day15_MDA_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C07_remove {
    public static void main(String[] args) {

        String[] harfler = {"a", "b", "k", "g", "p"};

        List<String> harfList = new ArrayList<>();

        for (int i = 0; i <harfler.length ; i++) {
            harfList.add(harfler[i]);

        }

        System.out.println(harfList);

        System.out.println("*******************************");

        //methodlarin yaptiklari is ile dondurdukleri sonuc her zaman ayni olmayabilir

        // remove methodunda obje verirsek, bulursa siler ve true dondurur.
        // Bulamazsa silemedigi icin false dondurur.

        System.out.println(harfList.remove("k"));// true == gittim buldum sildim demek
        System.out.println(harfList);// [a, b, g, p]

        System.out.println(harfList.remove("x")); // false == listede yok demek
        System.out.println(harfList);//false

        // remove methodu index ile verilirse
        // index liste icinde varsa elemani siler ve
        // sildigi elemani bize dondurur
        //index yoksa exception olusur.

        System.out.println(harfList.remove(1)); //b yi siler ve delil olarak bana getirir
        System.out.println(harfList);//[a, g, p]

        // olmayan index girersek ==>exception olusur

        // System.out.println(harfList.remove(23));// IndexOutOfBoundsException
        // remove() index ile verilirse index liste icinde varsa
        // elemani siler ve sildigi elemani bize dondurur
        // index yoksa exception olusur

    }
}
