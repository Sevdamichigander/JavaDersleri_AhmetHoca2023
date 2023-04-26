package day14_Arrays_MehmetHocaileSoruCozumu;

import java.util.Arrays;

public class C03_EnBuyukEnKucukElemanYazdirma {
    public static void main(String[] args) {
       /*
       BIr arrayin en buyuk ve en kucuk elemanini yazdirin
        */

        int[] arr  ={1,5,4789,6,3,2,4,54,67,325};

        System.out.println(Arrays.toString(arr));//[1, 5, 4789, 6, 3, 2, 4, 54, 67, 325]

        enBuyukEnKucukElemanYazdirma(arr);
        System.out.println(Arrays.toString(arr));//[1, 2, 3, 4, 5, 6, 54, 67, 325, 4789]

       //sort yazilari siraya koymak icin de kullanilabilir

        String[] arrStr = {"Ali","Veli", "Hasan"};

        Arrays.sort(arrStr);
        System.out.println(Arrays.toString(arrStr)); //[Ali, Hasan, Veli]



    }

    public static void enBuyukEnKucukElemanYazdirma(int [] arr){

        //Arrays classindan sort methodu ile elemanlari siraladik

        Arrays.sort(arr);
        // siralandiktan sonra en kucuk elemani en basta olacagi icin

        System.out.println("Arrayin en kucuk elemani : " + arr[0]);//Arrayin en kucuk elemani : 1

        //Siralandiktan sonra en buyuk eleman en sonda olacagi icin
        System.out.println("Array'in en buyuk elemani : " + arr[arr.length-1]);//Array'in en buyuk elemani : 4789


    }
}
