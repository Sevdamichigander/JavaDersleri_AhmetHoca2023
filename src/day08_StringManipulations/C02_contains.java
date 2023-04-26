package day08_StringManipulations;

public class C02_contains {
    public static void main(String[] args) {
        // icerik kontrol edrken kullanilir
        /*
        contains methodu bir yazi parcaciginin
        baska bir yazi icerisinde olup olmadigini kontrol eder.
        Eger iceriyorsa true; yoksa false dondurur.
         */

        String str = "Java ile hersey cok kolay";

        //Yazinin icinde Java var mi diye kontrol et

        System.out.println(str.contains("java")); // false ____case sensitive oldugu icin

        System.out.println(str.contains("Java")); // true

        String arananKelime = "cok";

        System.out.println(str.contains(arananKelime));// true

        String olmayanKelime = "Deniz";

        System.out.println(str.contains(olmayanKelime));//false __ str nin icinde olmadigi icin

        System.out.println(str.contains("a"));//true ___ a harfi iceriyor mu

        System.out.println(str.contains(" ")); // true  ___ bosluk olup olmadigini kontrol ediyoruz

        System.out.println(str.contains(""));// true __ hicbir seyin var oldugunu soyluyor


    }
}
