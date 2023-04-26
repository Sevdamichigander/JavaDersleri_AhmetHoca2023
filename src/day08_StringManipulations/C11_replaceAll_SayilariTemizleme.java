package day08_StringManipulations;

public class C11_replaceAll_SayilariTemizleme {
    public static void main(String[] args) {

        // str icindeki butun sayilari method ile temizleyin

        String str = "J23a3345v4353a 234C354345a3456n345dir"; // sadece yazilari test etmek istedigimizde butun rakamlari silebiliriz

        /*

        replaceAll methodu, elementlerin ortak ozelliklaeini kullanarak
         genel islem yapmak icin kullanilir. Mesela butun sayilari sil/silme

         regex ==> ortak ozelligi simgeliyor
         // ====  \\d digits
         */
        System.out.println(str.replaceAll("\\d", "")); //Java Candir

        /*
        Genel ozellikler Java da regex olarak tanimlaniyor
         */


    }
}
