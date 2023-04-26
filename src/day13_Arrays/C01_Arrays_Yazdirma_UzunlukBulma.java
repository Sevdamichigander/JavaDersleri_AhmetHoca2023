package day13_Arrays;


import java.util.Arrays;

public class C01_Arrays_Yazdirma_UzunlukBulma {
    public static void main(String[] args) {
        String[] arr1 = {"Ayten","Sevda","Adem"};

        // Array i yazdirmak istersek;
        /*
        - birden fazla eleman barindirdigi icin direk yazdiramayiz.

        //  System.out.println(arr1);  / /@49e4cb85 referansi yazdirir

        - Arrays class in dan toString methodunu kullanmaliyiz.
        System.out.println(Arrays.toString(arr1));
        - koseli parantez icinde elementleri yazdirir.
        - Elementler arasinda bir virgul ve bir space birakir.(standard)

         */
        System.out.println(Arrays.toString(arr1)); // [Ayten, Sevda, Adem]

        /*
        Bir array in uzunluguna ulasmak istersek;
            length kullaniriz. array de kac tane element oldugunu gosterir
         */

        System.out.println(arr1.length); // 3

        // length burda method degil variable dir. Yaninda () olsaydi method olurdu.

       //  int[] arr2 = new int[];  CTE verir, cunku uzunluk eksik. Uzunlugu da belirtmeliyiz

        int[] arr2 = new int[6];
        System.out.println(Arrays.toString(arr2)); // [0, 0, 0, 0, 0, 0] elementlere deger atamadigim icin boyle oldu.

        arr2[0] = 5; // arr2 nin 0. indeksindeki element 5 olsun
        arr2[3] = 9;
        arr2[4] = 1;

        System.out.println(Arrays.toString(arr2)); //[5, 0, 0, 9, 1, 0]



    }
}
