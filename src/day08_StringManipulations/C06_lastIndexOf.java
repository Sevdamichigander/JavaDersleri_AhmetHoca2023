package day08_StringManipulations;

public class C06_lastIndexOf {
    public static void main(String[] args) {
       // sondan baslayip arama yapiyor

/*
        String str = "Java cok faydali";

        System.out.println(str.lastIndexOf("a")); // 13 Aramaya sondan basladigi icin onune ilk gelen a nin index ini verdi.
        System.out.println(str.indexOf("a"));// 1 Aramaya onden basladigi icin onune ilk gelen a nin index ini verdi.

        System.out.println(str.lastIndexOf("i")); // 15
        System.out.println(str.lastIndexOf("a", 10)); // 10 ___aramaya 10 dan itibaren basliyor
        System.out.println(str.lastIndexOf("a", 12)); // 10 ___aramaya 12 den itibaren basliyor

        System.out.println(str.lastIndexOf("a", 2));//1
        System.out.println(str.lastIndexOf("a", 1));//1

        System.out.println(str.indexOf("o"));// 6
        System.out.println(str.lastIndexOf("o"));// 6

        System.out.println(str.indexOf("cok"));// 5
        System.out.println(str.lastIndexOf("cok"));// 5

        System.out.println(str.lastIndexOf('k')); // 7
        System.out.println(str.lastIndexOf('k')); // 7


        System.out.println("***********************************************************************");*/

        /*
        Verilen bir cumlede, istenen bir String icin
        asagidaki cumlelerden uygun olani yazdirin
        1- aradiginiz kelime cumlede 1 kere kullanilmis
        2- aradiginiz kelime cumlede 1 den fazla kullanilmis
        3- aradiginiz kelime cumlede hic kullanilmamis

         */


        String cumle = "Van hostur, Van li olmak guzeldir, Van da Akdamar adasi vardir.";
        String kelime = "adasi";

        int ilkIndex = cumle.indexOf(kelime);
        int sonIndex = cumle.lastIndexOf(kelime);

        if (ilkIndex == -1) System.out.println("3- aradiginiz kelime cumlede hic kullanilmamis");
        else if (ilkIndex==sonIndex) {
            System.out.println("2- aradiginiz kelime cumlede 1 kere kullanilmis");
        }
        else System.out.println("aradiginiz kelime cumlede 1 den fazla kullanilmis");
    }
}
