package day34_NestedMaps;

import java.util.ArrayList;
import java.util.List;

public class C02_FarkliDataTurleriKullanimi {

    public static void main(String[] args) {

        /*
        Java da farkli data turlerinden degerler eklemek istedigimiz
        herhangi bir non-primitive variable(List, Set, Map gibi) larin
        data turunu Object secebiliriz.
        Avanatji ==> icine ne gelirse koyabilirsin
        Dezavantaji ==> Elementler obje olarak kaydedildigi icin
        asil data turu herhangi bir element icin kendi data turune ait (String, int, boolean ....)
        methodlari direkt kullanamayiz.

        Eger bir elementin data turunu net olarak biliyorsak
        ve o data turune ait bir methodu kullanmak istersek
        data casting yapabiliriz.
         */

        List<String> ogrenciList = new ArrayList<>();
        ogrenciList.add("Sevda");
        System.out.println(ogrenciList); // [Sevda]
        // ogrenciList.add(12); kabul etmiyor
        // ogrenciList.add(true);

        /*
        Tum data turlerinde bilgiyi kabul edecek bir list olusturmak istesek


         */

        List<Object> hersey = new ArrayList<>();
        hersey.add("Selgun");
        hersey.add(12);
        hersey.add(true);

        System.out.println(hersey); // [Selgun, 12, true]

        // ogrenci list te ki ilk ogrencinin bas harfini yazdirin

        System.out.println(ogrenciList.get(0).substring(0, 1)); //S

        // hersey de ki ilk elementin bas harfini yazdirin

        ((String)hersey.get(0)).charAt(0); // String oldugundan eminsek casting yapiyoruz.


        // hersey de ki 2. elementin degerinin 2 katini yazdirin

        System.out.println(((Integer) hersey.get(1))); //12

        // hersey deki 3. element true ise Merhaba, false ise Hoscakal yazdirin

        if ((Boolean) hersey.get(2)){
            System.out.println("Merhaba");
        }else {
            System.out.println("Hoscakal");
        }
    }
}
