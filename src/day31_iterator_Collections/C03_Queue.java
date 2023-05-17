package day31_iterator_Collections;

import java.util.LinkedList;
import java.util.Queue;

public class C03_Queue {
    public static void main(String[] args) {

        Queue<String> yemekSirasi = new LinkedList<>();
        yemekSirasi.add("Murat");
        yemekSirasi.add("Muhammed");

        //Murat ile Muhammed in arasina bir eleman ekleyelim
        // queue ozelliginden dolayi araya elaman eklenemez
        //remove da direk bastakini siler ve bize dondurur

        System.out.println(yemekSirasi);//[Murat, Muhammed]

        System.out.println(yemekSirasi.remove());//Murat
        System.out.println(yemekSirasi);//[Muhammed]

        yemekSirasi.add("Sevda");
        yemekSirasi.add("Veysel");
        yemekSirasi.add("Aysegul");
        System.out.println(yemekSirasi); // [Muhammed, Sevda, Veysel, Aysegul]
        System.out.println(yemekSirasi.poll()); //Muhammed
        System.out.println("poll dan sonra " + yemekSirasi);// poll dan sonra [Sevda, Veysel, Aysegul]

        Queue<String> liste2 = new LinkedList<>();
        // liste2.remove(); // NoSuchElementException ==== element olmadigi icin exception firlatiyor
        System.out.println(liste2.poll()); // null dondurur. gittim birsey yoktu der

        yemekSirasi.offer("Firdevs");
        System.out.println(yemekSirasi); //[Sevda, Veysel, Aysegul, Firdevs]

        // offer ==> eger kapasite sinirlamasi yoksa add ile ayni islevi yapar
        //                                      varsa eklemez

        System.out.println(yemekSirasi.peek()); // head i getiriyor ama silmiyor
                                                // Sevda
        System.out.println(yemekSirasi); // [Sevda, Veysel, Aysegul, Firdevs]
        System.out.println(liste2.peek()); // null ==> bos liste olursa null dondurur

        System.out.println(yemekSirasi.element()); // Sevda
        // System.out.println(liste2.element());//NoSuchElementException
        //  AMA liste bossa exception firlatir

    }
}
