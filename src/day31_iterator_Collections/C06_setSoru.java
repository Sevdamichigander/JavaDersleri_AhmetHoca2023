package day31_iterator_Collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C06_setSoru {
    public static void main(String[] args) {
        //verilen bir array den tekrar eden elementleri silip
        //unique elementlerden olusan halini array e kaydedin

        Integer [] sayilar = {1,2,3,5,4,6,7,8,9,4,5,6,3}; //
        System.out.println(Arrays.toString(sayilar));
        // Set dublication a izin vermediginden bir set olusturup tum elementleri
        // set e ekleyelim


        Set<Integer> sayilarSeti = new HashSet<>();
        for (int each: sayilar
             ) {
            sayilarSeti.add(each);

        }
        System.out.println(sayilarSeti); //[1, 2, 3, 4, 5, 6, 7, 8, 9]

        // array i bu elementlerle guncelleyelim

        sayilar = new Integer[sayilarSeti.size()];

        int index = 0;

        for (int each:sayilarSeti
             ) {
            sayilar[index] = each;
            index++;

        }

        //Array in son hali
        System.out.println(Arrays.toString(sayilar)); // [1, 2, 3, 4, 5, 6, 7, 8, 9]

    }
}
