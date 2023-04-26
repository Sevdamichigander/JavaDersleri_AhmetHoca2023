package day16_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C01_ListOlusturmaveYazdirmaMethodu {
    public static void main(String[] args) {

       //olusturulan bir listeyi yazdiran bir method olusturma egzersizi


        List<String> isimler = new ArrayList<>();

        isimler.add("Ahmet");
        isimler.add("Murat");
        isimler.add("Muhammed");
        isimler.add("Safa");
        isimler.add("Erhan");

        // method call

        listeYazdirma(isimler); //[Ahmet, Murat, Muhammed, Safa, Erhan]

    }
    // sadece konsola yazi yazdirilacaksa void return type kullanilir

    public static void listeYazdirma(List<String> isimlerListesi){

        System.out.println(isimlerListesi);

    }
}
