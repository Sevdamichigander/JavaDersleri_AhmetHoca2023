package day31_iterator_Collections;

import java.util.LinkedList;
import java.util.List;

public class C02_List {
    public static void main(String[] args) {
        List<String> liste = new LinkedList<>();
        System.out.println("Bos liste hash code : " + liste.hashCode());

        liste.add("Esat");
        liste.add("Sevda");
        liste.add("Ilknur");
        liste.add("Seyma");

        System.out.println("4 elementten sonra hash code : " + liste.hashCode());

        System.out.println(liste); //[Esat, Sevda, Ilknur, Seyma]

        liste.add(2, "Nurhayat");
        System.out.println(liste); //[Esat, Sevda, Nurhayat, Ilknur, Seyma]

        System.out.println("5. elementten sonra hash code : " + liste.hashCode());

        List<String> liste2 = new LinkedList<>();

        liste2.add("Yusuf");
        liste2.add("Esat");
        liste2.add("Ilknur");
        liste2.add("Murat");


        System.out.println(liste2);    //[Yusuf, Esat, Ilknur, Murat]
        System.out.println(liste.retainAll(liste2)); //kesisen eleman var mi ==> true
        System.out.println("Listenin retain den sonraki hali : " + liste); // [Esat, Ilknur]

        // ortak elemanlar kalir, digerlerini siler

        /*
        ArrayList array altyapisini kullanir
        LinkedList ==> linked altyapisini kullanir
         */


    }
}
