package day14_Arrays_MehmetHocaileSoruCozumu;

import java.util.Arrays;

public class C04_BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2,3,5,6,8,9,2,6,3};

     // sort yapmadan onceki hali

        System.out.print(Arrays.binarySearch(arr, 6));// bu array de 6 var mi==>//index// 3
        System.out.print(Arrays.binarySearch(arr, 7));//-5
        System.out.print(Arrays.binarySearch(arr, 3));//1
        System.out.print(Arrays.binarySearch(arr, 2));//0
        System.out.print(Arrays.binarySearch(arr, 4));//-3

        System.out.println("");

        Arrays.sort(arr);// Binary search oncesinde mutlaka sort yapilmasi lazim

        System.out.println(Arrays.toString(arr));//[2, 2, 3, 3, 5, 6, 6, 7, 8, 9]

        System.out.print(Arrays.binarySearch(arr, 6));// bu array de 6 var mi==>//index// 5
        System.out.print(Arrays.binarySearch(arr, 7));//-8
        System.out.print(Arrays.binarySearch(arr, 3));//2

        // var mi yok mu sorusuna cevap veriyor ama birden fazla ayni deger olabilir

        System.out.print(Arrays.binarySearch(arr, 2));//1
        System.out.print(Arrays.binarySearch(arr, 4));//-5 ==> eger bu sayi array in icinde olsaydi kacinci degerde olacaksa
                                                            // onun - halini yazdiriyor.Elemanlari saymaya 1 den basliyor.
        System.out.println("");

        //son rakamdan buyuk bir sayi aradigimizda son rakamdan sonra cevabi - olurdu seklinde geliyor

        System.out.print(Arrays.binarySearch(arr, 10));//-10
        System.out.print(Arrays.binarySearch(arr, 100));//-10
        System.out.print(Arrays.binarySearch(arr, -33));//-1


    }
}
