package day15_MDA_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C12_indexOf_lastIndexOf {
    public static void main(String[] args) {

        int[] sayilar = {3, 5, 6, 7, 8, 3, 4, 5, 9, 6, 4, 8, 7, 2, 3};

        List<Integer> sayiList = new ArrayList<>();

        for (int i = 0; i < sayilar.length; i++) {
            sayiList.add(sayilar[i]);
        }
        System.out.println(sayiList);//[3, 5, 6, 7, 8, 3, 4, 5, 9, 6, 4, 8, 7, 2, 3]

        System.out.println(sayiList.indexOf(5));//1 ==> ilk bulldugu besin indeksini yazdi
        System.out.println(sayiList.lastIndexOf((5)));// 7 sondan geriye buldugu ilk 5 in indexi
        System.out.println(sayiList.lastIndexOf((10)));// -1 olmayan elementte boyle donuyor


    }
}
