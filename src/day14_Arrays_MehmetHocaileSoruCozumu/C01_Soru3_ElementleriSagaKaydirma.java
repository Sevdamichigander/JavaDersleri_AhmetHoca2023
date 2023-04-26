package day14_Arrays_MehmetHocaileSoruCozumu;

import java.util.Arrays;

public class C01_Soru3_ElementleriSagaKaydirma {
    public static void main(String[] args) {
        /*
            Soru 3- Verilen bir array’deki tum elementleri bir saga kaydirip, sondaki elementi de
            basa tasiyacak bir method olusturun, array’i yeni haliyle kaydedin.
            Orn : input : [4,5,6,7] array’in son hali. : [7,4,5,6]
         */
                //1-Son elemani bir yere kaydet
                //2-geri kalan elemanlari saga kaydir
                // 3- son elemani basa al

        int[] input = {4,5,6,7};

        int [] output = new int[4]; // bos array, elemanlari saga kaydirip buna kaydedecegiz

        System.out.println(Arrays.toString(input));// [4, 5, 6, 7]

        System.out.println(Arrays.toString(output));// [0, 0, 0, 0]

        // 1. adim son elemani gecici bir yere kaydet

        int geciciKayitYeri = input[3];

        //2- elemanlari saga kaydir

        output[3] = input[2];
        output[2] = input[1];
        output[1] = input[0];

        System.out.println(Arrays.toString(output));//[0, 4, 5, 6]

        //3- kaydettigimiz son elemani yeni array in basina koyduk
        output[0] = geciciKayitYeri;

        System.out.println(Arrays.toString(output));//[7, 4, 5, 6]

        System.out.println("");





    }
}
