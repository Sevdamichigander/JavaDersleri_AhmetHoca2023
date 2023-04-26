package day13_Arrays;

import java.util.Arrays;

public class C09_ElemanlariKaydirma {
    public static void main(String[] args) {
        //Soru 3- Verilen bir array’deki tum elementleri bir saga kaydirip,
        // sondaki elementi de basa tasiyacak bir method olusturun, array’i yeni haliyle kaydedin.

        // Orn : input : [4,5,6,7]  array’in son hali. : [7,4,5,6]

        int [] arr = {4,5,6,7};
        elemanlariKaydirma(arr);

    }


    public static int [] elemanlariKaydirma(int[] arr){

        int temps = arr[arr.length-1]; // son indeksi temps e atadik

        for (int i = 0; i <arr.length-1 ; i++) {

             arr[arr.length-1-i] = arr[arr.length-2-i];// 3. indekse 2. indeksi ata
                                                        //2. indekse 1. indeksi ata
                                                        // 1. indekse 0. indeksi ata

        }
        arr[0] = temps; //temps e atadigimiz son indeksi 0. i indekse atadik
        System.out.println(Arrays.toString(arr));// yazdirdik
        return arr; // yapilan islem sonucunda dondurmesini istedigimiz kod blogu/cevap

        /*
        public class ArrayShift {
            public static void shiftArray(int[] arr) {
                int lastElement = arr[arr.length - 1]; // Sondaki elemanı al
                for (int i = arr.length - 1; i > 0; i--) {
                    arr[i] = arr[i - 1]; // Elemanları sağa kaydır
                }
                arr[0] = lastElement; // Sondaki elemanı başa taşı
        }

            public static void main(String[] args) {
                int[] arr = {1, 2, 3, 4, 5};
                shiftArray(arr);
                System.out.println(Arrays.toString(arr));

		/*
		Bu program, shiftArray adında bir yöntem tanımlar,
		bu yöntem parametre olarak bir int dizisi alır
		ve dizideki tüm elemanları bir sağa kaydırır,
		son elemanı da dizi başına taşır.
		Programın main yöntemi, bir örnek diziyi oluşturur,
		bu diziyi shiftArray yöntemiyle değiştirir
		ve sonuç olarak yeni halini yazdırır.
    }
}
         */
    }
}
