package day12_WhileLoop_DoWhileLoop_Scope;

public class C06_ClassLevelVariables {

    /*

        BIr class in tamaminda gecerli variablelar olusturmak istersek,
        bu variable lari class level da olustururuz.Yani class in icinde ama methodlarin disinda olustururuz.

        Bu variable larin en ustte olmasi sart degildir
        ancak genel kullanimda class level variable lar class in en ust kisminda olusturulur.

        class level variable lar static ve static olmayan (instance) seklinde
        iki farkli sekilde olusturulabilir.

        static variable lar static klubune uye olduklari icin
        tum methodlara gidebilir ve
        tum methodlardan kullanilabilirler.

        instance variable lar static olmadiklari icin
        karar verici olarak methodlar devreye girer.


         */



    static int sayi = 10; // static variable -- class level/ Eger bir variable static olarak isaretlenmisse o static tir.
                        // Static olarak isaretlenmemisse instance dir.

                        // Static variable, ayricalikli klup uyesi gibidir. CLASS icinde her yere gidebilir
    String str = "java";//instance variable -- class level


    public static void main(String[] args) {

        sayi = 40;
        //System.out.println(str); //  Non-static field 'str' cannot be referenced from a static context
        //(static olmayan bir variable static alandan kullanilamaz)

        sayi=20;
        System.out.println(sayi); // 20
        // System.out.println(str);
        // static olmayan bir variable, static alandan kullanilamaz

        // System.out.println(str); //  Non-static field 'str' cannot be referenced from a static context
        //(static olmayan bir variable static alandan kullanilamaz)
        sayi=30;
        // str= "tava";
        // static olmayan bir variable, static alandan kullanilamaz
    }
    public void staticOlmayanMethod(){

    sayi = 15;
        System.out.println("static olmayan method da sayi :" + sayi);
        str = "hava";
        // method static degil, variable da static degil, ikisi iyi anlasir. korler sagirlar birbirini agirlar
        sayi=40;
        System.out.println("static olmayan method da sayi : "+sayi);
        str = "hava";
        // method static degil, variable da static degil

    }
}
