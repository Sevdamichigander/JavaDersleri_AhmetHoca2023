package day03_DataCasting_WrapperClasses;

public class C05_WrapperClasses {
    public static void main(String[] args) {
        int sayi = 10;

        //primitive data turlerinin hazir methodlari YOKTUR
        //Java primitive data turleri ile bazi methodlari kullanabilmemiz icin
        // ozel wrapper classlar olusturmus.

        Integer sayiWrap = 10;
        /*
        Byte
        Short
        Integer
        Long
        Float
        Double
        Character
        Boolean classlari primitive data turleri ile ayni degerleri alabilir.
        Ayni data turundeki primitive ve wrapper class arasinda hicbir casting olmaksizin atama yapilabilir.
         */

        //sayWrap = sayi;
        //sayi = sayWrap;

        System.out.println(Integer.MAX_VALUE); //  2147483647
        System.out.println(Integer.MIN_VALUE); // -2147483648

        String str1 = "34";
        String str2 = "45";

        //bu iki string icindeki sayilarin toplamini yazdirin

        System.out.println(str1+str2); //3445

        System.out.println(Integer.parseInt(str1) + Integer.parseInt(str2)); // 79

        //parse.Int ------ String i(sadece sayidan olusmasi sartiyla) integer a cevirir.

        char chr = 'm';

        // chr yi buyuk harf olarak yazdirin

        System.out.println(Character.toUpperCase(chr)); // M

        System.out.println(Character.isAlphabetic(chr)); //true
        System.out.println(Character.isDigit(chr));//false

        Double dbl = 34.4;
        String doubleStr = "44.3";

        //doublestr degerinin 5 eksigini yazdirin

        System.out.println((Double.parseDouble(doubleStr) - 5)); //39.3


    }
}
