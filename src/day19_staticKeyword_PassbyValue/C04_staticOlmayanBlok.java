package day19_staticKeyword_PassbyValue;

public class C04_staticOlmayanBlok {
    public static void main(String[] args) {

        System.out.println("main method calisti");// 1 kere calisir

        C04_staticOlmayanBlok obj1 = new C04_staticOlmayanBlok();
        C04_staticOlmayanBlok obj2 = new C04_staticOlmayanBlok();
        C04_staticOlmayanBlok obj3 = new C04_staticOlmayanBlok();
        C04_staticOlmayanBlok obj4 = new C04_staticOlmayanBlok();


    }

    static{
        System.out.println("static blok calisti");// 1 kere calisir

    }
    {
        // static olmayan kod blogu
         /*
            static olmayan kod bloklari objelere baglidir
            her obje olusturuldugunda statik olmayan blok tekrar calisir
            static blok ise sadece 1 kere class ilk calismaya basladiginda calisir
            obje olusturuldugunda constructor icinde yapmak istemediginiz
            ama obje icin ihtiyac duydugunuz bir islem varsa
            static olmayan blok kullanilabilir
         */

        System.out.println("static olmayan kod blogu calisti");// her obje kadar calisir ve olusur
    }
}
