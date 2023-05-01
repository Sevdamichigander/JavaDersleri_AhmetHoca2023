package day22_StringBuilder_AccessModifier;

public class C04_AccessModifiers {

        public String marka;
        String model; // default tur. yazmaya java izin vermez

        /*
        Eger bir methodda veya class level daki bir variable da
        access modifier gorunmuyorsa
        o class uyesi icin default access modifier gecerlidir.

        default keyword :
        1- switch statement da default value
        2- class level da olusturulan variable lar icin default deger
        3- default constructor
        4- default access modifier


        *Access modifier ve static keyword beraber degerlendirilmelidir.
        -Class icerisinde dusundugumuzde static keyword bir method icerisinde,
        herhangi bir class uyesinin kullanilabilir olup olmadigini belirler.
        - baska class tan kullanimda ise static keyword erisim yontemini belirler.
        static class uyeleri classIsmi.staticUyeIsmi seklinde kullanilirken
        static olmayan class uyeleri icin obje olusturulmasi sarttir.

         */

    public static void method1(){
    }

    public void method2(){
    }

    void method3(){
    }


}
