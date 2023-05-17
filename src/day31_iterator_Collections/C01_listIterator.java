package day31_iterator_Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C01_listIterator {

    public static void main(String[] args) {
        List<Integer> sayilar = new ArrayList<>();

        sayilar.add(5);
        sayilar.add(12);
        sayilar.add(3);
        sayilar.add(9);

        System.out.println(sayilar); //[5, 12, 3, 9]

        //index kullanmadan listenin tum elementlerine kalici olarak 2 ekleyin

        ListIterator lit = sayilar.listIterator();

        int sayi = 0;

        while (lit.hasNext()){

            sayi = (int) lit.next();
            lit.set(sayi+2);


        }

        System.out.println(sayilar);//[7, 14, 5, 11]

        // iterator kullanarak list i elementlerini sondan basa dogru yazdirin

        // yukaridaki islemden dolayi iterator en sonda

        while (lit.hasPrevious()){

                System.out.println(lit.previous() + " ");
            }
        /*
        Iterator u nerede birakirsak orada kalir.
         basta oldugundan emin olmak isterseniz
         ya yeni bir iterator olusturursunuz
         veya loop body si bos olan bir while ile en basa kadar gidersiniz.
         */


        /*
        Ornegin iterator i en sona goturelim
         */

        while (lit.hasNext()){
            lit.next();
        }
        System.out.println("\n" + lit.previousIndex());
        System.out.println(lit.nextIndex());
    }
}
