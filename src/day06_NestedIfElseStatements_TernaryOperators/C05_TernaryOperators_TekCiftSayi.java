package day06_NestedIfElseStatements_TernaryOperators;

public class C05_TernaryOperators_TekCiftSayi {
    public static void main(String[] args) {
        int sayi = 14;

        //sayinin tek veya cift oldugunu yazdirin
        //basit yapilar icin ternary op. kullanilabilir


        if(sayi % 2 == 0){
            System.out.println("Verilen sayi cift sayidir");
        }else{
            System.out.println("Verilen sayi tek sayidir");
        }
        //Ternary operatorleri basit if-else cumlelerini daha kisa yazabilmek icin kullanilir.

        System.out.println(sayi % 2 == 0 ? "Verilen sayi cift sayidir" : "Verilen sayi tek sayidir");

        /*
        sart ? "sart dogru ise calismasini istedigin kodu yaz" : "sart yanlis ise calismasini istedigin kodu yaz"
         */
    }
}
