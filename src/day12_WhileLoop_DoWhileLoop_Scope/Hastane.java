package day12_WhileLoop_DoWhileLoop_Scope;

public class Hastane {

    // Static_InstanceVariable_Farki + Obje Olusturma

    static String hastaneIsmi = "Yildiz hastanesi";   // static _ hastane ismi tum objeler icin
                                                      // gecerli oldugundan bunu static yaptik.
    static int personelSayisi;// static __ herkes icin aynidir, degismez

    String personelIsmi;// instance ==> Bunlar objeden objeye nesneden nesneye degisecegi icin instance yaptik
    String personelAdresi;// instance
    String personelTelefonu;// instance


        /*
        Class level da olusturulan variable lar

        - eger tum nesneler icin ortak ise static olarak
        - her bir nesne icin farkli olacaksa instance olarak
            olusturulur.

            Bu hastanede 500 personel var ise 500 personel icin
            500 isim, 500 adres, 500 telefon variable i olmak zorundadir.

            Java bunu su sekilde cozmus:

            bu class tan bir obje olusturuldugunda
            java tum instance variable larin bir kopyasini olusturup
            o obje ile ilintilendirir.

            // fatmaHemsire.personelIsmi = "Fatma"; gibi

            Tum class level variable lar icin deger atama mecburiyeti yoktur.
            Eger deger atanirsa o deger gecerlidir.
            Ancak deger atanmazsa, java class level variable lar icin
            default olarak belirledigi degerleri atama yapar. ()Static ler icinde gecerlidir. Yani;

            sayisal variable : 0
            boolean : false
            char : hiclik
            non-primitive : null

         */


    public static void main(String[] args) {

        // obje nasil olusturulur

        System.out.println(hastaneIsmi); // Yildiz hastanesi
        // System.out.println(personelIsmi); // methodumuz static. Dolayisiyla belirleyici olan o.
                                            // "personelIsmi" static olmadigi icin bu methodun icinde kullanilamiyor
        System.out.println(personelSayisi); // 0

        Hastane ayseHemsire = new Hastane(); //ayseHemsire objesini olusturduk
        System.out.println(ayseHemsire.personelAdresi);

        // personelAdresi = "Cankaya"; ==> aslinda personelAdresi instance dir. Ve static method icinde kullanilamaz.
        // Ama static method icinde instance variable lari obje uzerinden kullanabiliriz
        // tek basina hicbir sey ifade etmezler. Onun icin ayseHemsire objesini ekleriz

        /*
       ayseHemsire objesini olusturunca,  java tum instance variable larin bir kopyasini olusturup
            o obje ile ilintilendirir.
         */

        ayseHemsire.personelAdresi = "Cankaya";
        ayseHemsire.personelIsmi = "Ayse";
        ayseHemsire.personelTelefonu = "3122354567";

        Hastane fatmaHemsire = new Hastane(); // fatmaHemsire objesi olusturduk. Ve asagidaki atamalari yaptik
        fatmaHemsire.personelIsmi = "Fatma";
        fatmaHemsire.personelAdresi = "Yenimahalle";
        fatmaHemsire.personelTelefonu = "5551232323";

        System.out.println(ayseHemsire.personelIsmi); // Ayse
        System.out.println(fatmaHemsire.personelIsmi); // Fatma

        // static variable'lara direk erisim mumkundur
        // Static variable bir tanedir ve class a baglidir

        System.out.println(hastaneIsmi); // Yildiz hastanesi
        System.out.println(personelSayisi); // 0

        // obje uzerinden de static variable'lara ULASILABILIR
        // ancak intelliJ buna gerek yok diyerek bizi uyarir

        System.out.println(ayseHemsire.hastaneIsmi); // accessed via instance reference
        // static olan hastane ismi variable'ina instance sekilde ulasildi diye uyari veriyor

        ayseHemsire.hastaneIsmi = "Levent Hastanesi";

        System.out.println(hastaneIsmi); // Levent Hastanesi
        System.out.println(fatmaHemsire.hastaneIsmi); // Levent Hastanesi


    }
}


