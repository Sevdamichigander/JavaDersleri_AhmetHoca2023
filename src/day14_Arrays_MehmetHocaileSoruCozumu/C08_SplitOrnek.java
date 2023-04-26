package day14_Arrays_MehmetHocaileSoruCozumu;

import java.util.Arrays;

public class C08_SplitOrnek {
    public static void main(String[] args) {
        String str = "Java yilin bu zamanlarinda bir baska guzel oluyor.Java olmadan java ogrenilmez.";

                //kac tane java kelimesi geciyor. Burda hiclik kullanamayiz. space kullanmaliyiz
        /*
        1 kelimeleri ayir
        2 loop ile kelimeleri kontrol et
        3 kac tane var
         */

        str.split(" "); // donen array i kaydetmemiz lazim

        String [] arr = str.split(" ");
        System.out.println(Arrays.toString(arr)); //[Java, yilin, bu, zamanlarinda, bir, baska, guzel, oluyor.Java, olmadan, java, ogrenilmez.]
        int sayac = 0;

        // loop ile array in butun elemanlarina ulasip kontrol yaptik

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equalsIgnoreCase("java")){
                sayac++;
            }

        }
        System.out.println("java kelimesi sayaci : " + sayac);
    }
}
