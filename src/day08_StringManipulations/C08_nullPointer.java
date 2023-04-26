package day08_StringManipulations;

public class C08_nullPointer {

    public static void main(String[] args) {

        /* String str;

        System.out.println(str);*/ // ==> icinde birsey olmadigi icin yazdiramiyoruz.

        // Ilerde kullanacagimiz birsey icin yer hazirlamak istiyoruz.
        // Onun icin bunu bos birakmak istiyoruz.Ama java hata veriyor.
        //Bundan kacinmak icin atama yapiyoruz.

        //  String str=null

        // null bir deger degildir sadece bir isaretcidir/pointer dir, bildirim yapar.
        // String in ici halen bostur.

        // Non primitive datalara deger atanmadigini isaret eder

        String str = null; //ici hala bos/Sadece bos oldugunu bildigimizi java ya bildirdik

        System.out.println(str);// Bunun faydasi uyari vermeyip kodun hatasiz calismaya devam etmesi

       /* str.concat("Ali"); Exception in thread "main" java.lang.NullPointerException
                             at day08_StringManipulations.C08_nullPointer.main(C08_nullPointer.java:26)
                             Bunun ici bos, dolayisiyla ekleme yapamazsin diyor*/

        /*
        System.out.println(str.length()); /*Exception in thread "main" java.lang.NullPointerException

                                     at day08_StringManipulations.C08_nullPointer.main(C08_nullPointer.java:30)

                                     //yok olan birseyin uzunlugu olculemez */





    }
}
