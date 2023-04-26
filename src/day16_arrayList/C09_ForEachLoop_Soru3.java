package day16_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C09_ForEachLoop_Soru3 {
    public static void main(String[] args) {


        String[] arr = {"araba", "kelam", "mehmet", "hasan"};

        isimManipulasyonuMethodu(arr);

    }

    //Soru 3- Verilen String bir array’deki her bir elementi kontrol edip,
    // - Kelimenin uzunlugu cift sayi ise ilk yarisini
    // - Kelimenin uzunlugu tek sayi ise ortadaki harf dahil ikinci yarisini
    // yeni bir listeye ekleyip yazdirin.

    public static void isimManipulasyonuMethodu(String[] arr) {
        // manipule edilen kelimeleri eklemek icin

        List<String> manipuleKelimeler = new ArrayList<>();


        // arr icindeki kelimelere tek tek ulasacagiz

        for (String each : arr) {

            //mehmet kelimesi icin

            if (each.length() % 2 == 0) {
                // ilk yarisi icin sifir ve uzunlugun yarisina kadar

                manipuleKelimeler.add(each.substring(0, each.length() / 2));

            }
            else {//uzunlugu tek sayi ise araba kelimesi icin ==> length-1/2
                manipuleKelimeler.add(each.substring((each.length() - 1) / 2));

            }

        }

        System.out.println(manipuleKelimeler);
    }

}


