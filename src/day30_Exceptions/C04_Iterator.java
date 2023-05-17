package day30_Exceptions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C04_Iterator {
    public static void main(String[] args) {
        List<Integer> sayilar = new ArrayList<>();

        sayilar.add(5);
        sayilar.add(12);
        sayilar.add(3);
        sayilar.add(9);

        System.out.println(sayilar); //[5, 12, 3, 9]

        // list'de ki tum elementleri 2 artirip yeni halini kaydedin

        for (int i = 0; i < sayilar.size(); i++) {
            sayilar.set(i, sayilar.get(i)+2);


        }
        System.out.println(sayilar); //  [7, 14, 5, 11]
        /*
        Java da farkli ozelliklere sahip
        birden fazla element barindirabilen cok sayida yapi vardir:
        Biz bugune kadar ==> array ve list gorduk.
        Goreceklerimiz:

         - collections(icinde linkedlist, queue, deque, Set)
        -  maps

        BU yapilarin hepsi index kullanmaz.


         */

        //Index kullanmadan listte ki elementleri 2 artirin
        for (int eachElement:sayilar
             ) {
            //System.out.print(eachElement + 2 + " ");//9 16 7 13
            // degerleri 2 artirip yazdirdik ama list degisti mi? HAYIR

            // for each kullanarak list in elementlerini 2 artirip kalici hale getirin

            eachElement+=2; // scope tan dolayi eachElement in yeni degeri bu scope ta kalir.

        }
        System.out.println(sayilar);

        Iterator itr= sayilar.iterator();
        /*
        itr.next();
        itr.remove();

        itr.next();
        itr.remove();

        itr.next();
        itr.remove();

        itr.next();
        itr.remove();
        */

        // 4 kere ayni kodu tekrar etmek yerine while loop yaptik

        while(itr.hasNext()){
            itr.next();
            itr.remove();
        }

        System.out.println(sayilar); //  []


        }
    }

