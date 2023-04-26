package day20_PassByValue_Mutable_ImmutableClasses;

import java.util.ArrayList;
import java.util.List;

public class C03_ImmutableClasses {
    public static void main(String[] args) {

        String str = "Java candir";

        System.out.println(str.toUpperCase()); //JAVA CANDIR

        System.out.println(str); //Java candir

        str.toLowerCase();
        str.replace("a", "e");
        str.repeat(4);

        System.out.println(str);//Java candir

        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(4);
        sayilar.add(7);
        sayilar.add(5);

        System.out.println(sayilar);//[4, 7, 5]

        sayilar.set(0,10);
        System.out.println(sayilar);//[10, 7, 5]


    }
}
