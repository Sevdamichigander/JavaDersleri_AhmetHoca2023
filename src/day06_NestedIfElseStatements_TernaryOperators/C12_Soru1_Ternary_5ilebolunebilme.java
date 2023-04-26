package day06_NestedIfElseStatements_TernaryOperators;

public class C12_Soru1_Ternary_5ilebolunebilme {
    public static void main(String[] args) {
          /*
        sart ? "sart dogru ise calismasini istedigin kodu yaz" : "sart yanlis ise calismasini istedigin kodu yaz"
         */

        /*
        Soru 1- Kullanicidan bir sayi isteyin, sayiyi kontrol edip 5 ile bolunebiliyorsa
                “Sayi 5’in tam kati” yazdirin
        */

        int sayi = 23;

        System.out.println((sayi % 5 == 0 ? "Sayi 5 in tam katidir" : " "));
    }
}
