package day03_DataCasting_WrapperClasses;

public class C04_DataCasting {

    public static void main(String[] args) {
        int sayi = 10;
        boolean bl = true;
        char chr =  'K';

        // String bir ifade baska turdeki variable veya degerlerle isleme girerse
        // onlari da stringlestirir.

        String str = sayi + ""; //10
        System.out.println(str.charAt(0)); //1
        str = bl + "";
        System.out.println(str.charAt(1)); //r

        str = chr + ""; //k

        System.out.println(str.toLowerCase());


    }
}
