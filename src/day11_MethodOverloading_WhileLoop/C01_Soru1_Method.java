package day11_MethodOverloading_WhileLoop;

public class C01_Soru1_Method {

    //Soru 1- Kullanicidan input olarak alinan bir String'den ,
    // baslangic ve bitis indexlerine gore baslangic index’i dahil,
    // bitis index’i haric olacak sekilde
    // aradaki harfleri yazdiran bir method olusturun.

    // - kullanici baslangic degeri olarak, bitis degerinden buyuk bir sayi girerse, hata mesaji verin
    // - kullanici str’da olan index’lerden daha buyuk bir index girerse hata mesaji yazdirin.

    public static void main(String[] args) {


        substringYazdir("Java candir", 2, 15);//Istediginiz index metin'in disinda
        substringYazdir("Java candir", 2, 7);//va ca
        substringYazdir("Java candir", 2, 2);//


    }

    public static void substringYazdir(String metin, int basIndex, int bitIndex) {

        //"Java candir", 2, 7

        if (basIndex > bitIndex) {

            System.out.println("Baslangic indeksi bitis indexsinden buyuk olamaz");
        }
        else if ((bitIndex > metin.length() - 1)) {
            System.out.println("Istediginiz index metin'in disinda");
        }
        else {
            for (int i = basIndex; i < bitIndex; i++) {
                System.out.print(metin.charAt(i));

            }

        }

    }
}
