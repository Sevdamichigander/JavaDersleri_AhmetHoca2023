package day13_Arrays;

import java.util.Arrays;

public class C07_TumElemanlariArtir {
    public static void main(String[] args) {
        //Verilen bir int array’in tum elemanlarini
        // istenen deger kadar artirip bize donduren bir method olusturun.
        // Eski array’i yeni haliyle kaydedin.

        int[] arr = {3,5,7,2,1,9};

        int artisMiktari = 5;

        arr = tumElemanlariArtir(arr, artisMiktari);
        System.out.println(Arrays.toString(arr));

    }
    public static int[] tumElemanlariArtir(int [] arr, int artisMiktari){

        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + artisMiktari;
        }

        return arr;
    }
}
