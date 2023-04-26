package day07_SwitchStatements_StringManipulations;

public class C08_Equals {
    public static void main(String[] args) {

        String str1 = "Java";
        String str2 = "Java";
        String str3 = "java";
        String str4 = "JAVA";
        String str5 = "JaVa";
        String str6 = new String("Java");

        // Normalde non-primitive data turundeki objeler, new keyword u ile olusturulur.
        //String i de new keyword u ile olusturabiliriz
        //Ancak java isimizi kolaylastirmak icin
        //String e de direk deger atanmasini saglamistir

        System.out.println(str1.equals(str2)); //true
        System.out.println(str1.equals(str3)); //false
        System.out.println(str1.equals(str4));//false
        System.out.println(str1.equals(str5));//false
        System.out.println(str1.equals(str6));//true

        /*
            equals() verilen iki String'in metin olarak ayni olup olmadigina bakar
            case sensitive'dir dolayisiyla buyuk kucuk harf farklarina dikkat edilmelidir
         */

        // String icin == kullanilamaz mi?

        System.out.println(str1==str2);// true
        System.out.println(str1==str3); // false
        System.out.println(str1==str4);
        System.out.println(str1==str6);// Ikisi de ayni sekilde yazilmis olmasina ragmen;


        /*      COK ONEMLI

            equals methodu sadece degerlere bakar.
            Metin ayni ise sonuc true,
            metin farkli ise sonuc false olur.

            == ise hem metin degerine hem de referansa bakar.
            Ilerde anlatacagimiz uzere java bazen ayni referanslari farkli objelere de verir.
            Bu konuyu detaylandiracagiz.

            SIMDILIK iki String in metin olarak ayni oldugunu
            kontrol etmek isterseniz equals methodu kullanmalisiniz.
            == i kullanmamalisiniz

             */

        /*
        equals methodu verilen iki String in metin olarak ayni olup olmadigina bakar
        Case sensitive dir. Dolayisiyla buyuk kucuk harf farklarina dikkat edilmelidir.

         */


    }
}
