package day14_Arrays_MehmetHocaileSoruCozumu;

import day13_Arrays.C03_ArrayinElemanlariniToplama;
import day13_Arrays.C05_ArraydekiEnBuyukSayiyiBulma;
import day13_Arrays.C07_TumElemanlariArtir;

import java.util.Arrays;

public class C09_MethodlariKullanma {
    public static void main(String[] args) {
        // Bir arrayin butun elemanlarina 2 ekleyin

        int[]sayiArray = {1,2,7,8,9,5,4};
        System.out.println(Arrays.toString(sayiArray));//[1, 2, 7, 8, 9, 5, 4]

        C07_TumElemanlariArtir.tumElemanlariArtir(sayiArray, 2);

        sayiArray = C07_TumElemanlariArtir.tumElemanlariArtir(sayiArray, 2);

        System.out.println(Arrays.toString(sayiArray));//[5, 6, 11, 12, 13, 9, 8]


        C03_ArrayinElemanlariniToplama.elemanlarinToplaminiYazdir(sayiArray);//Array deki elementlerin toplami :64

        int enBuyukSayi=C05_ArraydekiEnBuyukSayiyiBulma.enBuyukSayi(sayiArray);
        System.out.println(enBuyukSayi);//13

        sayiArray=C11_Soru7_ElemanEklemeAtamaYontemiIle.kullaniciArrayElemanEkleme(sayiArray);
        System.out.println(Arrays.toString(sayiArray)); // [4, 4, 9, 6, 4, 6, 7, 9, 5, 99]





    }
}
