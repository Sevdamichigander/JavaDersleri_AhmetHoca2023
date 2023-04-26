package day14_Arrays_MehmetHocaileSoruCozumu;

import java.util.Arrays;

public class C06_ArraylerdeDegerAtama {
    public static void main(String[] args) {


        String str = "Ahmet";
        str = "Mehmet";
        /*
        Arraylerin uzunluklari degistirilemez.
        Ama bir array e yeni bir array atamasi yapabiliriz.
         */

        String[] arr1 = {"Ali","Veli"};
        String[] arr2 = {"A","B","C"};

        // arr2 = {"Veli", "Hasan"} // Array olustuktan sonra suslu parantez ile atama yapilamaz

        arr1 = arr2;

        System.out.println(Arrays.toString(arr1));// [A, B, C]
        System.out.println(Arrays.toString(arr2));// [A, B, C]

        // eski bir array e atama yapamayiz ama yeni bir array olusturup assign edebiliriz

        arr1 = new String[5];
        System.out.println(Arrays.toString(arr1));//[null, null, null, null, null]


    }
}
