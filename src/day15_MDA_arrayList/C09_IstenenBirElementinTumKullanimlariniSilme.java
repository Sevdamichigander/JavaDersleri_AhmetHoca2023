package day15_MDA_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C09_IstenenBirElementinTumKullanimlariniSilme {
    public static void main(String[] args) {

        int[] sayilar = {3, 5, 6, 7, 8, 3, 4, 5, 9, 6, 4, 8, 7, 2, 3};

        List<Integer> sayiList = new ArrayList<>();

        for (int i = 0; i < sayilar.length; i++) {
            sayiList.add(sayilar[i]);
        }
        System.out.println(sayiList);

        Integer silinecekElement = 5;

        while (sayiList.contains(silinecekElement)) {// listede 5 oldugu muddetce siliyor
            sayiList.remove(silinecekElement);

        }
        System.out.println(sayiList);
    }
}
