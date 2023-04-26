package day15_MDA_arrayList;

import day14_Arrays_MehmetHocaileSoruCozumu.C11_Soru7_ElemanEklemeAtamaYontemiIle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C04_ArrayListOlusturma {

    public static void main(String[] args) {

        // Array in uzunlugu degistirilemedigi icin calisma ortaminda pek tercih edilmez
        // Java ekleme ve silme yapabilecegimiz bir yapi olusturmustur. Adi ==> ArrayList
        //Array altyapisini kullanir ama uzunluk acisindan esnektir.
        //Dezavantaji ==> elementleri tek tek eklemek zorunda olmamizdir.

        //asagidaki array e element olarak 10 u ekleyelim

        int [] arr = {3,5,6};

        arr = C11_Soru7_ElemanEklemeAtamaYontemiIle.kullaniciArrayElemanEkleme(arr);
        arr = C11_Soru7_ElemanEklemeAtamaYontemiIle.kullaniciArrayElemanEkleme(arr);
        arr = C11_Soru7_ElemanEklemeAtamaYontemiIle.kullaniciArrayElemanEkleme(arr);
        arr = C11_Soru7_ElemanEklemeAtamaYontemiIle.kullaniciArrayElemanEkleme(arr);
        arr = C11_Soru7_ElemanEklemeAtamaYontemiIle.kullaniciArrayElemanEkleme(arr);

        System.out.println(Arrays.toString(arr));// [3, 5, 6, 10]

        //Bir array list olusturmak istersek

        List<Integer> sayilar = new ArrayList<>();

        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(6);
        System.out.println(sayilar); // [3, 5, 6]




    }
}
