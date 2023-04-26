package day11_MethodOverloading_WhileLoop;

public class C04_Ornek_MethodOverloading {
    public static void main(String[] args) {
          /*
    Java overloading yapilmis methodlardan hangisinin calisacagina karar verirken adim adim ilerler.
    1- eger argument ile parametreler tamamen uyumlu ise onu calistirir
    2- eger argument ve parametreler %100 uyumlu degilse casting yapabilir miyim diye bakar
        casting ile calistiracagi birden fazla method bulursa
        en az casting ile calistiracagini tercih eder == en ekonomik model

     */

        topla(4,5);
        topla('a','b');
        topla(3.2f ,5.1f);
    }
    public static void topla(double sayi1, double sayi2){
        System.out.println("Iki double'in toplami : " + (sayi1+sayi2));
    }
    public static void topla(int sayi1, float sayi2){
        System.out.println("int ve float'in toplami : " + (sayi1+sayi2));
    }
    public static void topla(float sayi1, float sayi2){
        System.out.println("Iki float'in toplami : " + (sayi1+sayi2));

    }

}
