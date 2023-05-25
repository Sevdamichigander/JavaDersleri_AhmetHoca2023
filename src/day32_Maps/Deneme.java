package day32_Maps;

import java.util.HashMap;
import java.util.Map;

public class Deneme {
    public static void main(String[] args) {
        Map<Integer,String> ogrenciMap= new HashMap<>();

        ogrenciMap.put(101,"Ali-Can-11-H-MF");
        ogrenciMap.put(102,"Veli-Cem-10-K-TM");
        ogrenciMap.put(103,"Ali-Cem-11-K-TM");
        ogrenciMap.put(104,"Ayse-Can-10-H-MF");
        ogrenciMap.put(105,"Sevgi-Cem-11-M-TM");
        ogrenciMap.put(106,"Sevgi-Can-10-K-MF");

        System.out.println(ogrenciMap);

        // 1- once istenen ogrencinin value'sunu bulalim ve kaydedelim
        // 2- value ozel bir isaretle birlestirilen farkli bilgilerden olusur
        //    split("-") ile bu bilgileri bir array'e donusturup kaydedelim
        // 3- artik istedigim bilgiye tanimli index ile ulasabilirim

        String value104 = ogrenciMap.get(105);
        String[] valueArr = value104.split("-");
        System.out.println(valueArr[4]);

        System.out.println("*************************************************************");

        // numarasi verilen ogrencinin isim ve soyismini
        // ilk harfleri buyuk sonraki harfler kucuk olacak sekilde yazdirin

        /*
        Map te bir bilgiye erisim birkac adim ile mumkun oldugundan
        bu islemleri method olarak olusturup ihtiyac duyuldugunda kullanmak daha KULLANISLI olacaktir
         */

        //        map ve ogrenci numarasi verdigimizde, istenen formatta
        //        isim soyisim bilgisini bize donduren bir method olusturalim





    }
}
