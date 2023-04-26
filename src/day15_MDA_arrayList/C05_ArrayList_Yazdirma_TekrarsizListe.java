package day15_MDA_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C05_ArrayList_Yazdirma_TekrarsizListe {
    public static void main(String[] args) {

        // Verilen bir array de ki elementleri yazdiralim

        List<String> isimler = new ArrayList<>();

        isimler.add("Ayse");
        isimler.add("Sevda");
        isimler.add("Isa");

        System.out.println(isimler); // [Ayse, Sevda, Isa]

        // Verilen bir array de ki elementleri yazdiralim
        //Ancak tekrar eden elementler varsa onlari sadece bir kere yazdirin

        int[] sayilar = {3, 5, 6, 7, 8, 3, 4, 5, 9, 6, 4, 8, 7, 2, 3};

        List<Integer> tekrarsizListe = new ArrayList<>();

        for (int i = 0; i < sayilar.length; i++) {

            if (!tekrarsizListe.contains(sayilar[i])) { // sayilar[i] ===> array de ki elementleri getirir
                tekrarsizListe.add(sayilar[i]);
            }
        }

        System.out.println(tekrarsizListe); // [3, 5, 6, 7, 8, 4, 9, 2]

    }
}
