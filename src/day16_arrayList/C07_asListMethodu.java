package day16_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C07_asListMethodu {
    public static void main(String[] args) {

        Integer[] arr = {1,3,5,7,9,};

        //verilen bir array i list e cevirmek icin for loop olusturup list e eklemeyi tavsiye ediyoruz.
        //yine de gormak adina asList methodunu kullanacagiz

        List<Integer> arraydenList = Arrays.asList(arr);

        System.out.println(arraydenList); // [1, 3, 5, 7, 9]

        System.out.println("Array : " + Arrays.toString(arr));//Array : [1, 3, 5, 7, 9]
        System.out.println("Arrayden list : " + arraydenList);//Arrayden list : [1, 3, 5, 7, 9]

        //olusturulan listeye ekleme cikartma yapilabilmeli

        /*arraydenList.add(5);// hata verdi ---UnsupportedOperationException
        arraydenList.remove(3);// hata verdi ---UnsupportedOperationException

        Burda arrayden list olusturuyoruz ama hala array oldugu icin list in methodlarini kullanamiyoruz. hata veriyor

        */

        arr[0] = 23;
        System.out.println("Array : " + Arrays.toString( arr));//Array : [23, 3, 5, 7, 9]
        System.out.println("Arrayi degistirdikten sonra listin hali : " + arraydenList);//[23, 3, 5, 7, 9]

        /*
        asList methodunun bir arrayi listeye cevirirken asList methodunu kullanmanin iki dezavantaji vardir:
        1- asList methodu ile olusturulan liste esnek bir yapiya sahip degildir. Ekleme veya cikarma yapamayiz.
        2- Kaynak array degistirildigi zaman, bu array den olusturulan liste de otomatik olarak degisir.
         */


    }
}
