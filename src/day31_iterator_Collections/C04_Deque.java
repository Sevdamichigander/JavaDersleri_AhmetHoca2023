package day31_iterator_Collections;

import java.util.Deque;
import java.util.LinkedList;

public class C04_Deque {
    public static void main(String[] args) {
        // double ended queue
        /*
        Genel olarak queue ozelliklerini gosterir ancak
        bastan ve sondan ekleme, cikarma gibi ozellikler olur

         */

        Deque<String> deq = new LinkedList<>();

        deq.add("Adnan");
        deq.addLast("Sevda");
        System.out.println(deq); // [Adnan, Sevda]

        deq.addFirst("Saida");
        System.out.println(deq); //[Saida, Adnan, Sevda]

        System.out.println(deq.removeLastOccurrence("Sevda")); // true ==> sildim diye true dondurdu
        System.out.println(deq); // [Saida, Adnan]
        System.out.println(deq.removeLastOccurrence("Sevda")); // false ==> yok, dolayisiyla silemedi ve false dondu
        // tek Sevda oldugu icin remove(Obj), removeFirstOccurence(Obj) veya lastOccurence(Obj) fark olmaz.

        System.out.println(deq.pop()); // removeFirst e benziyor --- ilk elementi siler ve bize dondurur
                                        //Saida
        System.out.println(deq); //[Adnan]

        Deque<String> bosDeque = new LinkedList<>();

        // System.out.println(bosDeque.removeFirst()); // NoSuchElementException
        // System.out.println(bosDeque.pop()); //NoSuchElementException

    }
}
