package day31_iterator_Collections;

import java.util.HashSet;
import java.util.Set;

public class C05_set {
    public static void main(String[] args) {
        Set<String> sinifList = new HashSet<>();
        sinifList.add("Sara");
        sinifList.add("Sevda");

        System.out.println(sinifList); // [Sevda, Sara]

        sinifList.add("Sevda");
        System.out.println(sinifList); // [Sevda, Sara] 1. Sevda yi sildi 2. geldi


    }
}
