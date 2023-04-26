package day19_staticKeyword_PassbyValue;

public class C03_staticBlok {


    static{

        System.out.println("en ustteki static blok");
    }
    public static void main(String[] args) {
        System.out.println("main method calisti");
    }

    static {

        System.out.println("statik blok calisti");

        // Static bloklar herseyden once calisir, main methoddan bile.
        /*
        Static bloklar class calismaya baslar baslamaz devreye girer
        tum diger kodlardan HATTA main method dan bile once calisirlar.

        Olur da main method calismadan once
        ayarlamamiz gereken bazi uyarlamalar varsa
        veya bazi variable lara baslangic degerini atamak istiyorsak
        static bloklar kullanilabilir.

        Lazimsa birden fazla olabilir. BIrden fazla static blok varsa
         yukaridan asagi dogru sirali olarak calistirilir.
         */
    }

    static {
        System.out.println("2. static blok calisti");
    }

}
