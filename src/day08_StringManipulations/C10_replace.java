package day08_StringManipulations;

public class C10_replace {
    public static void main(String[] args) {

        // yer degistirmek icin

        String str = "Javasiz olmaz";

        // J harfinin yerini degistirmak istiyorum

        System.out.println(str.replace('J', 'H')); // Havasiz olmaz

        System.out.println(str.replace("a", "")); // a harflerinin yerini hiclikle degistirdi/sildi
                                                                // Jvsiz olmz

        System.out.println(str.replace("Javasiz", "x"));// x olmaz

        System.out.println(str.replace("v", "yayayaya"));// Jayayayayaasiz olmaz

        System.out.println(str.replace("va", "lalalala"));// Jalalalalasiz olmaz
        System.out.println(str); //Javasiz olmaz

                                // Atama yapmadigin surece Java degisiklik yapmaz/degisiklikler kalici olmaz

        str = str.replace("va", "lalalala"); //su anda str a atama yapmis olduk.Artik yazdirirsak
        //Jalalalalasiz olmaz boyle olacak

        // str1 icindeki bosluklari yok ediniz

        String str1 = "Java ile hayat Cok daha guzel";
        str1 = str1.replace(" ", "");
        System.out.println("str1 : " + str1); // str1 : JavailehayatCokdahaguzel

       // Sadece 1. a yi degistiriyoruz

        String str2 = "Java hayattir.";

        str2 =  str2.replaceFirst("a", "xxxxxx");
        System.out.println(str2); //Jxxxxxxva hayattir.

    }
}
