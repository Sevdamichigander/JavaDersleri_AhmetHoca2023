package day06_NestedIfElseStatements_TernaryOperators;

public class C06_Ternary {
    public static void main(String[] args) {
        //Verilen sayi + ise degerini 2 katina cikarin
        //degilse degerini 10 artirin

        int sayi = 10;
        // sayi>0 ? "2*sayi" : "sayi+10"
        // 1- burda ya bir variable a atama yapmaliyiz ya da yazdirmaliyiz
        // 2- ternary icinde kod yazamayiz

        sayi = sayi>0 ? 2*sayi : sayi+10 ;
        System.out.println(sayi);

        //sayi cift ise 2 katini yazdirin; tek sayi ise "sayi tek" yazdirin
        sayi++;
        System.out.println(sayi %2 == 0 ? 2*sayi : "sayi tek");

        /*
        Eger sartin saglanmasi veya saglanmamasi durumunda calisacak kodlar farkli data turlerinde ise o zaman atama yapamayiz.
        Cunku sonuc tek bir data turunden degil.
        Bu durumda ternary i sadece yazdirabiliriz
         */

        // sayi = sayi %2 == 0 ? 2*sayi : "sayi tek"
        // String str = sayi %2 == 0 ? 2*sayi : "sayi tek"

        // Ternary bize sonuc verir, bu sonucu ya direk yazdirmaliyiz veya variable'a atamaliyiz

    }
}
