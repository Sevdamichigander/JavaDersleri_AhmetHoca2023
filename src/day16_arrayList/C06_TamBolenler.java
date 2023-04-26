package day16_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C06_TamBolenler {
    public static void main(String[] args) {
        // girilen bir pozitif sayinin tam bolenlerini liste olarak bize donduren bir method yaziniz

        int sayi = 150;

        System.out.println(tamBolenlerListesi(sayi));//[1, 2, 3, 5, 6, 10, 15, 25, 30, 50, 75, 150]
    }
    //method sayilardan olusan bir liste dondurecek
    //ùethodun icine bir sayi gonderebilmeliyiz

    public static List<Integer> tamBolenlerListesi(Integer sayi) {

        List<Integer> tamBolenlerListesi = new ArrayList<>();

        for (int i = 1; i <= sayi; i++) {

            if (sayi % i == 0) {// bir sayiyi looptan gelen i degerine boldugumuzde kalan 0 ise
                tamBolenlerListesi.add(i);

            }
        }

        return tamBolenlerListesi;
    }
}
