package day16_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C13_ListeOlusturmaveElemanEkleme {
    public static void main(String[] args) {


        List<String> isimListesi = new ArrayList<>();// listeyi olustururken eleman ekleyemiyoruz.
                                                    // sonrasinda tek tek eleman ekliyoruz

        isimListesi.add("Hasan");
        isimListesi.add("Ahmet");
        isimListesi.add("Mehmet");
        isimListesi.add("Ali");
        isimListesi.add("Gul");

        System.out.println(isimListesi); //[Hasan, Ahmet, Mehmet, Ali, Gul]

        /*
        Liste+elemanlarin turu + isim = new LinkedList();
         */



    }
}
